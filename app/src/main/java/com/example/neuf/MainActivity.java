package com.example.neuf;

import android.app.AlertDialog;
import android.content.DialogInterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tostart;
    Button toexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tostart = (Button)findViewById(R.id.tostart);
        toexit = (Button)findViewById(R.id.toexit);
        toexit.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            toTxit();
            }
        });
         //点击开始游戏后发生的事件
        tostart.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this,JeuActivity.class);
                MainActivity.this.startActivity(it);
            }
        });
    }

      public void toTxit(){
            new AlertDialog.Builder(this).setTitle("Vous voulez exit?")
                  .setPositiveButton("Oui",new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          // 点击“确认”后的操作
                          MainActivity.this.finish();
                      }
                  }) .setNegativeButton("Non",new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialog, int which) {
                  // 点击“否”后的操作
                  //Il fait rien
              }
              }).show();
     }


}
