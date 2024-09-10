package com.mebigfatguy.opstack;

import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class OpStackMethodVisitor extends MethodVisitor {

	OpStack opStack = new OpStack();

	public OpStackMethodVisitor() {
		super(Opcodes.ASM9);
	}

	@Override
	public void visitParameter(String name, int access) {
		super.visitParameter(name, access);
	}

	@Override
	public void visitCode() {
		super.visitCode();
	}

	@Override
	public void visitInsn(int opcode) {

		switch (opcode) {
		case Opcodes.NOP:
			break;
		case Opcodes.ACONST_NULL:
			opStack.push(Operand.builder().withValue(null).build());
			break;
		case Opcodes.ICONST_M1:
			opStack.push(Operand.builder().withValue(-1).withType("I").build());
			break;
		case Opcodes.ICONST_0:
			opStack.push(Operand.builder().withValue(0).withType("I").build());
			break;
		case Opcodes.ICONST_1:
			opStack.push(Operand.builder().withValue(1).withType("I").build());
			break;
		case Opcodes.ICONST_2:
			opStack.push(Operand.builder().withValue(2).withType("I").build());
			break;
		case Opcodes.ICONST_3:
			opStack.push(Operand.builder().withValue(3).withType("I").build());
			break;
		case Opcodes.ICONST_4:
			opStack.push(Operand.builder().withValue(4).withType("I").build());
			break;
		case Opcodes.ICONST_5:
			opStack.push(Operand.builder().withValue(5).withType("I").build());
			break;
		case Opcodes.LCONST_0:
			opStack.push(Operand.builder().withValue(0).withType("J").build());
			break;
		case Opcodes.LCONST_1:
			opStack.push(Operand.builder().withValue(1).withType("J").build());
			break;
		case Opcodes.FCONST_0:
			opStack.push(Operand.builder().withValue(0.0f).withType("F").build());
			break;
		case Opcodes.FCONST_1:
			opStack.push(Operand.builder().withValue(1.0f).withType("F").build());
			break;
		case Opcodes.FCONST_2:
			opStack.push(Operand.builder().withValue(2.0f).withType("F").build());
			break;
		case Opcodes.DCONST_0:
			opStack.push(Operand.builder().withValue(0.0).withType("D").build());
			break;
		case Opcodes.DCONST_1:
			opStack.push(Operand.builder().withValue(1).withType("D").build());
			break;
		case Opcodes.IALOAD:
			opStack.push(Operand.builder().withType("I").build());
			break;
		case Opcodes.LALOAD:
			opStack.push(Operand.builder().withType("J").build());
			break;
		case Opcodes.FALOAD:
			opStack.push(Operand.builder().withType("F").build());
			break;
		case Opcodes.DALOAD:
			opStack.push(Operand.builder().withType("D").build());
			break;
		case Opcodes.AALOAD:
			break;
		case Opcodes.BALOAD:
			opStack.push(Operand.builder().withType("B").build());
			break;
		case Opcodes.CALOAD:
			opStack.push(Operand.builder().withType("C").build());
			break;
		case Opcodes.SALOAD:
			opStack.push(Operand.builder().withType("Ljava/lang/String;").build());
			break;
		case Opcodes.IASTORE:
			opStack.pop2();
			break;
		case Opcodes.LASTORE:
			opStack.pop2();
			break;
		case Opcodes.FASTORE:
			opStack.pop2();
			break;
		case Opcodes.DASTORE:
			opStack.pop2();
			break;
		case Opcodes.AASTORE:
			opStack.pop2();
			break;
		case Opcodes.BASTORE:
			opStack.pop2();
			break;
		case Opcodes.CASTORE:
			opStack.pop2();
			break;
		case Opcodes.SASTORE:
			opStack.pop2();
			break;
		case Opcodes.POP:
			opStack.pop();
			break;
		case Opcodes.POP2:
			opStack.pop2();
			break;
		case Opcodes.DUP:
			opStack.dup();
			break;
		case Opcodes.DUP_X1:
			break;
		case Opcodes.DUP_X2:
			break;
		case Opcodes.DUP2:
			break;
		case Opcodes.DUP2_X1:
			break;
		case Opcodes.DUP2_X2:
			break;
		case Opcodes.SWAP:
			break;
		case Opcodes.IADD:
			Operand op1 = opStack.pop();
			Operand op2 = opStack.pop();
			// possible value push
			opStack.push(Operand.builder().withType("I").build());
			break;
		case Opcodes.LADD:
			break;
		case Opcodes.FADD:
			break;
		case Opcodes.DADD:
			break;
		case Opcodes.ISUB:
			break;
		case Opcodes.LSUB:
			break;
		case Opcodes.FSUB:
			break;
		case Opcodes.DSUB:
			break;
		case Opcodes.IMUL:
			break;
		case Opcodes.LMUL:
			break;
		case Opcodes.FMUL:
			break;
		case Opcodes.DMUL:
			break;
		case Opcodes.IDIV:
			break;
		case Opcodes.LDIV:
			break;
		case Opcodes.FDIV:
			break;
		case Opcodes.DDIV:
			break;
		case Opcodes.IREM:
			break;
		case Opcodes.LREM:
			break;
		case Opcodes.FREM:
			break;
		case Opcodes.DREM:
			break;
		case Opcodes.INEG:
			break;
		case Opcodes.LNEG:
			break;
		case Opcodes.FNEG:
			break;
		case Opcodes.DNEG:
			break;
		case Opcodes.ISHL:
			break;
		case Opcodes.LSHL:
			break;
		case Opcodes.ISHR:
			break;
		case Opcodes.LSHR:
			break;
		case Opcodes.IUSHR:
			break;
		case Opcodes.LUSHR:
			break;
		case Opcodes.IAND:
			break;
		case Opcodes.LAND:
			break;
		case Opcodes.IOR:
			break;
		case Opcodes.LOR:
			break;
		case Opcodes.IXOR:
			break;
		case Opcodes.LXOR:
			break;
		case Opcodes.I2L:
			break;
		case Opcodes.I2F:
			break;
		case Opcodes.I2D:
			break;
		case Opcodes.L2I:
			break;
		case Opcodes.L2F:
			break;
		case Opcodes.L2D:
			break;
		case Opcodes.F2I:
			break;
		case Opcodes.F2L:
			break;
		case Opcodes.F2D:
			break;
		case Opcodes.D2I:
			break;
		case Opcodes.D2L:
			break;
		case Opcodes.D2F:
			break;
		case Opcodes.I2B:
			break;
		case Opcodes.I2C:
			break;
		case Opcodes.I2S:
			break;
		case Opcodes.LCMP:
			break;
		case Opcodes.FCMPL:
			break;
		case Opcodes.FCMPG:
			break;
		case Opcodes.DCMPL:
			break;
		case Opcodes.DCMPG:
			break;
		case Opcodes.IRETURN:
			opStack.pop();
			break;
		case Opcodes.LRETURN:
			opStack.pop();
			break;
		case Opcodes.FRETURN:
			opStack.pop();
			break;
		case Opcodes.DRETURN:
			opStack.pop();
			break;
		case Opcodes.ARETURN:
			opStack.pop();
			break;
		case Opcodes.RETURN:
			break;
		case Opcodes.ARRAYLENGTH:
			opStack.pop();
			opStack.push(Operand.builder().withType("I").build());
			break;
		case Opcodes.ATHROW:
			opStack.pop();
			break;
		case Opcodes.MONITORENTER:
			break;
		case Opcodes.MONITOREXIT:
			break;
		}

		super.visitInsn(opcode);
	}

	@Override
	public void visitIntInsn(int opcode, int operand) {
		super.visitIntInsn(opcode, operand);
	}

	@Override
	public void visitVarInsn(int opcode, int varIndex) {

		switch (opcode) {
		case Opcodes.ILOAD:
			opStack.push(Operand.builder().withType("I").fromRegister(varIndex).build());
			break;
		case Opcodes.LLOAD:
			opStack.push(Operand.builder().withType("J").fromRegister(varIndex).build());
			break;
		case Opcodes.FLOAD:
			opStack.push(Operand.builder().withType("F").fromRegister(varIndex).build());
			break;
		case Opcodes.DLOAD:
			opStack.push(Operand.builder().withType("D").fromRegister(varIndex).build());
			break;
		case Opcodes.ALOAD:
			opStack.push(Operand.builder().withType("D").fromRegister(varIndex).build());
			break;
		case Opcodes.ISTORE: {
			Operand o = opStack.pop();
			Operand v = opStack.pop();
			// store register variable
			break;
		}
		case Opcodes.LSTORE: {
			Operand o = opStack.pop();
			Operand v = opStack.pop();
			// store register variable
			break;
		}
		case Opcodes.FSTORE: {
			Operand o = opStack.pop();
			Operand v = opStack.pop();
			// store register variable
			break;
		}
		case Opcodes.DSTORE: {
			Operand o = opStack.pop();
			Operand v = opStack.pop();
			// store register variable
			break;
		}
		case Opcodes.ASTORE: {
			Operand o = opStack.pop();
			Operand v = opStack.pop();
			// store register variable
			break;
		}
		case Opcodes.RET:
			break;
		}

		super.visitVarInsn(opcode, varIndex);
	}

	@Override
	public void visitTypeInsn(int opcode, String type) {
		super.visitTypeInsn(opcode, type);
	}

	@Override
	public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
		super.visitFieldInsn(opcode, owner, name, descriptor);
	}

	@Override
	public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
		super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
	}

	@Override
	public void visitInvokeDynamicInsn(String name, String descriptor, Handle bootstrapMethodHandle,
			Object... bootstrapMethodArguments) {
		super.visitInvokeDynamicInsn(name, descriptor, bootstrapMethodHandle, bootstrapMethodArguments);
	}

	@Override
	public void visitJumpInsn(int opcode, Label label) {
		super.visitJumpInsn(opcode, label);
	}

	@Override
	public void visitLabel(Label label) {
		super.visitLabel(label);
	}

	@Override
	public void visitLdcInsn(Object value) {
		super.visitLdcInsn(value);
	}

	@Override
	public void visitIincInsn(int varIndex, int increment) {
		super.visitIincInsn(varIndex, increment);
	}

	@Override
	public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
		super.visitTableSwitchInsn(min, max, dflt, labels);
	}

	@Override
	public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
		super.visitLookupSwitchInsn(dflt, keys, labels);
	}

	@Override
	public void visitMultiANewArrayInsn(String descriptor, int numDimensions) {
		super.visitMultiANewArrayInsn(descriptor, numDimensions);
	}

	@Override
	public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {
		super.visitTryCatchBlock(start, end, handler, type);
	}

	@Override
	public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end,
			int index) {
		super.visitLocalVariable(name, descriptor, signature, start, end, index);
	}

	@Override
	public void visitEnd() {
		super.visitEnd();
	}

	public void clear() {
		opStack.clear();
	}

	public OpStack getStack() {
		return opStack;
	}
}
