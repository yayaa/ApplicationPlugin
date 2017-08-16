package com.yayandroid.medium.simpleapponcreate.di;

import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;
import com.yayandroid.medium.simpleapponcreate.thirdparty.CoolAnalyticsTool;

import dagger.Module;
import dagger.Provides;

@Module
@ApplicationScope
public class ThirdPartyModule {

    @Provides static CoolAnalyticsTool provideCoolAnalyticsTool() {
        return CoolAnalyticsTool.getInstance();
    }

}
