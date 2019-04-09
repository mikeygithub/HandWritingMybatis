package com.mikey.mybatis.pool;

import com.mikey.mybatis.config.Configuration;
import com.mikey.mybatis.core.DBManager;

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
public class DataBaseConnPool {
    /**
     * 最大连接数
     */
    public static final int POOL_MAX_SIZE= Integer.parseInt(DBManager.getConf().getPoolMaxSize());
    /**
     * 最小连接数
     */
    public static final int POOL_MIN_SIZE= Integer.parseInt(DBManager.getConf().getPoolMinSize());
    /**
     * 连接池
     */
    private static List<Connection> pool=null;

    /**
     * 初始化数据库连接池
     */
    public void initDataBaseConnPool(){
        if (pool==null){
            pool = new ArrayList<Connection>();
        }
        while (pool.size()<DataBaseConnPool.POOL_MIN_SIZE){
            pool.add(DBManager.createConnection());
            System.out.println("初始化数据库连接池："+pool.size());
        }

    }

    /**
     * 从连接池中获取一个连接
     * @return
     */
    public synchronized Connection getConnection() {

        int LAST_INDEX = pool.size() - 1;

        Connection connection = pool.get(LAST_INDEX);

        pool.remove(LAST_INDEX);

        return connection;

    }

    /**
     * 将数据库连接对象放回到连接池中
     */
      public synchronized void close(Connection connection){
          if(pool.size()>=POOL_MAX_SIZE) {
              try {
                  if (connection!=null){
                      connection.close();
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
          }else {
              pool.add(connection);
          }
    }

    /**
     * 构造器初始化数据库连接池
     */
    public DataBaseConnPool() {
          initDataBaseConnPool();
    }
}
