package com.example.neuf;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

/**
 * Created by 张广洁 on 2017/10/21.
 */

public class JeuActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeu);
        init();
    }

    private void init(){
        LinearLayout anneaux = (LinearLayout)findViewById(R.id.anneaux);
        final DrawView view = new DrawView(this);
        view.setMinimumHeight(550);
        view.setMinimumWidth(300);
        view.invalidate();
        anneaux.addView(view);
    }

}
