package com.example.carolina.solapp.Fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carolina.solapp.R;
import com.example.carolina.solapp.WeatherEntryViewModel;

public class FurtherDataFragment extends Fragment {
    private WeatherEntryViewModel viewModel;
    private static final String localId = "1010500";

//    TextView Precipitation;
//    TextView TempMin;

    TextView currentDateFirst;
    TextView tempMinFirst;
    TextView tempMaxFirst;
    TextView precFirst;

    TextView currentDateSecond;
    TextView tempMinSecond;
    TextView tempMaxSecond;
    TextView precSecond;


    TextView currentDateThird;
    TextView tempMinThird;
    TextView tempMaxThird;
    TextView precThird;


    public FurtherDataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(this).get(WeatherEntryViewModel.class);
        viewModel.init(localId);

        viewModel.getWeatherEntry().observe(this, weatherEntry -> {

            currentDateFirst.setText(weatherEntry.getData().get(1).getForecastDate());
            tempMinFirst.setText(weatherEntry.getData().get(1).getTMin());
            tempMaxFirst.setText(weatherEntry.getData().get(1).getTMax());
            precFirst.setText(weatherEntry.getData().get(1).getPrecipitaProb());

            currentDateSecond.setText(weatherEntry.getData().get(2).getForecastDate());
            tempMinSecond.setText(weatherEntry.getData().get(2).getTMin());
            tempMaxSecond.setText(weatherEntry.getData().get(2).getTMax());
            precSecond.setText(weatherEntry.getData().get(2).getPrecipitaProb());


            currentDateThird.setText(weatherEntry.getData().get(3).getForecastDate());
            tempMinThird.setText(weatherEntry.getData().get(3).getTMin());
            tempMaxThird.setText(weatherEntry.getData().get(3).getTMax());
            precThird.setText(weatherEntry.getData().get(3).getPrecipitaProb());

        });

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.further_layout, container, false);


        currentDateFirst = (TextView)v.findViewById(R.id.currentDateFirst);
        currentDateSecond = (TextView)v.findViewById(R.id.currentDateSecond);
        currentDateThird = (TextView)v.findViewById(R.id.currentDateThird);

        tempMaxFirst = (TextView)v.findViewById(R.id.tempMaxFirst);
        tempMaxSecond = (TextView)v.findViewById(R.id.tempMaxSecond);
        tempMaxThird = (TextView)v.findViewById(R.id.tempMaxThird);

        tempMinFirst = (TextView)v.findViewById(R.id.tempMinFirst);
        tempMinSecond = (TextView)v.findViewById(R.id.tempMinSecond);
        tempMinThird = (TextView)v.findViewById(R.id.tempMinThird);

        precFirst = (TextView)v.findViewById(R.id.precFirst);
        precSecond = (TextView)v.findViewById(R.id.precSecond);
        precThird = (TextView)v.findViewById(R.id.precThird);

        return v;
    }
}
