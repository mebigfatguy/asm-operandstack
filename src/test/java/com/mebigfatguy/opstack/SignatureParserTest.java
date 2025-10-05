package com.mebigfatguy.opstack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.mebigfatguy.opstack.SignatureParser.MethodSignature;

public class SignatureParserTest {

	@Test
	public void testNoArgPrimitiveSignature() {

		MethodSignature ms = SignatureParser.parseMethodSignature("()I");
		Assertions.assertEquals("I", ms.getReturnType());
		Assertions.assertEquals(0, ms.getMethodParameters().size());
	}

	@Test
	public void testSimplePrimitiveSignature() {

		MethodSignature ms = SignatureParser.parseMethodSignature("(I)I");
		Assertions.assertEquals("I", ms.getReturnType());
		Assertions.assertEquals("I", ms.getMethodParameters().get(0));
	}

	@Test
	public void testComplexPrimitiveSignature() {

		MethodSignature ms = SignatureParser.parseMethodSignature("(IJFDBCD)V");
		Assertions.assertEquals("V", ms.getReturnType());
		Assertions.assertEquals("I", ms.getMethodParameters().get(0));
		Assertions.assertEquals("J", ms.getMethodParameters().get(1));
		Assertions.assertEquals("F", ms.getMethodParameters().get(2));
		Assertions.assertEquals("D", ms.getMethodParameters().get(3));
		Assertions.assertEquals("B", ms.getMethodParameters().get(4));
		Assertions.assertEquals("C", ms.getMethodParameters().get(5));
		Assertions.assertEquals("D", ms.getMethodParameters().get(6));
	}

	@Test
	public void testSimpleObjectSignature() {
		MethodSignature ms = SignatureParser.parseMethodSignature("(Ljava/lang/Object;)Ljava/lang/String;");
		Assertions.assertEquals("Ljava/lang/String;", ms.getReturnType());
		Assertions.assertEquals("Ljava/lang/Object;", ms.getMethodParameters().get(0));
	}

	@Test
	public void testComplexObjectSignature() {
		MethodSignature ms = SignatureParser
				.parseMethodSignature("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;)Ljava/lang/String;");
		Assertions.assertEquals("Ljava/lang/String;", ms.getReturnType());
		Assertions.assertEquals("Ljava/lang/Object;", ms.getMethodParameters().get(0));
		Assertions.assertEquals("Ljava/lang/String;", ms.getMethodParameters().get(1));
		Assertions.assertEquals("Ljava/lang/Double;", ms.getMethodParameters().get(2));
	}

	@Test
	public void testSimpleArraySignature() {
		MethodSignature ms = SignatureParser.parseMethodSignature("([I)[Ljava/lang/String;");
		Assertions.assertEquals("[Ljava/lang/String;", ms.getReturnType());
		Assertions.assertEquals("[I", ms.getMethodParameters().get(0));
	}

	@Test
	public void testComplexArraySignature() {
		MethodSignature ms = SignatureParser.parseMethodSignature("([[[I[[Ljava/lang/Object;)[[[Ljava/lang/String;");
		Assertions.assertEquals("[[[Ljava/lang/String;", ms.getReturnType());
		Assertions.assertEquals("[[[I", ms.getMethodParameters().get(0));
		Assertions.assertEquals("[[Ljava/lang/Object;", ms.getMethodParameters().get(1));
	}

}
