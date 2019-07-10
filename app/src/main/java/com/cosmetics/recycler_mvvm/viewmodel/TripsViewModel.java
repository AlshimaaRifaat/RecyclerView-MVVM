package com.cosmetics.recycler_mvvm.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.cosmetics.recycler_mvvm.model.TripsData;
import com.cosmetics.recycler_mvvm.model.TripsResponse;
import com.cosmetics.recycler_mvvm.remote.APIService;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TripsViewModel extends ViewModel {
    private MutableLiveData<List<TripsData>> tripList;

    public LiveData<List<TripsData>> getTrips() {
        if (tripList == null) {
            tripList = new MutableLiveData<List<TripsData>>();
            loadTrips();
        }
        return tripList;
    }


   private void loadTrips() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lang", "en");
        hashMap.put("user_token", "RqhiNML0MZYKbx4TsNzSEBAWYMlTIGvycWOSgAUcZbQOxI88RfP5ipeVNYa1");
        hashMap.put("type", "1");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(APIService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       APIService apiService = retrofit.create(APIService.class);
       Call<TripsResponse> call = apiService.onTripsResultList(hashMap);

       call.enqueue(new Callback<TripsResponse>() {
           @Override
           public void onResponse(Call<TripsResponse> call, Response<TripsResponse> response) {
               if (response.isSuccessful()) {
                   tripList.setValue(response.body().getData());
               }
           }

           @Override
           public void onFailure(Call<TripsResponse> call, Throwable t) {

           }
       });
   }
}