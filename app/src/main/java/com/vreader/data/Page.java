package com.vreader.data;

/**
 * Created by victor on 25.02.18.
 */

public class Page {
    private int pageNumber;
    private String pageText;

    public Page(int pageNumber, String pageText){
        this.pageNumber = pageNumber;
        this.pageText = pageText;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getPageText() {
        return pageText;
    }
}
