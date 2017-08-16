package com.yayandroid.medium.simpleapponcreate.di.application;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
@ApplicationScope
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

}
