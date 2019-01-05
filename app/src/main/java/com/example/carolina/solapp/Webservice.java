package com.example.carolina.solapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Webservice
{
    @GET("open-data/forecast/meteorology/cities/daily/{localId}.json")
    Call<WeatherEntry> getWeatherEntry(@Path("localId") String localId);
}
