package com.realtimedatabasefirebase.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by SIS310 on 10/24/2016.
 */
public interface ApiService {

    @GET("categories.json")
    Call<MainCategory> getMainCategories();

    @GET("products.json")
    Call<Products> getProducts();
}
