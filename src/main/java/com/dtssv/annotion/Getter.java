package com.dtssv.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhao on 2018/4/5.
 */
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.SOURCE)
public @interface Getter {
}
