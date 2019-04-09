package com.mikey.mybatis.parsers;

import com.mikey.mybatis.mapper.BaseMapperXML;
import com.mikey.mybatis.mapper.SQL;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-09 13:22
 * @Describe：解析Mapper的xml文件
 * <select|update|delete|insert>
 * SqlSession.getMapper(XXXMapper.class)
 **/
public class SaxParsersMapperXML extends DefaultHandler {

    private static final int SELECT_SQL = 1;

    private static final int INSERT_SQL = 2;

    private static final int DELETE_SQL = 3;

    private static final int UPDATE_SQL = 4;

    private static  int FLAG = 0;

    private BaseMapperXML baseMapperXML;

    /**
     * 开始解析文档
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {

        baseMapperXML = new BaseMapperXML();

    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            case "select":

                break;
            case "insert":

                break;
            case "delete":

                break;
            case "update":

                break;
        }
            if ("select".equals(qName)){
                SQL sql = new SQL();
                System.out.println(attributes.getQName(0));
                sql.setId(attributes.getValue(0));
                sql.setParameterType(attributes.getValue(1));
                FLAG=SELECT_SQL;
            }else if ("insert".equals(qName)){

            }
//                    delete
//            insert
//                    update
        }
    }

    public SQL getSQL(Attributes attributes) {
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters:"+new String(ch,start,length));
        switch (FLAG){
            case SELECT_SQL:

                break;
            case INSERT_SQL:break;
            case UPDATE_SQL:break;
            case DELETE_SQL:break;
        }
    }

    /**
     * 解析
     * @param mapperList
     * @return
     */
    public BaseMapperXML parsersMapperXML(List<String> mapperList){

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            SaxParsersMapperXML saxParsersMapperXML = new SaxParsersMapperXML();

            for (String mapperLocal :mapperList) {

                System.out.println("解析MapperXML:"+mapperLocal);

                saxParser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream(mapperLocal),saxParsersMapperXML);
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

        return baseMapperXML;
    }

    public static void main(String[] args){

        BaseMapperXML baseMapperXML = new SaxParsersMapperXML().parsersMapperXML(SaxParsersConfigXML.parsersConfiguation().getMapperList());

        System.out.println("baseMapperXML"+baseMapperXML);

    }
}
