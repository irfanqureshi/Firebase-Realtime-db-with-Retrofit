package com.realtimedatabasefirebase.api;

import android.content.Context;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SIS310 on 1/11/2017.
 */
public class ProductsApi {
    static String TAG = ProductsApi.class.getSimpleName();
    private static Context mContext;

    public static void getProductsApiResponse( final Context context) {
        //final ProgressBarHandler progressBarHandler = new ProgressBarHandler(context);
        // progressBarHandler.showProgressbar();
        mContext = context;
        ApiService apiService = RetroClient.getApiService();
        Call<Products> call = apiService.getProducts();

        call.enqueue(new Callback<Products>() {
            @Override
            public void onResponse(Call<Products> call, Response<Products> response) {
                try {
                    Products products = response.body();
                    Log.e(TAG, "onResponse: " +products);

                } catch (Exception e) {
                    Log.e(TAG, "exception in main category api.." + e);

                }
            }

            @Override
            public void onFailure(Call<Products> call, Throwable t) {
                Log.e(TAG, "inside failure.." + t.getMessage());
                // progressBarHandler.hideProgressbar();
                //mainFragment.setEmptyView();
                //mainFragment.mSwipeRefreshLayout.setRefreshing(false);

            }
        });
    }


}
