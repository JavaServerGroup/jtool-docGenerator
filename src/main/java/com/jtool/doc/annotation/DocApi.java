package com.jtool.doc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DocApi {
	String name();
	double chapter();
	String description() default "";
	String host() default "host(get from initialization)";
	String forWho() default "default";
}
