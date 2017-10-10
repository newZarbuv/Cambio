package com.example.a12.cambioproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //create full screen window

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //adapt the image to the size of the display
        Display disp=getWindowManager().getDefaultDisplay();
        Point size=new Point();
        disp.getSize(size);
        Bitmap bmp=Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(),R.mipmap.game_background),size.x,size.y,true);
        //fill the image view with the bmp
        ImageView iv=(ImageView)findViewById(R.id.iv_back);
        iv.setImageBitmap(bmp);
    }
}
