package com.yayandroid.medium.simpleapponcreate.di;

import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;
import com.yayandroid.medium.simpleapponcreate.plugin.ApplicationPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.LeakCanaryPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.PerformanceToolPlugin;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
@ApplicationScope
public class BuildSpecificPluginModule {

    @Provides
    @IntoSet static ApplicationPlugin providePerformanceToolPlugin() {
        return new PerformanceToolPlugin();
    }

    @Provides
    @IntoSet static ApplicationPlugin provideLeakCanaryPlugin() {
        return new LeakCanaryPlugin();
    }

}
