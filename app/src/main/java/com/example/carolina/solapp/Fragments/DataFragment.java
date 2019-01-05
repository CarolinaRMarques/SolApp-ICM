package com.example.carolina.solapp.Fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carolina.solapp.R;
import com.example.carolina.solapp.WeatherEntryViewModel;

public class DataFragment extends Fragment {
    private static final String localId = "1010500";
    TextView currentDate;
    TextView temperatureField;
    TextView precField;
    TextView minTempField;
    ImageView weatherIcon;
    private WeatherEntryViewModel viewModel;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        viewModel = ViewModelProviders.of(this).get(WeatherEntryViewModel.class);
        viewModel.init(localId);


        viewModel.getWeatherEntry().observe(this, weatherEntry -> {
            int id = weatherEntry.getData().get(0).getIdWeatherType();
            switch (id) {
                case 1:
                    weatherIcon.setImageResource(R.drawable.art_clear);
                    break;
                case 2:
                    weatherIcon.setImageResource(R.drawable.art_light_clouds);
                    break;
                case 3:
                    weatherIcon.setImageResource(R.drawable.art_light_clouds);
                    break;
                case 4:
                case 5:
                    weatherIcon.setImageResource(R.drawable.art_clouds);
                    break;
                case 6:
                    weatherIcon.setImageResource(R.drawable.art_light_clouds);
                    break;
                case 7:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 8:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 9:
                    weatherIcon.setImageResource(R.drawable.art_rain);
                    break;
                case 10:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 11:
                    weatherIcon.setImageResource(R.drawable.art_rain);
                    break;
                case 12:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 13:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 14:
                    weatherIcon.setImageResource(R.drawable.art_rain);
                    break;
                case 15:
                    weatherIcon.setImageResource(R.drawable.art_light_rain);
                    break;
                case 16:
                    weatherIcon.setImageResource(R.drawable.art_fog);
                    break;
                case 17:
                    weatherIcon.setImageResource(R.drawable.art_fog);
                    break;
                case 18:
                    weatherIcon.setImageResource(R.drawable.art_snow);
                    break;
                case 19:
                case 20:
                    weatherIcon.setImageResource(R.drawable.art_storm);
                    break;
                case 21:
                    weatherIcon.setImageResource(R.drawable.art_rain);
                    break;
                case 22:
                    weatherIcon.setImageResource(R.drawable.art_snow);
                    break;
                case 23:
                    weatherIcon.setImageResource(R.drawable.art_storm);
                    break;
                case 24:
                    weatherIcon.setImageResource(R.drawable.art_clouds);
                    break;
                case 25:
                    weatherIcon.setImageResource(R.drawable.art_light_clouds);
                    break;
                case 26:
                    weatherIcon.setImageResource(R.drawable.art_fog);
                    break;
                case 27:
                    weatherIcon.setImageResource(R.drawable.art_clouds);
                    break;
            }

            precField.setText(weatherEntry.getData().get(0).getPrecipitaProb());
            minTempField.setText(weatherEntry.getData().get(0).getTMin());
            temperatureField.setText(weatherEntry.getData().get(0).getTMax());
            currentDate.setText(weatherEntry.getData().get(0).getForecastDate());

        });

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);

        temperatureField = (TextView) v.findViewById(R.id.temperatureField);
        precField = (TextView) v.findViewById(R.id.precField);
        minTempField = (TextView) v.findViewById(R.id.minTempField);
        currentDate = (TextView) v.findViewById(R.id.currentDate);
        weatherIcon = (ImageView) v.findViewById(R.id.weatherIcon);


        return v;
    }
}
