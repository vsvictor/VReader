package com.fb2lib.model.description;

import android.graphics.Bitmap;

import com.xmlserialozation.SerializedXML;

import java.util.ArrayList;

/**
 * Created by victor on 07.03.18.
 */

public class TitleInfo{
    @SerializedXML(tagName = "genre")
    private ArrayList<Genre> genres;
    @SerializedXML(tagName = "author")
    private ArrayList<Human> authors;
    @SerializedXML(tagName = "book-title")
    private String bookTitle;
    @SerializedXML(tagName = "annotation")
    private ArrayList<Annotation> annotations;
    @SerializedXML(tagName = "keywords")
    private String keywords;
    @SerializedXML(tagName = "date")
    private BookDate date;
    @SerializedXML(tagName = "coverpage")
    private Bitmap coverage;
    @SerializedXML(tagName = "lang")
    private Language language;
    @SerializedXML(tagName = "src-lang")
    private Language srcLanguage;
    @SerializedXML(tagName = "translator")
    private ArrayList<Human> translator;
    @SerializedXML(tagName = "sequence")
    private Sequence sequence;
}
