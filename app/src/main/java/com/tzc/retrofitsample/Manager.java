package com.tzc.retrofitsample;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tzc on 16/4/12.
 */
public class Manager {

    static Retrofit provideRestAdapter() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.weather.com.cn/data/sk/")
//                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return retrofit;
    }

    static Weather proviceWeather() {
        return provideRestAdapter().create(Weather.class);
    }


}
