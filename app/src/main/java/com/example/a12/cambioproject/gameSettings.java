package com.example.a12.cambioproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class gameSettings extends AppCompatActivity {

    private SeekBar seekPlayers;
    private SeekBar seekLevel;
    private TextView txtPlayers;
    private TextView txtLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_settings);
    }
      //  initializeVariables();
     //   txtPlayers.setText( seekPlayers.getProgress());
     //   txtLevel.setText(seekLevel.getProgress());

    //    seekLevel.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
     //       int progress = 0;


     //       @Override
     //       public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
      //          progress=i;



       //     @Override
       //     public void onStartTrackingTouch(SeekBar seekBar) {

       //     }

        //    @Override
       //     public void onStopTrackingTouch(SeekBar seekBar) {
       //         txtLevel.setText(seekLevel.getProgress());
      //      }
     //   });

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
    }
}
