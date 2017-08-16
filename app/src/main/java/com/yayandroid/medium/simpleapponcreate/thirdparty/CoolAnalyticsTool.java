package com.yayandroid.medium.simpleapponcreate.thirdparty;

import android.app.Application;
import android.util.Log;

public class CoolAnalyticsTool {

    private static final String TAG = CoolAnalyticsTool.class.getSimpleName();
    private static CoolAnalyticsTool instance;
    private static boolean isConfigured = false;

    public static synchronized CoolAnalyticsTool getInstance() {
        if (instance == null) instance = new CoolAnalyticsTool();
        return instance;
    }

    public void configure(Application application) {
        isConfigured = true;
        Log.i(TAG, String.format("I tied myself to the %s now.", application));
    }

    public void use() {
        if (!isConfigured)
            throw new IllegalStateException("No no, i need to be configured to work properly.");
    }

}
