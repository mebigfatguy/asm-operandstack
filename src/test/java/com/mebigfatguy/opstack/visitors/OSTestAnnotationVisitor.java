package com.mebigfatguy.opstack.visitors;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Opcodes;

public class OSTestAnnotationVisitor extends AnnotationVisitor {

	private ExpectNotifier notifier;

	public OSTestAnnotationVisitor(ExpectNotifier notifier) {
		super(Opcodes.ASM9);
		this.notifier = notifier;
	}

	@Override
	public AnnotationVisitor visitAnnotation(String name, String descriptor) {
		return this;
	}

	@Override
	public AnnotationVisitor visitArray(String name) {
		return this;
	}

	@Override
	public void visit(String name, Object value) {
		if ("value".equals(name)) {
			notifier.expect(((Integer) value).intValue());
		}
	}
}
