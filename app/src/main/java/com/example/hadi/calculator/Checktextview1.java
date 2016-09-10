package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;

/**
 * Created by hadi on 09/08/2016.
 */
public class Checktextview1 extends AppCompatActivity {

    CheckedTextView chkBox1, chkBox2, chkBox3, chkBox4, chkBox5, chkBox6, chkBox7, chkBox8, chkBox9;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checktextview);

        chkBox1 = (CheckedTextView) findViewById(R.id.checkedTextView1);
        chkBox2 = (CheckedTextView) findViewById(R.id.checkedTextView2);
        chkBox3 = (CheckedTextView) findViewById(R.id.checkedTextView3);
        chkBox4 = (CheckedTextView) findViewById(R.id.checkedTextView4);
        chkBox5 = (CheckedTextView) findViewById(R.id.checkedTextView5);
        chkBox6 = (CheckedTextView) findViewById(R.id.checkedTextView6);
        chkBox7 = (CheckedTextView) findViewById(R.id.checkedTextView7);
        chkBox8 = (CheckedTextView) findViewById(R.id.checkedTextView8);
        chkBox9 = (CheckedTextView) findViewById(R.id.checkedTextView9);
        chkBox1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        chkBox9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (((CheckedTextView) v).isChecked()) {
                    ((CheckedTextView) v).setChecked(false);
                } else {
                    ((CheckedTextView) v).setChecked(true);
                }
            }
        });
        Button btn = (Button) findViewById(R.id.btnnew);
        btn.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       if (chkBox1.isChecked()) {
                                           startActivity(new Intent(Checktextview1.this, TestActivity.class));
                                       } else {
                                           startActivity(new Intent(Checktextview1.this, MainActivity.class));
                                       }
                                   }
                               }
        );
    }
}
