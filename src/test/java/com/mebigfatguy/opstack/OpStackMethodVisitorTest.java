package com.mebigfatguy.opstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.objectweb.asm.ClassReader;

import com.mebigfatguy.opstack.visitors.OSTestClassVisitor;
import com.mebigfatguy.opstack.visitors.OSTestMethodVisitor;

public class OpStackMethodVisitorTest {

	private double d;

	@Test
	public void testVisitor() throws IOException, ClassNotFoundException {

		List<Class<?>> classes = findClassesFromPackage("com.mebigfatguy.opstack.samples");

		for (Class clz : classes) {
			try (InputStream is = OpStackMethodVisitorTest.class
					.getResourceAsStream("/" + clz.getName().replace('.', '/') + ".class")) {
				ClassReader cr = new ClassReader(is);
				OSTestMethodVisitor mv = new OSTestMethodVisitor();
				OSTestClassVisitor cv = new OSTestClassVisitor(mv);
				cr.accept(cv, ClassReader.SKIP_FRAMES);
			}
		}
	}

	public List<Class<?>> findClassesFromPackage(String packageName) throws ClassNotFoundException, IOException {
		class InternalException extends RuntimeException {
			public InternalException(String message, Exception originalException) {
				super(message, originalException);
			}
		}

		try (InputStream stream = ClassLoader.getSystemClassLoader()
				.getResourceAsStream(packageName.replaceAll("[.]", "/"));
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
			return reader.lines().filter(fileName -> fileName.endsWith(".class")).map(fileName -> {
				try {
					return Class.forName(packageName + "." + fileName.substring(0, fileName.lastIndexOf('.')));
				} catch (ClassNotFoundException e) {
					throw new InternalException("Class not found " + packageName + "." + fileName, e);
				}
			}).collect(Collectors.toList());
		} catch (InternalException e) {
			throw (ClassNotFoundException) e.getCause();
		}
	}

}
