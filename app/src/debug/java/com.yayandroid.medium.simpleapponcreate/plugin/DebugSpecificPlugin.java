package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;
import android.util.Log;

public class DebugSpecificPlugin implements ApplicationPlugin {

    private static final String TAG = DebugSpecificPlugin.class.getSimpleName();

    @Override
    public void apply(Application application) {
        Log.i(TAG, "DebugSpecificPlugin is applied.");
    }
}
