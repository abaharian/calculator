package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ToggleButton;

/**
 * Created by hadi on 09/08/2016.
 */
public class Togglebutton1 extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.togglebutton1);
        ToggleButton Tbtn=(ToggleButton) findViewById(R.id.togglebutton1);
        if(Tbtn.isChecked()==false){
            startActivity(new Intent(Togglebutton1.this,TestActivity.class));
        }
    }
}
