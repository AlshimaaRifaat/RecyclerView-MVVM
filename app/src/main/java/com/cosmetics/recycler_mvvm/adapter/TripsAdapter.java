package com.cosmetics.recycler_mvvm.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cosmetics.recycler_mvvm.R;
import com.cosmetics.recycler_mvvm.model.TripsData;

import java.util.List;

public class TripsAdapter extends RecyclerView.Adapter<TripsAdapter.ViewHolder> {

    Context context;
    List<TripsData> tripsDataList;

    public TripsAdapter(Context context, List<TripsData> tripsDataList) {
        this.context = context;
        this.tripsDataList = tripsDataList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_trips, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Glide.with(context).load("").into(holder.imageView);
        holder.textView.setText(tripsDataList.get(position).getTripName());
    }

    public int getItemCount() {
        return tripsDataList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        //ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
           //imageView = itemView.findViewById(R.id.image1);
           textView = itemView.findViewById(R.id.text1);
        }
    }
}
