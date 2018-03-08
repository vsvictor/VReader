package com.xmlserialozation;

import android.location.Location;
import android.text.TextUtils;
import android.util.Log;

import com.stanfy.gsonxml.GsonXml;
import com.stanfy.gsonxml.GsonXmlBuilder;
import com.stanfy.gsonxml.XmlParserCreator;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by victor on 07.03.18.
 */

public abstract class XMLModel {
    private static final String TAG = XMLModel.class.getSimpleName();
    private File file;
    private String fileName;

    protected XMLModel(){

    }
    public void fromFile(String fileName) throws Exception {
        file = new File(fileName);
        parse(this.getClass(), this);
    }
    public Document getDocument(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            return doc;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            return null;
        } catch (SAXException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void parse(Class<?> clazz, Object obj)throws Exception{
        Log.i(TAG, clazz.getSimpleName());
        Document doc = getDocument();
        if(doc != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(SerializedXML.class)) {
                    Log.i(TAG, "\n");
                    Log.i(TAG, "Type field with annotation:"+f.getType().getName());
                    f.setAccessible(true);
                    SerializedXML ser = f.getAnnotation(SerializedXML.class);
                    String tag = ser.value();
                    Log.i(TAG, "Annotation value: "+tag);
                    if(!f.getDeclaringClass().isPrimitive() &&
                            !f.getType().getSimpleName().equals("String") &&
                            !f.getType().getSimpleName().equals("Integer") &&
                            !f.getType().getSimpleName().equals("Long") &&
                            !f.getType().getSimpleName().equals("Double") &&
                            !f.getType().getSimpleName().equals("Float") &&
                            !f.getType().getSimpleName().equals("Boolean") &&
                            !f.getType().getSimpleName().equals("Bitmap") &&
                            !f.getType().getSimpleName().equals("ArrayList")){
                        Log.i(TAG, "Field type: "+f.getDeclaringClass().getName());
                        Log.i(TAG, "Field Simple type: "+f.getDeclaringClass().getSimpleName());

                        parse(f.getType(), f.get(obj));
                    }else{
                        NodeList list = doc.getElementsByTagName(tag);
                        if(list != null && list.getLength() > 0) {
                            String s = list.item(0).getFirstChild().getNodeValue();
                            try {
                                Log.i(TAG, "Field name: "+f.getName());
                                f.set(obj, s);
                                Log.i(TAG,"Value is set: "+s);
                            }catch (IllegalArgumentException ex){
                                Log.i(TAG, "Field type: "+f.getType().getSimpleName());
                                Log.i(TAG, "value: "+s);
                                ex.printStackTrace();
                            }

                        }
                    }
                }
            }


        }



    }
}
