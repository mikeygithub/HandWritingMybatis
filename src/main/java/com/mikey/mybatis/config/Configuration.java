package com.mikey.mybatis.config;

import java.util.List;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 17:05
 * @Describe：配置类
 **/
public class Configuration {
     /* <configuration>
            *     <environments default="development">
            *         <environment id="development">
            *             <transactionManager type="JDBC"/>
            *             <dataSource type="POOLED">
            *                 <property name="driver" value="com.mysql.jdbc.Driver"/>
            *                 <property name="url" value="jdbc:mysql://127.0.0.1/mybatisdemo?allowMultiQueries=true&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
            *                 <property name="username" value="root"/>
            *                 <property name="password" value="123456"/>
            *             </dataSource>
            *         </environment>
            *     </environments>
            *     <mappers>
            *         <mapper resource="com/mikey/sourcecode/BlogMapper.xml"/>
            *     </mappers>
            * </configuration>
    * /
    /**
     * 环境
     */
    private String environment;
    /**
     * 事务管理器
     */
    private String transactionManager;
    /**
     * 数据源
     */
    private String dataSource;
    /**
     * 驱动类
     */
    private String driver;
    /**
     * jdbc的url
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 数据库连接池最大连接数
     */
    private String poolMaxSize;
    /**
     * 数据库连接池最小连接数
     */
    private String poolMinSize;
    /**
     * 配置的mapper.xml
     */
    private List<String> mapperList;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(String transactionManager) {
        this.transactionManager = transactionManager;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getMapperList() {
        return mapperList;
    }

    public void setMapperList(List<String> mapperList)
    {
        this.mapperList = mapperList;
    }

    public String getPoolMaxSize() {
        return poolMaxSize;
    }

    public void setPoolMaxSize(String poolMaxSize) {
        this.poolMaxSize = poolMaxSize;
    }

    public String getPoolMinSize() {
        return poolMinSize;
    }

    public void setPoolMinSize(String poolMinSize) {
        this.poolMinSize = poolMinSize;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "environment='" + environment + '\'' +
                ", transactionManager='" + transactionManager + '\'' +
                ", dataSource='" + dataSource + '\'' +
                ", driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", poolMaxSize='" + poolMaxSize + '\'' +
                ", poolMinSize='" + poolMinSize + '\'' +
                ", mapperList=" + mapperList +
                '}';
    }
}
