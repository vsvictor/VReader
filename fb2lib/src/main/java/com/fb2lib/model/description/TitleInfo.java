package com.fb2lib.model.description;

import android.graphics.Bitmap;
import android.location.Location;

import com.xmlserialozation.SerializedXML;
import com.xmlserialozation.XMLModel;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by victor on 07.03.18.
 */

public class TitleInfo extends XMLModel{
    //@SerializedXML("genre")
    private ArrayList<Genre> genres;
    @SerializedXML("author")
    private ArrayList<Human> authors;
    @SerializedXML("book-title")
    private String bookTitle;
    //@SerializedXML("annotation")
    private ArrayList<Annotation> annotations;
    //@SerializedXML("keywords")
    private String keywords;
    //@SerializedXML("date")
    private BookDate date;
    //@SerializedXML("coverpage")
    private Bitmap coverage;
    //@SerializedXML("lang")
    private Language language;
    //@SerializedXML("src-lang")
    private Language srcLanguage;
    //@SerializedXML("translator")
    private ArrayList<Human> translator;
    //@SerializedXML("sequence")
    private Sequence sequence;

    public TitleInfo(){
        genres = new ArrayList<Genre>();
        authors = new ArrayList<Human>();
        bookTitle = "";
        annotations = new ArrayList<Annotation>();
        keywords = "";
        date = new BookDate();
        coverage = null;
        language = new Language(Locale.ENGLISH.getISO3Language());
        srcLanguage = new Language(Locale.ENGLISH.getISO3Language());
        translator = new ArrayList<Human>();
        sequence = new Sequence("",0);
    }

}
