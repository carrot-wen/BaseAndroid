package com.wen.baseandroid.ch_1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wen.baseandroid.R;
import com.wen.baseandroid.util.LogUtil;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = "FirstActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ch1);
        LogUtil.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtil.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtil.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtil.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtil.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtil.d(TAG, "onDestroy: ");
    }
}
