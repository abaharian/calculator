package com.example.hadi.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button btn = (Button) findViewById(R.id.btnA1);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       //Intent call=new Intent(MainActivity.this,TestActivity.class);
                                       startActivity(new Intent(MainActivity.this, Main3.class));
                                   }
                               }
        );
    }
}