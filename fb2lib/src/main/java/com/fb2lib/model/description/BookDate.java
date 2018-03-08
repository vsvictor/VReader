package com.fb2lib.model.description;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by victor on 07.03.18.
 */

public class BookDate {
    private Date date;
    private int year;

    public BookDate(){
        this.date = new Date();
        this.year = this.date.getYear();
    }

    private BookDate(Date date){
        this.date = date;
        this.year = 0;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
