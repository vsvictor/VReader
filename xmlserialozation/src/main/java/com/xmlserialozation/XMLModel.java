package com.xmlserialozation;

import com.stanfy.gsonxml.GsonXml;
import com.stanfy.gsonxml.GsonXmlBuilder;
import com.stanfy.gsonxml.XmlParserCreator;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * Created by victor on 07.03.18.
 */

public abstract class XMLModel {
    private GsonXml parser;
    public XMLModel(){
        init();
    }
    private void init(){
        XmlParserCreator parserCreator = new XmlParserCreator() {
            @Override
            public XmlPullParser createParser() {
                try {
                    return XmlPullParserFactory.newInstance().newPullParser();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        parser = new GsonXmlBuilder()
                .setXmlParserCreator(parserCreator)
                .create();
    }

    public GsonXml getParser() {
        return parser;
    }
}
