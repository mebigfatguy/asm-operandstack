package com.mebigfatguy.opstack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.objectweb.asm.Opcodes;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExpectOpcodes.class)
public @interface ExpectOpcode {
	int value() default Opcodes.NOP;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExpectOpcodes {
	ExpectOpcode[] value();
}
