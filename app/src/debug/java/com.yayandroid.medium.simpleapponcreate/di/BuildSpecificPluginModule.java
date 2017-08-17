package com.yayandroid.medium.simpleapponcreate.di;

import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;
import com.yayandroid.medium.simpleapponcreate.plugin.ApplicationPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.DebugSpecificPlugin;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
@ApplicationScope
public class BuildSpecificPluginModule {

    @Provides
    @IntoSet static ApplicationPlugin provideDebugPlugin() {
        return new DebugSpecificPlugin();
    }

}
