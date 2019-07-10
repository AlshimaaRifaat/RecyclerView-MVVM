package com.cosmetics.recycler_mvvm.remote;

import com.cosmetics.recycler_mvvm.model.TripsData;
import com.cosmetics.recycler_mvvm.model.TripsResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    String baseUrl="http://omelqoura.com/api/";
    @POST("getTrip")
    Call<TripsResponse> onTripsResultList(@Body Map<String,String> map);
}
