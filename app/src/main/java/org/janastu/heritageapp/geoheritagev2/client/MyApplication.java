package org.janastu.heritageapp.geoheritagev2.client;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by DESKTOP on 5/21/2016.
 */public class MyApplication extends Application {

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}