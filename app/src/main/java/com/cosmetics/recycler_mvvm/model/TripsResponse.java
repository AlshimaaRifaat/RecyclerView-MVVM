package com.cosmetics.recycler_mvvm.model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TripsResponse implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<TripsData> data = null;
    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("error")
    @Expose
    private String error;
    private final static long serialVersionUID = 4102637374983477694L;

    public List<TripsData> getData() {
        return data;
    }

    public void setData(List<TripsData> data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
