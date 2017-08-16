package com.yayandroid.medium.simpleapponcreate;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.Log;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.squareup.leakcanary.LeakCanary;
import com.yayandroid.medium.simpleapponcreate.analyze.PerformanceTool;
import com.yayandroid.medium.simpleapponcreate.thirdparty.CoolAnalyticsTool;
import com.yayandroid.medium.simpleapponcreate.util.SomeUtilObject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class SimpleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DisplayImageOptions options = new DisplayImageOptions.Builder()
              .resetViewBeforeLoading(true)
              .showImageOnFail(android.R.drawable.ic_menu_report_image)
              .showImageForEmptyUri(android.R.drawable.ic_menu_report_image)
              .cacheOnDisk(true)
              .displayer(new FadeInBitmapDisplayer(300))
              .imageScaleType(ImageScaleType.EXACTLY)
              .bitmapConfig(Bitmap.Config.RGB_565)
              .build();
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)
              .defaultDisplayImageOptions(options)
              .diskCacheSize(20 * 1024 * 1024) // 20MB
              .build();
        ImageLoader.getInstance().init(configuration);

        CoolAnalyticsTool.getInstance().configure(this);
        importantMethod();
        PerformanceTool.monitor(this);
        SomeUtilObject.init(this);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
              .setDefaultFontPath("fonts/some_font_path.ttf")
              .setFontAttrId(android.R.attr.fontFamily)
              .build());

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    private void importantMethod() {
        Log.i("Business Logic", "This is very important for my application");
    }

}
