package com.mebigfatguy.opstack.samples;

import java.util.ArrayList;
import java.util.List;

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

	@ExpectOpcode(Opcodes.DCONST_0)
	@ExpectOpcode(Opcodes.DSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testDConst0() {
		double d = 0.0;
	}

	@ExpectOpcode(Opcodes.DCONST_1)
	@ExpectOpcode(Opcodes.DSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testDConst1() {
		double d = 1.0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.IALOAD)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIALoad(int[] ia) {
		int i = ia[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.LALOAD)
	@ExpectOpcode(Opcodes.LSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testLALoad(long[] la) {
		long l = la[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.FALOAD)
	@ExpectOpcode(Opcodes.FSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testFALoad(float[] fa) {
		float l = fa[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.DALOAD)
	@ExpectOpcode(Opcodes.DSTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testDALoad(double[] da) {
		double d = da[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.AALOAD)
	@ExpectOpcode(Opcodes.ASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testAALoad(Object[] aa) {
		Object o = aa[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.BALOAD)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testBALoad(byte[] ba) {
		byte b = ba[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.CALOAD)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testCALoad(char[] ca) {
		char c = ca[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.SALOAD)
	@ExpectOpcode(Opcodes.ISTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testSALoad(short[] sa) {
		short s = sa[0];
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.IASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testIAStore(int[] ia) {
		ia[0] = 0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.LCONST_0)
	@ExpectOpcode(Opcodes.LASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testLAStore(long[] la) {
		la[0] = 0L;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.FCONST_0)
	@ExpectOpcode(Opcodes.FASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testFAStore(float[] fa) {
		fa[0] = 0.0F;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.DCONST_0)
	@ExpectOpcode(Opcodes.DASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testDAStore(double[] da) {
		da[0] = 0.0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ACONST_NULL)
	@ExpectOpcode(Opcodes.AASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testAAStore(Object[] aa) {
		aa[0] = null;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.BASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testBAStore(byte[] ba) {
		ba[0] = 0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.CASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testCAStore(char[] ca) {
		ca[0] = 0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.SASTORE)
	@ExpectOpcode(Opcodes.RETURN)
	public void testSAStore(short[] sa) {
		sa[0] = 0;
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.INVOKEVIRTUAL)
	@ExpectOpcode(Opcodes.POP)
	@ExpectOpcode(Opcodes.RETURN)
	public void testPop(String s) {
		s.toString();
	}

	@ExpectOpcode(Opcodes.ALOAD)
	@ExpectOpcode(Opcodes.INVOKEVIRTUAL)
	@ExpectOpcode(Opcodes.POP2)
	@ExpectOpcode(Opcodes.RETURN)
	public void testPop(Long l) {
		l.longValue();
	}

	@ExpectOpcode(Opcodes.NEW)
	@ExpectOpcode(Opcodes.DUP)
	@ExpectOpcode(Opcodes.ICONST_0)
	@ExpectOpcode(Opcodes.INVOKESPECIAL)
	@ExpectOpcode(Opcodes.ARETURN)
	public List<String> testDup() {
		return new ArrayList<>(0);
	}

	// DUP, DUP_X1, DUP_X2, DUP2, DUP2_X1, DUP2_X2, SWAP,

}
