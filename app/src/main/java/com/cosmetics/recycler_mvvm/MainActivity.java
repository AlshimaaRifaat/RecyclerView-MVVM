package com.cosmetics.recycler_mvvm;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cosmetics.recycler_mvvm.adapter.TripsAdapter;
import com.cosmetics.recycler_mvvm.model.TripsData;
import com.cosmetics.recycler_mvvm.viewmodel.TripsViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TripsAdapter tripsAdapter;

    List<TripsData> tripsData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TripsViewModel tripsViewModel= ViewModelProviders.of(this).get(TripsViewModel.class);
        tripsViewModel.getTrips().observe(this, new Observer<List<TripsData>>() {
            @Override
            public void onChanged(@Nullable List<TripsData> tripsData) {
                tripsAdapter = new TripsAdapter(MainActivity.this, tripsData);
                recyclerView.setAdapter(tripsAdapter);
            }
        });
    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerview);
    }
}
