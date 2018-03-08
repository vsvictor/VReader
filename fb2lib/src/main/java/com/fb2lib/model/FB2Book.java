package com.fb2lib.model;

import android.util.Log;

import com.xmlserialozation.SerializedXML;
import com.xmlserialozation.XMLModel;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import static com.fb2lib.Constants.TAG_BINARY;
import static com.fb2lib.Constants.TAG_BODY;
import static com.fb2lib.Constants.TAG_DESCRIPTION;
import static com.fb2lib.Constants.TAG_FICTION_BOOK;
import static org.xmlpull.v1.XmlPullParser.END_DOCUMENT;
import static org.xmlpull.v1.XmlPullParser.END_TAG;
import static org.xmlpull.v1.XmlPullParser.START_DOCUMENT;
import static org.xmlpull.v1.XmlPullParser.START_TAG;

/**
 * Created by victor on 06.03.18.
 */

public class FB2Book extends XMLModel {
    private static final String TAG = FB2Book.class.getSimpleName();
    @SerializedXML("description")
    private FB2Description description;
    @SerializedXML("body")
    private FB2Body body;
    @SerializedXML("binary")
    private FB2Binary binary;


    public FB2Book(){
        super();
        description = new FB2Description();
        body = new FB2Body();
        binary = new FB2Binary();
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
