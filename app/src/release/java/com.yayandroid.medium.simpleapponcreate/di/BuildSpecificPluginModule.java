package com.yayandroid.medium.simpleapponcreate.di;

import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;

import dagger.Module;

@Module
@ApplicationScope
public class BuildSpecificPluginModule {
    /**
     * Nothing specific for Release buildType
     */
}
