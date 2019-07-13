package com.example.sima.carmoveongooglemap;

import com.example.sima.carmoveongooglemap.Retrofit.IGoogleAPI;

public class Common {

    public  static  final  String baseURL="https://googleapis.com";

    public  static IGoogleAPI getGoogleApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
