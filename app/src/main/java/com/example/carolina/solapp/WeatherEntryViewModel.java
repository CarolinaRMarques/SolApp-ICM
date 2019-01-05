package com.example.carolina.solapp;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

public class WeatherEntryViewModel extends ViewModel
{
    private LiveData<WeatherEntry> weatherEntry;
    private WeatherEntryRepository weatherEntryRepository;

    public WeatherEntryViewModel() {
        this.weatherEntryRepository = new WeatherEntryRepository();
    }

    public void init(String localId) {
        if (this.weatherEntry != null) {
            // ViewModel is created on a per-Fragment basis, so the userId
            // doesn't change.
            return;
        }
        weatherEntry = weatherEntryRepository.getWeatherEntry(localId);
    }
    

    public LiveData<WeatherEntry> getWeatherEntry() {
        return weatherEntry;
    }
}
