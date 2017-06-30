package com.example.android.sunshine.utilities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.sunshine.R;

/**
 * Created by pujasudip on 6/22/17.
 */

public class ForeCastAdapter extends RecyclerView.Adapter<ForeCastAdapter.ForeCastAdapterViewHolder>{
    private String[] mWeatherData;

    public ForeCastAdapter() {
    }

    public class ForeCastAdapterViewHolder extends RecyclerView.ViewHolder{
        public final TextView mWeatherTextView ;

        public ForeCastAdapterViewHolder(View view) {
            super(view);
            this.mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }

    }

    @Override
    public ForeCastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttatchToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttatchToParentImmediately);
        return new ForeCastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForeCastAdapterViewHolder foreCastAdapterViewHolder, int position){
        String weatherForDisplay = mWeatherData[position];
        foreCastAdapterViewHolder.mWeatherTextView.setText(weatherForDisplay);
    }
    @Override
    public int getItemCount(){
        if(mWeatherData == null)
            return 0;
        return mWeatherData.length;
    }
    public void setmWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
}

