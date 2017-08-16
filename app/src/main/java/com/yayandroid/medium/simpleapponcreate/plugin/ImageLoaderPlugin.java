package com.yayandroid.medium.simpleapponcreate.plugin;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class ImageLoaderPlugin implements ApplicationPlugin {

    private final ImageLoaderConfiguration imageLoaderConfiguration;
    private final ImageLoader imageLoader;

    public ImageLoaderPlugin(ImageLoader imageLoader, ImageLoaderConfiguration imageLoaderConfiguration) {
        this.imageLoader = imageLoader;
        this.imageLoaderConfiguration = imageLoaderConfiguration;
    }

    @Override
    public void apply(Application application) {
        imageLoader.init(imageLoaderConfiguration);
    }
}
