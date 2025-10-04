package com.mebigfatguy.opstack.visitors;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.objectweb.asm.AnnotationVisitor;

import com.mebigfatguy.opstack.OpStackMethodVisitor;

public class OSTestMethodVisitor extends OpStackMethodVisitor implements ExpectNotifier {

	private Map<Integer, Integer> seen = new HashMap<>();
	private OSTestAnnotationVisitor annotationVisitor = new OSTestAnnotationVisitor(this);

	@Override
	public void setMethodName(String name) {
		super.setMethodName(name);
		seen.clear();
	}

	@Override
	public void visitInsn(int opcode) {
		super.visitInsn(opcode);
		incr(opcode);
	}

	@Override
	public void visitVarInsn(int opcode, int varIndex) {
		super.visitVarInsn(opcode, varIndex);
		incr(opcode);
	}

	@Override
	public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
		super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
		incr(opcode);
	}

	@Override
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
		return annotationVisitor;
	}

	@Override
	public void visitEnd() {
		super.visitEnd();

		for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
			Assertions.assertTrue(entry.getValue() > 0,
					"Parsing " + methodName + ", Opcode " + entry.getKey() + " was expected to be seen.");
		}

		Assertions.assertTrue(getStack().isEmpty(),
				"parsing of " + methodName + " does not clear the op stack: " + opStack);

	}

	@Override
	public void expect(int opcode) {
		Integer cnt = seen.get(opcode);
		if (cnt == null) {
			cnt = 0;
		}
		seen.put(opcode, cnt);
	}

	public void incr(int opcode) {
		Integer cnt = seen.get(opcode);
		if (cnt == null) {
			cnt = 0;
		}
		cnt++;
		seen.put(opcode, cnt);
	}
}
