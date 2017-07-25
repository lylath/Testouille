package com.example.niko.pocbynico;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Menu extends LoginActivity implements View.OnTouchListener, View.OnClickListener {

    private Button buttonSoutenance = null;
    private Button buttonPushIt = null;
    private Button buttonFeelPro = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonSoutenance = (Button) findViewById(R.id.soutenance);
        buttonSoutenance.setOnTouchListener(this);
        buttonSoutenance.setOnClickListener(this);

        buttonPushIt = (Button) findViewById(R.id.push_it);
        buttonPushIt.setOnTouchListener(this);
        buttonPushIt.setOnClickListener(this);

        buttonFeelPro = (Button) findViewById(R.id.feel_pro);
        buttonFeelPro.setOnTouchListener(this);
        buttonFeelPro.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.soutenance:
                Intent intent1 = new Intent(Menu.this, Soutenance.class);
                startActivity(intent1);
                break;
            case R.id.push_it:
                Intent intent2 = new Intent(Menu.this, Push_it.class);
                startActivity(intent2);
                break;
            case R.id.feel_pro:
                Intent intent3 = new Intent(Menu.this, Feel_pro.class);
                startActivity(intent3);
                break;
        }

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
