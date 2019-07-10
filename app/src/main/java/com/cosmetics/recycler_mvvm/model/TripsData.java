package com.cosmetics.recycler_mvvm.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TripsData implements Serializable
{

    @SerializedName("tripId")
    @Expose
    private String tripId;
    @SerializedName("tripName")
    @Expose
    private String tripName;
    @SerializedName("companyId")
    @Expose
    private String companyId;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("guideName")
    @Expose
    private String guideName;
    @SerializedName("driverName")
    @Expose
    private String driverName;
    @SerializedName("busName")
    @Expose
    private String busName;
    @SerializedName("numberPassenger")
    @Expose
    private String numberPassenger;
    @SerializedName("dateStart")
    @Expose
    private String dateStart;
    @SerializedName("dateEnd")
    @Expose
    private String dateEnd;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("latStart")
    @Expose
    private String latStart;
    @SerializedName("lngStart")
    @Expose
    private String lngStart;
    @SerializedName("latEnd")
    @Expose
    private String latEnd;
    @SerializedName("lngEnd")
    @Expose
    private String lngEnd;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusId")
    @Expose
    private String statusId;
    private final static long serialVersionUID = -1423950946740793209L;

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(String numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getLatStart() {
        return latStart;
    }

    public void setLatStart(String latStart) {
        this.latStart = latStart;
    }

    public String getLngStart() {
        return lngStart;
    }

    public void setLngStart(String lngStart) {
        this.lngStart = lngStart;
    }

    public String getLatEnd() {
        return latEnd;
    }

    public void setLatEnd(String latEnd) {
        this.latEnd = latEnd;
    }

    public String getLngEnd() {
        return lngEnd;
    }

    public void setLngEnd(String lngEnd) {
        this.lngEnd = lngEnd;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

}
