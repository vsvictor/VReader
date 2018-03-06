package com.vreader.reader;

import com.fb2lib.model.FB2Book;

/**
 * Created by victor on 06.03.18.
 */

public class Reader {
    private FB2Book book;

    public Reader(){
        book = new FB2Book();
    }
    public void read(String fileName){
        String sData = book.load(fileName);
        book.parse(sData);
    }
}
