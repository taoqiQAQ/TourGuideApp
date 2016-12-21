package com.example.android.tourguideapp;

/**
 * Created by Mac on 2016/12/20.
 */

public class Attractions {
    private String mPlace;

    private String mTime;

    private int mImage;

    public Attractions(String place,String time,int image){
        mPlace = place;
        mTime = time;
        mImage = image;
    }

    public String getmPlace(){
        return mPlace;
    }

    public String getmTime(){
        return mTime;
    }

    public int getmImage(){
        return  mImage;
    }

}
