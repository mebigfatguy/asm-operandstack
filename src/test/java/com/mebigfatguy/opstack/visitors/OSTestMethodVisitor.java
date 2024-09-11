package com.mebigfatguy.opstack.visitors;

import org.junit.jupiter.api.Assertions;

import com.mebigfatguy.opstack.OpStackMethodVisitor;

public class OSTestMethodVisitor extends OpStackMethodVisitor {

	@Override
	public void visitEnd() {
		super.visitEnd();
		Assertions.assertTrue(getStack().isEmpty(), "parsing of " + methodName + " does not clear the op stack");
	}
}
