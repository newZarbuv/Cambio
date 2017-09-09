package com.example.a12.cambioproject;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    protected void btnStart1Click(View v) {
        Button btnBack = (Button) findViewById(R.id.btnStart1);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), GameSettingActivity.class);
                startActivity(i);
            }
        });
    }

    protected void btnHowToClick(View v) {
        Button btnBack = (Button) findViewById(R.id.btnHowTo);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), howToPlay.class);
                startActivity(i);
            }
        });
    }

    protected void btnAboutClick(View v) {
        Button btnBack = (Button) findViewById(R.id.btnAbout);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), aboutUs.class);
                startActivity(i);
            }
        });
    }
}
