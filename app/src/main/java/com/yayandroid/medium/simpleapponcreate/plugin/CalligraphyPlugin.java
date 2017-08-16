package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class CalligraphyPlugin implements ApplicationPlugin {
    @Override
    public void apply(Application application) {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
              .setDefaultFontPath("fonts/some_font_path.ttf")
              .setFontAttrId(android.R.attr.fontFamily)
              .build());
    }
}
