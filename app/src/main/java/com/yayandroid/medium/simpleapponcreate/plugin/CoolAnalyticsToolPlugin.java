package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import com.yayandroid.medium.simpleapponcreate.thirdparty.CoolAnalyticsTool;

public class CoolAnalyticsToolPlugin implements ApplicationPlugin {

    private CoolAnalyticsTool tool;

    public CoolAnalyticsToolPlugin(CoolAnalyticsTool tool){
        this.tool = tool;
    }

    @Override
    public void apply(Application application) {
        tool.configure(application);
    }
}
