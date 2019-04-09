package com.mikey.mybatis.core;

import com.mikey.mybatis.config.Configuration;
import com.mikey.mybatis.parsers.SaxParsersConfigXML;
import com.mikey.mybatis.pool.DataBaseConnPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 18:00
 * @Describe：
 **/
public class DBManager {
/**
     * 配置信息类
     */
    private static Configuration conf;

    /**
     * 连接对象
     */
    private static DataBaseConnPool pool;

    /**
     * 解析配置文件
     */
    static {
        conf = SaxParsersConfigXML.parsersConfiguation();
    }
    /**
     * 获取连接对象
     * @return
     */
    public static Connection getConnection(){
        if (pool==null){
            pool=new DataBaseConnPool();
        }
        return pool.getConnection();
    }
    /**
     * 创建连接
     * @return
     */
    public static Connection createConnection(){
        try {
            Class.forName(conf.getDriver());
            return DriverManager.getConnection(conf.getUrl(),conf.getUsername(),conf.getPassword());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    /**
     * 关闭传入的相关资源对象
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection){
        try {
            if (statement!=null){
                statement.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }try {
            if (resultSet!=null){
                resultSet.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        pool.close(connection);
    }

    /**
     * 关闭Statement返回连接对象到连接池
     * @param statement
     * @param connection
     */
    public static void close(Statement statement, Connection connection){
        try {
            if (statement!=null){
                statement.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        pool.close(connection);
    }

    /**
     * 返回连接对象到连接池
     * @param connection
     */
    public static void close(Connection connection){
        pool.close(connection);
    }

    /**
     * 返回Configuration对象
     * @return
     */
    public static Configuration getConf(){
        return conf;
    }

}