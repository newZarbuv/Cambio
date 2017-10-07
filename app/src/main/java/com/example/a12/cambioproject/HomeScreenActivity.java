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
        Log.d("ronLog","entered on create");

    }



    public void btnPlayClicked(View view) {
        Log.d("ronLog","Btton clicked");
        Intent i= new Intent(HomeScreenActivity.this,gameSettings.class);
        startActivity(i);

    }


  //  protected void aboutUsButtonClick(){
    //    Button btnAbout=(Button) findViewById(R.id.aboutUsButton);
      //  btnAbout.setOnClickListener(new View.OnClickListener() {
        //    @Override
          //  public void onClick(View v) {
            //    Intent i=new Intent(HomeScreenActivity.this,aboutUsActivity.class);
              //  startActivity(i);
            //}
      //  });
    //}

}
