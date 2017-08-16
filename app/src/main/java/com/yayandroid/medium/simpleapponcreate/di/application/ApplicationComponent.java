package com.yayandroid.medium.simpleapponcreate.di.application;

import android.app.Application;

import com.yayandroid.medium.simpleapponcreate.SimpleApplication;
import com.yayandroid.medium.simpleapponcreate.di.ApplicationPluginModule;
import com.yayandroid.medium.simpleapponcreate.di.ThirdPartyModule;
import com.yayandroid.medium.simpleapponcreate.di.UILModule;

import dagger.Component;

@ApplicationScope
@Component(modules = {
      ApplicationModule.class,
      UILModule.class,
      ThirdPartyModule.class,
      ApplicationPluginModule.class
})
public abstract class ApplicationComponent {

    public static ApplicationComponent create(Application application) {
        return DaggerApplicationComponent.builder()
              .applicationModule(new ApplicationModule(application))
              .build();
    }

    public abstract void inject(SimpleApplication application);
}
