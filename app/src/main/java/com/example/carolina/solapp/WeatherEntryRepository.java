package com.example.carolina.solapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherEntryRepository {
    private Webservice webservice;
    //private WeatherEntryDao weatherEntryDao;
    // private Executor executor;

    public WeatherEntryRepository() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.ipma.pt/").addConverterFactory(GsonConverterFactory.create()).build();
        this.webservice = retrofit.create(Webservice.class);
        /*this.weatherEntryDao=weatherEntryDao;
        this.executor=executor;*/
    }

    public LiveData<WeatherEntry> getWeatherEntry(String localId) {
        final MutableLiveData<WeatherEntry> data = new MutableLiveData<>();
        webservice.getWeatherEntry(localId).enqueue(new Callback<WeatherEntry>() {
            @Override
            public void onResponse(Call<WeatherEntry> call, Response<WeatherEntry> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<WeatherEntry> call, Throwable t) {

            }

            // Error case is left out for brevity.
        });
        return data;
    }


    /*public LiveData<WeatherEntry> getWeatherEntry(String localId)
    {
        refreshRecord(localId);
        return weatherEntryDao.load(localId);
    }

    private void refreshRecord(final String localId)
    {
        executor.execute(()->{
            Date agora = new Date();
            Date quinzeatras = new Date(System.currentTimeMillis() - (15*60*1000));
            int recordExists = weatherEntryDao.existsRecord(localId, quinzeatras, agora);

            if (recordExists == 0)
            {
                try {
                    Response<WeatherEntry> response = webservice.getWeatherEntry(localId).execute();
                    weatherEntryDao.save(response.body());
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }*/
}
