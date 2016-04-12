package com.tzc.retrofitsample;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by tzc on 16/4/12.
 */
public interface Weather {

    @GET("101010100.html")
    Observable<Object> weather();
}
