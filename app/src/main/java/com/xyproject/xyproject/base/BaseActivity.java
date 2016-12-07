package com.xyproject.xyproject.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hasee on 2016/11/26.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadLayout();
        loadView();
        loadListener();
        loadProgress();

    }
    //  加载布局
    protected abstract void loadLayout();
    //  加载控件
    protected abstract void loadView();
    //  绑定监听
    protected abstract void loadListener();
    //  逻辑处理
    protected abstract void loadProgress();

}
