package com.mikey.mybatis.parsers;

import com.mikey.mybatis.config.Configuration;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * @Program: HandWritingMybatis
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-04-08 17:03
 * @Describe：XML解析类
 **/
public class SaxParsersConfigXML extends DefaultHandler {


    private static Configuration configuartion;

    private static List<String> mapperList;

    /**
     * 解析Mybatis-config.xml
     * @return
     */
    public static Configuration parsersConfiguation(){

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();

            SaxParsersConfigXML saxParsersXML = new SaxParsersConfigXML();

            saxParser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml"),saxParsersXML);

        } catch (Exception e) {

          e.printStackTrace();

        }

        return configuartion;
    }

    /**
     * 文档开始
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {

        configuartion = new Configuration();

        mapperList = new ArrayList<String>();
    }

    /**
     * 文档结束
     * @throws SAXException
     */
    @Override
    public void endDocument() throws SAXException {

        configuartion.setMapperList(mapperList);

    }

    /**
     * 元素解析开始
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException
     */
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (null!=qName){
            if ("environments".equals(qName)){
                configuartion.setEnvironment(attributes.getValue(0));
            }else if ("transactionManager".equals(qName)){
                configuartion.setTransactionManager(attributes.getValue(0));
            }else if ("dataSource".equals(qName)){
                configuartion.setDataSource(attributes.getValue(0));
            }else if("property".equals(qName)&&"driver".equals(attributes.getValue("name"))){
                configuartion.setDriver(attributes.getValue(1));
            }else if("property".equals(qName)&&"url".equals(attributes.getValue("name"))){
                configuartion.setUrl(attributes.getValue(1));
            }else if("property".equals(qName)&&"minPoolSize".equals(attributes.getValue("name"))){
                configuartion.setPoolMinSize(attributes.getValue(1));
            }else if("property".equals(qName)&&"maxPoolSize".equals(attributes.getValue("name"))){
                configuartion.setPoolMaxSize(attributes.getValue(1));
            } else if("property".equals(qName)&&"username".equals(attributes.getValue("name"))){
                configuartion.setUsername(attributes.getValue(1));
            }else if("property".equals(qName)&&"password".equals(attributes.getValue("name"))){
                configuartion.setPassword(attributes.getValue(1));
            }else if ("mapper".equals(qName)){
                mapperList.add(attributes.getValue(0));
            }
        }
    }

    /**
     * 元素结束
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

}
