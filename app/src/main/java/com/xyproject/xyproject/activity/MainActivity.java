package com.xyproject.xyproject.activity;

import android.content.SharedPreferences;

import com.xyproject.xyproject.R;
import com.xyproject.xyproject.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void loadLayout() {
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("xyproject",MODE_PRIVATE);
    }

    @Override
    protected void loadView() {

    }

    @Override
    protected void loadListener() {

    }

    @Override
    protected void loadProgress() {

    }
}
