package com.example.carolina.solapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WeatherEntry {
    Map<String,String> locals =  new HashMap<>();


    private String localId;

    @SerializedName("precipitaProb")
    @Expose

    private String precitaProb;
    @SerializedName("tMin")
    @Expose

    private String tMin;
    @SerializedName("tMax")
    @Expose

    private String tMax;
    @SerializedName("forecastDate")
    @Expose

    private String forecastDate;


    private List<WeatherEntryData> data = null;

    public List<WeatherEntryData> getData() {
        return data;
    }

    public void setData(List<WeatherEntryData> data) {
        this.data = data;
    }



   /* public Date getData_atualizacao() {
        return data_atualizacao;
    }

    public void setData_atualizacao(Date data_atualizacao) {
        this.data_atualizacao = data_atualizacao;
    }*/

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public String getPrecitaProb() {
        return precitaProb;
    }

    public void setPrecitaProb(String precitaProb) {
        this.precitaProb = precitaProb;
    }

    public String gettMin() {
        return tMin;
    }

    public void settMin(String tMin) {
        this.tMin = tMin;
    }

    public String gettMax() {
        return tMax;
    }

    public void settMax(String tMax) {
        this.tMax = tMax;
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

}
