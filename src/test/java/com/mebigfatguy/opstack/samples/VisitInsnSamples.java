package com.mebigfatguy.opstack.samples;

import org.objectweb.asm.Opcodes;

import com.mebigfatguy.opstack.ExpectOpcode;

/**
 * Has samples of
 * 
 * NOP, ACONST_NULL, ICONST_M1, ICONST_0, ICONST_1, ICONST_2, ICONST_3,
 * ICONST_4, ICONST_5, LCONST_0, LCONST_1, F CONST_0, FCONST_1, FCONST_2,
 * DCONST_0, DCONST_1, IALOAD, LALOAD, FALOAD, DALOAD, AALOAD, BALOAD, CALOAD,
 * SALOAD, IASTORE, LASTORE, FASTORE, DASTORE, AASTORE, BASTORE, CASTORE,
 * SASTORE, POP, POP2, DUP, DUP_X1, DUP_X2, DUP2, DUP2_X1, DUP2_X2, SWAP, IADD,
 * LADD, FADD, DADD, ISUB, LSUB, FSUB, DSUB, IMUL, LMUL, FMUL, DMUL, IDIV, LDIV,
 * FDIV, DDIV, IREM, LREM, FREM, DREM, INEG, LNEG, FNEG, DNEG, ISHL, LSHL, ISHR,
 * LSHR, IUSHR, LUSHR, IAND, LAND, IOR, LOR, IXOR, LXOR, I2L, I2F, I2D, L2I,
 * L2F, L2D, F2I, F2L, F2D, D2I, D2L, D2F, I2B, I2C, I2S, LCMP, FCMPL, FCMPG,
 * DCMPL, DCMPG, IRETURN, LRETURN, FRETURN, DRETURN, ARETURN, RETURN,
 * ARRAYLENGTH, ATHROW, MONITORENTER, and MONITOREXIT.
 */
public class VisitInsnSamples {

	private VisitInsnSamples() {
	}

	@ExpectOpcode(Opcodes.ACONST_NULL)
	@ExpectOpcode(Opcodes.ASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testAConstNull() {
		String s = null;
	}

	@ExpectOpcode(Opcodes.ICONST_M1)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testConstM1() {
		int i = -1;
	}

	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst0() {
		int i = 0;
	}

	@ExpectOpcode(Opcodes.ICONST_1)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst1() {
		int i = 1;
	}

	@ExpectOpcode(Opcodes.ICONST_2)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst2() {
		int i = 2;
	}

	@ExpectOpcode(Opcodes.ICONST_3)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst3() {
		int i = 3;
	}

	@ExpectOpcode(Opcodes.ICONST_4)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst4() {
		int i = 4;
	}

	@ExpectOpcode(Opcodes.ICONST_5)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIConst5() {
		int i = 5;
	}

	@ExpectOpcode(Opcodes.LCONST_0)
	@ExpectOpcode(Opcodes.LSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testLConst0() {
		long l = 0L;
	}

	@ExpectOpcode(Opcodes.LCONST_1)
	@ExpectOpcode(Opcodes.LSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testConst1() {
		long l = 1L;
	}

	@ExpectOpcode(Opcodes.FCONST_0)
	@ExpectOpcode(Opcodes.FSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testFConst0() {
		float f = 0.0f;
	}

	@ExpectOpcode(Opcodes.FCONST_1)
	@ExpectOpcode(Opcodes.FSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testFConst1() {
		float f = 1.0f;
	}

	@ExpectOpcode(Opcodes.FCONST_2)
	@ExpectOpcode(Opcodes.FSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testFConst2() {
		float f = 2.0f;
	}

}
