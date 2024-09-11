package com.mebigfatguy.opstack;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;

import com.mebigfatguy.opstack.visitors.OSTestClassVisitor;
import com.mebigfatguy.opstack.visitors.OSTestMethodVisitor;

public class OpStackMethodVisitorTest {

	private double d;

	@Test
	public void testVisitor() throws IOException {

		try (InputStream is = OpStackMethodVisitorTest.class
				.getResourceAsStream("/" + OpStackMethodVisitorTest.class.getName().replace('.', '/') + ".class")) {
			ClassReader cr = new ClassReader(is);
			OSTestMethodVisitor mv = new OSTestMethodVisitor();
			OSTestClassVisitor cv = new OSTestClassVisitor(mv);
			cr.accept(cv, ClassReader.SKIP_FRAMES);
		}
	}

	private int sampleConstantReturn() {
		return 1;
	}

	private int sampleParamAdditionReturn(int i, int j) {
		return i + j;
	}

	private void sampleIncrementField(double dd) {
		d += dd;
	}
}
