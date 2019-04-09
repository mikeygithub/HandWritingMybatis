package com.mikey.mybatis.core;

import java.lang.reflect.Proxy;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-09 19:36
 * @Describe：获取SqlSession对象
 **/
public class SqlSession {
    /**
     * @param clas
     * @param <T>
     * @return 获取getMapper
     * @throws IllegalArgumentException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
//    public static <T> T getMapper(Class<T> clas) throws IllegalArgumentException, InstantiationException, IllegalAccessException {
//            return (T) Proxy.newProxyInstance(clas.getClassLoader(), new Class[] { clas },
//                    new MyInvocationHandlerMbatis(clas));
//    }
}
