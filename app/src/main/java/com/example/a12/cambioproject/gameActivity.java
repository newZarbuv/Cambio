package com.example.a12.cambioproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.content.Intent;

public class gameActivity extends AppCompatActivity {

    private ImageView iv_Plr1;
    private ImageView iv_Plr2;
    private ImageView iv_Plr3;
    private ImageView iv_Plr4;
    private ImageView iv_Plr5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        initializeVariables();
        //get intent from settings activity and configure players
          Intent settIntent=getIntent();
        int playerNum=settIntent.getIntExtra("PLAYERS",2);
        switch(playerNum){
            case 2:
                iv_Plr3.setVisibility(View.GONE);
                iv_Plr4.setVisibility(View.GONE);
                iv_Plr5.setVisibility(View.GONE);
                break;

            case 3:
                iv_Plr3.setVisibility(View.GONE);
                iv_Plr4.setVisibility(View.GONE);
                break;

            case 4:
                iv_Plr5.setVisibility(View.GONE);
                break;

            default:
                break;


        }
  }

    private void initializeVariables(){
        iv_Plr1=(ImageView)findViewById(R.id.iv_player1);
        iv_Plr2=(ImageView)findViewById(R.id.iv_player2);
        iv_Plr3=(ImageView)findViewById(R.id.iv_player3);
        iv_Plr4=(ImageView)findViewById(R.id.iv_player4);
        iv_Plr5=(ImageView)findViewById(R.id.iv_player5);
    }
}
