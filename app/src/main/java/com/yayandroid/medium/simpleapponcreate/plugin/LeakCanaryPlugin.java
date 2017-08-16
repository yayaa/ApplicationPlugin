package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class LeakCanaryPlugin implements ApplicationPlugin {
    @Override
    public void apply(Application application) {
        if (LeakCanary.isInAnalyzerProcess(application)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(application);
    }
}
