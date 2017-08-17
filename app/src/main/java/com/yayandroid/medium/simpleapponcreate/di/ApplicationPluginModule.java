package com.yayandroid.medium.simpleapponcreate.di;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;
import com.yayandroid.medium.simpleapponcreate.plugin.ApplicationPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.CalligraphyPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.CoolAnalyticsToolPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.ImageLoaderPlugin;
import com.yayandroid.medium.simpleapponcreate.plugin.SomeUtilPlugin;
import com.yayandroid.medium.simpleapponcreate.thirdparty.CoolAnalyticsTool;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
@ApplicationScope
public class ApplicationPluginModule {

    @Provides
    @IntoSet static ApplicationPlugin provideSomeUtilPlugin() {
        return new SomeUtilPlugin();
    }

    @Provides
    @IntoSet static ApplicationPlugin provideCalligraphyPlugin() {
        return new CalligraphyPlugin();
    }

    @Provides
    @IntoSet static ApplicationPlugin provideCoolAnalyticsToolPlugin(CoolAnalyticsTool coolAnalyticsTool) {
        return new CoolAnalyticsToolPlugin(coolAnalyticsTool);
    }

    @Provides
    @IntoSet static ApplicationPlugin provideImageLoaderPlugin(ImageLoader imageLoader,
          ImageLoaderConfiguration imageLoaderConfiguration) {
        return new ImageLoaderPlugin(imageLoader, imageLoaderConfiguration);
    }

}
