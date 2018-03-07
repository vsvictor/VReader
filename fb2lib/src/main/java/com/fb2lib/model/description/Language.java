package com.fb2lib.model.description;

import java.util.Locale;

/**
 * Created by victor on 07.03.18.
 */

public class Language {
    private Locale locale;

    public Language(){
        locale = Locale.ENGLISH;
    }
    public Language(String language){
        locale = new Locale(language);
    }
    public void setLanguage(String language){
        locale = new Locale(language);
    }
    public String getLanguage(){
        return locale.getLanguage();
    }
}
