package com.cabir.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE})
@StringDef({LayerAnnotation.Activation, LayerAnnotation.Linear })
public @interface LayerAnnotation {
    String Activation = "Activation";
    String Linear = "Linear";
    String type() default "";
}