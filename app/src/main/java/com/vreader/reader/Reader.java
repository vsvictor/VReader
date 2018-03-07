package com.vreader.reader;

import com.fb2lib.model.FB2Book;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by victor on 06.03.18.
 */

public class Reader {
    private FB2Book book;

    public Reader(){
        book = new FB2Book();
    }
    public void read(String fileName){
        try {
            String sData = book.load(fileName);
            //book = book.getParser().fromXml(new StringReader(sData), FB2Book.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
