package com.yayandroid.medium.simpleapponcreate.di;

import android.app.Application;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.yayandroid.medium.simpleapponcreate.di.application.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
@ApplicationScope
public class UILModule {

    @Provides static ImageLoader provideImageLoader() {
        return ImageLoader.getInstance();
    }

    @Provides static ImageLoaderConfiguration provideImageLoaderConfiguration(Application application,
          DisplayImageOptions options) {
        return new ImageLoaderConfiguration.Builder(application)
              .defaultDisplayImageOptions(options)
              .diskCacheSize(20 * 1024 * 1024) // 20MB
              .build();
    }

    @Provides static DisplayImageOptions provideDisplayImageOptions() {
        return new DisplayImageOptions.Builder()
              .resetViewBeforeLoading(true)
              .showImageOnFail(android.R.drawable.ic_menu_report_image)
              .showImageForEmptyUri(android.R.drawable.ic_menu_report_image)
              .cacheOnDisk(true)
              .displayer(new FadeInBitmapDisplayer(300))
              .imageScaleType(ImageScaleType.EXACTLY)
              .bitmapConfig(Bitmap.Config.RGB_565)
              .build();
    }

}
