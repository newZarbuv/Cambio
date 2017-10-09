package com.example.a12.cambioproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;

import java.security.PrivateKey;

public class gameSettings extends AppCompatActivity {


    private static int LEVEL_MIN_VALUE=3;
    private static int LEVEL_MAX_VALUE=5;
    private static int PLAYERS_MIN_VALUE=2;
    private static int PLAYERS_MAX_VALUE=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_settings);
        //initializing cambio level number picker
        NumberPicker nLevel=(NumberPicker)findViewById(R.id.numPicLevel);
        nLevel.setMinValue(LEVEL_MIN_VALUE);
        nLevel.setMaxValue(LEVEL_MAX_VALUE);
        //initializing number of players number picker
        NumberPicker nPlayers=(NumberPicker)findViewById(R.id.numPicPlayers);
        nPlayers.setMinValue(PLAYERS_MIN_VALUE);
        nPlayers.setMaxValue(PLAYERS_MAX_VALUE);


    }








}
