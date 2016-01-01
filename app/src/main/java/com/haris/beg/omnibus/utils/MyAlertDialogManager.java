package com.haris.beg.omnibus.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.haris.beg.omnibus.R;

/**
 * Created by haris on 12/31/2015.
 */
public class MyAlertDialogManager {
    private static MyAlertDialogManager ourInstance = new MyAlertDialogManager();

    public static MyAlertDialogManager getInstance() {
        return ourInstance;
    }

    private MyAlertDialogManager() {
    }

    public void showAlert(String title, String message, Context context) {
        AlertDialog.Builder alert = new AlertDialog.Builder(context);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.setPositiveButton(context.getString(R.string.okay), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert.show();
    }
}
