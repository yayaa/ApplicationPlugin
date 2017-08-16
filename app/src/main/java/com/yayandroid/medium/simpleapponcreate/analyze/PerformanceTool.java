package com.yayandroid.medium.simpleapponcreate.analyze;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public class PerformanceTool implements ActivityLifecycleCallbacks {

    private static PerformanceTool instance;

    public static synchronized PerformanceTool monitor(Application application) {
        if (instance == null) instance = new PerformanceTool(application);
        return instance;
    }

    private PerformanceTool(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        // Some fancy monitoring
    }

    @Override
    public void onActivityStarted(Activity activity) {
        // Some fancy monitoring
    }

    @Override
    public void onActivityResumed(Activity activity) {
        // Some fancy monitoring
    }

    @Override
    public void onActivityPaused(Activity activity) {
        // Some fancy monitoring
    }

    @Override
    public void onActivityStopped(Activity activity) {
        // Some fancy monitoring
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        // Some fancy monitoring
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        // Some fancy monitoring
    }

}
