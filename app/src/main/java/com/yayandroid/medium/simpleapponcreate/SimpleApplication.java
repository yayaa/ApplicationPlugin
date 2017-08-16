package com.yayandroid.medium.simpleapponcreate;

import android.app.Application;
import android.util.Log;

import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationComponent;
import com.yayandroid.medium.simpleapponcreate.plugin.ApplicationPlugin;

import java.util.Set;

import javax.inject.Inject;

public class SimpleApplication extends Application {

    @Inject Set<ApplicationPlugin> plugins;

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationComponent.create(this).inject(this);

        for (ApplicationPlugin plugin: plugins)
            plugin.apply(this);

        importantMethod();
    }

    private void importantMethod() {
        Log.i("Business Logic", "This is very important for my application");
    }

}
