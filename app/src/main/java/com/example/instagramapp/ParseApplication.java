package com.example.instagramapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mhjPLJwrTqIoiopcgdJUlgujC1Eap6RS1D3JSGPU")
                .clientKey("9xtyMCEzIqheeBMbnGokKmUYWAyGccX06DxTUHNJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
