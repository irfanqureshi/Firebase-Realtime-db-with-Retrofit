package com.realtimedatabasefirebase.api;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SIS310 on 1/11/2017.
 */
public class MainCategoryApi {
    static String TAG = MainCategoryApi.class.getSimpleName();
    private static Context mContext;

    public static void getMainCategoryApiResponse( final Context context) {
        //final ProgressBarHandler progressBarHandler = new ProgressBarHandler(context);
        // progressBarHandler.showProgressbar();
        mContext = context;
        ApiService apiService = RetroClient.getApiService();
        Call<MainCategory> call = apiService.getMainCategories();

        call.enqueue(new Callback<MainCategory>() {
            @Override
            public void onResponse(Call<MainCategory> call, Response<MainCategory> response) {
                try {
                    MainCategory mainCategory = response.body();
                    Log.e(TAG, "onResponse: " +mainCategory);

                } catch (Exception e) {
                    Log.e(TAG, "exception in main category api.." + e);

                }
            }

            @Override
            public void onFailure(Call<MainCategory> call, Throwable t) {
                Log.e(TAG, "inside failure.." + t.getMessage());
                // progressBarHandler.hideProgressbar();
                //mainFragment.setEmptyView();
                //mainFragment.mSwipeRefreshLayout.setRefreshing(false);

            }
        });
    }


}
