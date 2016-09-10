package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hadi on 09/07/2016.
 */
public class Main4 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        Button btn1 = (Button) findViewById(R.id.btnMain4);
        Button btnn = (Button) findViewById(R.id.btnMain6);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main4.this,TestActivity.class));
            }
        });
        btnn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main4.this,Main5.class));
            }
        });
    }
}
