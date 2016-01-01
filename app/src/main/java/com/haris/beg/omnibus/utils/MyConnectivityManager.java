package com.haris.beg.omnibus.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by haris on 12/31/2015.
 */
public class MyConnectivityManager {
    private static MyConnectivityManager ourInstance = new MyConnectivityManager();

    public static MyConnectivityManager getInstance() {
        return ourInstance;
    }

    private MyConnectivityManager() {
    }

    public boolean isConnected(Context context) {
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
