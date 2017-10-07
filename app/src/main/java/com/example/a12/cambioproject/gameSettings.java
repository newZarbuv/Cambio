package com.example.a12.cambioproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;

import java.security.PrivateKey;

public class gameSettings extends AppCompatActivity {

    private SeekBar seekPlayers;
    private SeekBar seekLevel;
    private TextView txtPlayers;
    private TextView txtLevel;
    private static int LEVEL_MIN_VALUE=3;
    private static int LEVEL_MAX_VALUE=5;
    private static int PLAYERS_MIN_VALUE=2;
    private static int PLAYERS_MAX_VALUE=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_settings);
        NumberPicker num=(NumberPicker)findViewById(R.id.numPicLevel);
        num.setMinValue(3);
        num.setMaxValue(5);
        initializeVariables();
        txtPlayers.setText(Integer.toString(seekPlayers.getProgress()));
        txtLevel.setText(Integer.toString(seekLevel.getProgress()));
         seekLevel.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
               int progress = 3;


               @Override
               public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                   if(i<=LEVEL_MIN_VALUE){
                       progress=LEVEL_MIN_VALUE;
                   }
                   else {
                       progress = i;
                   }
               }


             @Override
             public void onStartTrackingTouch(SeekBar seekBar) {

             }

            @Override
             public void onStopTrackingTouch(SeekBar seekBar) {
                 txtLevel.setText(Integer.toString(seekLevel.getProgress()));
              }
           });
    }





      //  seekPlayers.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
     //       int progress = 0;


      //      @Override
     //       public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
      //          progress=i;

      //      }

      //      @Override
      //      public void onStartTrackingTouch(SeekBar seekBar) {

       //     }

       //     @Override
       //     public void onStopTrackingTouch(SeekBar seekBar) {
       //         txtPlayers.setText(seekLevel.getProgress());
     //       }
      //  });
  //  }


    private void initializeVariables(){
        seekPlayers=(SeekBar)findViewById(R.id.seekNum);
        seekLevel=(SeekBar)findViewById(R.id.seekLevel);
        txtLevel=(TextView)findViewById(R.id.txtShowLevel);
        txtPlayers=(TextView)findViewById(R.id.txtShowNum);
        seekPlayers.setMax(PLAYERS_MAX_VALUE);
        seekLevel.setMax(LEVEL_MAX_VALUE);

    }
}
