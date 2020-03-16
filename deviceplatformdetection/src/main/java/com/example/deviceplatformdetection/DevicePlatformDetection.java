package com.example.deviceplatformdetection;

import android.os.Build;

public class DevicePlatformDetection {
    public static String detect() {
        return "API: " + Build.VERSION.SDK_INT +"\t" + BuildConfig.BUILD_TYPE;
    }
}
