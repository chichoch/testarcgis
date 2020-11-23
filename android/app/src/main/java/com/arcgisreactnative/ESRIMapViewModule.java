package com.arcgisreactnative;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ESRIMapViewModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    ESRIMapViewModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "ESRIMapView";
    }

    @ReactMethod
    public void boo(String message) {
        Log.i("ESRIMapView", message);
    }
}
