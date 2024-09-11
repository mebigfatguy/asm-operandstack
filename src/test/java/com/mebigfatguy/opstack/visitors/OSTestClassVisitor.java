package com.mebigfatguy.opstack.visitors;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import com.mebigfatguy.opstack.OpStackMethodVisitor;

public class OSTestClassVisitor extends ClassVisitor {

	private OpStackMethodVisitor methodVisitor;

	public OSTestClassVisitor(OpStackMethodVisitor v) {
		super(Opcodes.ASM9);
		methodVisitor = v;
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
			String[] exceptions) {
		if (name.startsWith("sample")) {
			methodVisitor.setMethodName(name);
			return methodVisitor;
		}

		return null;
	}
}
