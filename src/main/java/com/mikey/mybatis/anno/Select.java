package com.mikey.mybatis.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 17:20
 * @Describe：Select注解
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    /**
     * SQL
     * @return
     */
    public String value();
}
