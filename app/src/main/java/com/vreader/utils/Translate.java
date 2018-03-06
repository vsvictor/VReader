package com.vreader.utils;

import android.content.res.Resources;

/**
 * Created by victor on 04.03.18.
 */

public class Translate {

    public static int dpToPx(int dp)
    {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int pxToDp(int px)
    {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }
}
