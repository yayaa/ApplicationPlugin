package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import com.yayandroid.medium.simpleapponcreate.PerformanceTool;

public class PerformanceToolPlugin implements ApplicationPlugin {

    @Override
    public void apply(Application application) {
        PerformanceTool.monitor(application);
    }

}
