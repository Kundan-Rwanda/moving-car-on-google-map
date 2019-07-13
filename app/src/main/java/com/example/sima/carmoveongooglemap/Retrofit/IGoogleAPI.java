package com.example.sima.carmoveongooglemap.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPI {

    @GET
    Call<String> getDataFromGoogleAPI(@Url String url);
}
