package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import com.yayandroid.medium.simpleapponcreate.util.SomeUtilObject;

public class SomeUtilPlugin implements ApplicationPlugin {
    @Override
    public void apply(Application application) {
        SomeUtilObject.init(application);
    }
}
