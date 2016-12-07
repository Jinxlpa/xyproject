package com.xyproject.xyproject.utils.location;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.xyproject.xyproject.activity.MainActivity;
import com.xyproject.xyproject.application.MyApplication;
import com.xyproject.xyproject.utils.Constant;

/**
 * Created by hasee on 2016/11/26.
 */

// 定位回调监听
public class MyLocationListener implements BDLocationListener{

    private MainActivity mainActivity;

    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        // 获取到定位的返回码   如果返回码为161 则定位成功
        int locType = bdLocation.getLocType();

        MyApplication application = ((MyApplication) mainActivity.getApplication());

        if (locType == Constant.LOCATION_SUCCESS_CODE){
            // 存储定位信息
            application.hashMap.put("bdLocation",bdLocation);
        }

    }

    public void getActivity(MainActivity m){
        this.mainActivity = m;
    }

}
