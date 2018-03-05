package com.fb2lib.types;

import com.fb2lib.R;

/**
 * Created by victor on 05.03.18.
 */

public enum Genre {SF_HISTORY("sf_history", R.string.sf_history), SF_ACTION("sf_action",R.string.sf_action);
    private String fb2Notation;
    private int humanNotation;

    private Genre(String fb2Notation, int humanNotation){
        this.fb2Notation = fb2Notation;
        this.humanNotation = humanNotation;
    }
}
