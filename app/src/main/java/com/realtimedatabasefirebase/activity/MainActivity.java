package com.realtimedatabasefirebase.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.realtimedatabasefirebase.R;
import com.realtimedatabasefirebase.api.MainCategory;
import com.realtimedatabasefirebase.api.MainCategoryApi;
import com.realtimedatabasefirebase.api.ProductsApi;
import com.realtimedatabasefirebase.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainCategoryApi.getMainCategoryApiResponse(this);
        ProductsApi.getProductsApiResponse(this);





    }
}
