package com.mikey.mybatis.mapper;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-09 22:06
 * @Describe：XML对应节点SQL语句抽象
 **/
public class SQL {
    private String id;
    private String resultType;
    private String parameterType;
    private String sql;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getParameterType() {
        return parameterType;
    }

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "SQL{" +
                "id='" + id + '\'' +
                ", resultType='" + resultType + '\'' +
                ", parameterType='" + parameterType + '\'' +
                ", sql='" + sql + '\'' +
                '}';
    }
}
