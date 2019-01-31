package com.example.isavior;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RingOfFire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring_of_fire);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
