package com.mikey.mybatis.pool;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 17:49
 * @Describe：数据库连接池
 **/
public class DataSourcePool {

    private static final List<Connection> pool=null;

    public static final int POOL_MAX_SIZE= DBManager.getConf().getPoolMaxSize();
    /**
     * 最小连接数
     */
    public static final int POOL_MIN_SIZE=DBManager.getConf().getPoolMinSize();
    static{
        pool=new ArrayList<Connection>(Con);
    }

}
