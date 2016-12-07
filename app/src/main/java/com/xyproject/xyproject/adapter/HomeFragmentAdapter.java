package com.xyproject.xyproject.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.xyproject.xyproject.entity.HomeEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2016/11/26.
 */
public class HomeFragmentAdapter extends BaseAdapter{

    private List<HomeEntity> data = new ArrayList<>();

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    public void setData(List<HomeEntity> list){
        data.addAll(list);
        notifyDataSetChanged();
    }
    public void clearData(){
        data.clear();
        notifyDataSetChanged();
    }
}
