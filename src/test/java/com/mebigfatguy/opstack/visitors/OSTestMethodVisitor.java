package com.mebigfatguy.opstack.visitors;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.objectweb.asm.AnnotationVisitor;

import com.mebigfatguy.opstack.OpStackMethodVisitor;

public class OSTestMethodVisitor extends OpStackMethodVisitor implements ExpectNotifier {

	private Map<Integer, Integer> seen = new HashMap<>();

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
	public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {

		return new OSTestAnnotationVisitor(this);
	}

	@Override
	public void visitEnd() {
		super.visitEnd();
		Assertions.assertTrue(getStack().isEmpty(), "parsing of " + methodName + " does not clear the op stack");

		for (Map.Entry<Integer, Integer> entry : seen.entrySet()) {
			Assertions.assertTrue(entry.getValue() > 0, "Opcode " + entry.getKey() + " was expected to be seen.");
		}
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
