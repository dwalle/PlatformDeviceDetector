package com.example.platformdevicedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.deviceplatformdetection.DevicePlatformDetection;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data = DevicePlatformDetection.detect();
        Log.i(TAG, "onCreate: " + data);
    }
}
