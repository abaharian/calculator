package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hadi on 09/07/2016.
 */
public class Main5 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main5);
        ImageView img = (ImageView) findViewById(R.id.imageview1);
        img.setImageResource(R.drawable.hadi);
        Button btn=(Button) findViewById(R.id.btnMain5);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                startActivity(new Intent(Main5.this,Main6.class));
            }
            catch(Exception e){
//                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//                alertDialogBuilder.setMessage("Are you sure,You wanted to make decision");
            }}
        });

    }
}