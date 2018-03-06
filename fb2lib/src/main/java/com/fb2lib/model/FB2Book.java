package com.fb2lib.model;

import com.fb2lib.types.CodePage;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by victor on 06.03.18.
 */

public class FB2Book {
    private CodePage codePage;
    private int version;
    private String nameSpace;
    private FB2Description description;
    private FB2Body body;
    private FB2Binary binary;

    private File file;
    private String fileName;

    public FB2Book(){

    }

    public FB2Book(String fileName){
        this.fileName = fileName;
    }
    public String load(String fileName){
        file = new File(fileName);
        StringBuilder buider = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                buider.append(line);
                buider.append('\n');
            }
            br.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return buider.toString();
    }

    public void parse(String data){
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
    }

    public FB2Description getDescription() {
        return description;
    }

    public void setDescription(FB2Description description) {
        this.description = description;
    }

    public FB2Body getBody() {
        return body;
    }

    public void setBody(FB2Body body) {
        this.body = body;
    }

    public FB2Binary getBinary() {
        return binary;
    }

    public void setBinary(FB2Binary binary) {
        this.binary = binary;
    }
}
