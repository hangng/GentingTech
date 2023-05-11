package com.practice.genting_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.myapplication.R;
import com.google.firebase.FirebaseApp;
import com.practice.genting_test.components.FirebaseService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView mCvCheckIn, mCvCheckOut, mCvSyncUp, mCvLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseApp.initializeApp(this);

        mCvCheckIn = findViewById(R.id.cv_check_in);
        mCvCheckOut = findViewById(R.id.cv_check_out);
        mCvSyncUp = findViewById(R.id.cv_sync_up);
        mCvLogout = findViewById(R.id.cv_logout);

        mCvCheckIn.setOnClickListener(this);
        mCvCheckOut.setOnClickListener(this);
        mCvSyncUp.setOnClickListener(this);
        mCvLogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (mCvCheckIn == v) {

        } else if (mCvCheckOut == v) {

        } else if (mCvSyncUp == v) {

        } else if (mCvLogout == v) {

        }
    }
}