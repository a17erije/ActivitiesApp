package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String title = getIntent().getStringExtra("mountainName");
        Log.d("a17erijeTitle", title);
        Integer height = getIntent().getIntExtra("mountainHeight", 1);
        Log.d("a17erijeHeight", height.toString());
        String location = getIntent().getStringExtra("mountainLocation");
        Log.d("a17erijelocation", location);

        final TextView titleText = (TextView) findViewById(R.id.titleTextView);
        final TextView heightText = (TextView) findViewById(R.id.height);
        final TextView LocationText = (TextView) findViewById(R.id.location);

        titleText.setText(title);
        heightText.setText(height.toString() + " meters tall.");
        LocationText.setText("Located in " + location + ".");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
