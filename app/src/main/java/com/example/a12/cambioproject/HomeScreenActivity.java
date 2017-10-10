package com.example.a12.cambioproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class HomeScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


    }



    public void btnPlayClicked(View view) {

        Intent i= new Intent(HomeScreenActivity.this,gameSettings.class);
        startActivity(i);

    }


    public void aboutUsButtonClick(View view){
                Intent i=new Intent(HomeScreenActivity.this,aboutUsActivity.class);
                startActivity(i);
    }



}
