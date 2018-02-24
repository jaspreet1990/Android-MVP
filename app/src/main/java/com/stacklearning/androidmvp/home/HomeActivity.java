package com.stacklearning.androidmvp.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stacklearning.androidmvp.R;

public class HomeActivity extends AppCompatActivity implements HomeView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
