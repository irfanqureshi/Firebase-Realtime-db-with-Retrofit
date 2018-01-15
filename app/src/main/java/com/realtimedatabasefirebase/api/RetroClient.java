package com.realtimedatabasefirebase.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SIS310 on 10/24/2016.
 */
public class RetroClient {

    public static Retrofit getRetroClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(logging);

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder()

                .baseUrl("https://realtimedatabasefirebase-34c22.firebaseio.com/")
                .addConverterFactory(GsonConverterFactory.create(gson)).client(httpClient
                        .readTimeout(40, TimeUnit.SECONDS)
                        .connectTimeout(40, TimeUnit.SECONDS)
                        .build()).build();
    }


    public static ApiService getApiService() {
        return getRetroClient().create(ApiService.class);

    }

}
