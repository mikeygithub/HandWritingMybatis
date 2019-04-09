package com.mikey.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-09 21:49
 * @Describe：基础mapper包含相关数类型的抽象
 **/
public class BaseMapperXML {

    private static String nameSpace = null;

    private static List<SQL> selects = new ArrayList<SQL>();

    private static List<SQL> deletes = new ArrayList<SQL>();

    private static List<SQL> inserts = new ArrayList<SQL>();

    private static List<SQL> updatas = new ArrayList<SQL>();

    public static String getNameSpace() {
        return nameSpace;
    }

    public static void setNameSpace(String nameSpace) {
        BaseMapperXML.nameSpace = nameSpace;
    }

    public static List<SQL> getSelects() {
        return selects;
    }

    public static void setSelects(List<SQL> selects) {
        BaseMapperXML.selects = selects;
    }

    public static List<SQL> getDeletes() {
        return deletes;
    }

    public static void setDeletes(List<SQL> deletes) {
        BaseMapperXML.deletes = deletes;
    }

    public static List<SQL> getInserts() {
        return inserts;
    }

    public static void setInserts(List<SQL> inserts) {
        BaseMapperXML.inserts = inserts;
    }

    public static List<SQL> getUpdatas() {
        return updatas;
    }

    public static void setUpdatas(List<SQL> updatas) {
        BaseMapperXML.updatas = updatas;
    }


}
