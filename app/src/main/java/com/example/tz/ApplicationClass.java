package com.example.tz;

import android.app.Application;

import com.onesignal.OneSignal;


public class ApplicationClass extends Application {
    private static final String ONESIGNAL_APP_ID = "d5640667-ae2e-47e7-b9b2-c11021217aab";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}

