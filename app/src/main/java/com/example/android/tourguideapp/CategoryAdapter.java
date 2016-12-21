package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mac on 2016/12/21.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ZooFragment();
        } else if (position == 1) {
            return new ParkFragment();
        } else if (position == 2) {
            return new BeachFragment();
        } else {
            return new QuariumFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
