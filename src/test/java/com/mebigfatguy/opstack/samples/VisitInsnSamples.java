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
	@ExpectOpcode(Opcodes.ASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testConstM1() {
		int i = -1;
	}

}
