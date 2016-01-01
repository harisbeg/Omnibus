package com.haris.beg.omnibus.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by haris on 12/31/2015.
 */
public class MyToastManager {
    private static MyToastManager ourInstance = new MyToastManager();

    public static MyToastManager getInstance() {
        return ourInstance;
    }

    private MyToastManager() {
    }

    public void displayShortToast(Context context, String text){
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
