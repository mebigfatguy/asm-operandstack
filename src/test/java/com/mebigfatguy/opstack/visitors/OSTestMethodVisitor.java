package com.mebigfatguy.opstack.visitors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.sisu.space.asm.Opcodes;
import org.junit.jupiter.api.Assertions;

import com.mebigfatguy.opstack.OpStackMethodVisitor;

public class OSTestMethodVisitor extends OpStackMethodVisitor {

	private Map<Integer, Integer> seen = new HashMap<>();

	@Override
	public void visitInsn(int opcode) {
		super.visitInsn(opcode);
		incr(opcode);
	}

	@Override
	public void visitEnd() {
		super.visitEnd();
		Assertions.assertTrue(getStack().isEmpty(), "parsing of " + methodName + " does not clear the op stack");

		Assertions.assertTrue(seen.get(Opcodes.ACONST_NULL) > 0);
	}

	private void incr(int opcode) {
		Integer cnt = seen.get(opcode);
		if (cnt == null) {
			cnt = 0;
		}
		cnt++;
		seen.put(opcode, cnt);
	}

	public int seen(int opcode) {
		Integer cnt = seen.get(opcode);
		if (cnt != null) {
			return cnt;
		}

		return 0;
	}
}
