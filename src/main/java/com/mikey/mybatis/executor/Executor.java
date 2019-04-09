package com.mikey.mybatis.executor;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-09 20:54
 * @Describe：
 **/
public interface Executor {
    public <T> T query(String statement,Object parameter);
}
