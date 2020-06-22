package com.example.instafood;

import android.app.Application;
import android.content.Context;
import android.view.View;

public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }


}
