package com.yayandroid.medium.simpleapponcreate.util;

import android.app.Application;
import android.util.Log;

public class SomeUtilObject {

    private static final String TAG = SomeUtilObject.class.getSimpleName();

    public static void init(Application application) {
        Log.i(TAG, String.format("I need to do very very important thing here with application: %s", application));
    }

}
