package com.example.hadi.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by hadi on 09/07/2016.
 */
public class TestActivity extends AppCompatActivity {

    double temp1, temp2;
    String temp3, temp4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnSum = (Button) findViewById(R.id.btnSum);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnMult = (Button) findViewById(R.id.btnMult);
        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnEqual = (Button) findViewById(R.id.btnEqual);
        ImageButton imgbutton=(ImageButton) findViewById(R.id.imagebutton);
        final EditText editText1 = (EditText) findViewById(R.id.txt2);
        imgbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(TestActivity.this,MainActivity.class));
            }
                                     }
        );
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "1");
                startActivity(new Intent(TestActivity.this,Main5.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText(editText1.getText() + "0");
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = Double.parseDouble(editText1.getText().toString());
                temp3 = "+";
                editText1.setText("");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = Double.parseDouble(editText1.getText().toString());
                temp3 = "-";
                editText1.setText("");
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = Double.parseDouble(editText1.getText().toString());
                temp3 = "*";
                editText1.setText("");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp1 = Double.parseDouble(editText1.getText().toString());
                temp3 = "/";
                editText1.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp2 = Double.parseDouble(editText1.getText().toString());
                if (temp3.equals("+")) {
                    temp1 = temp1 + temp2;
                    editText1.setText(Double.toString(temp1));
                } else if (temp3.equals("-")) {
                    temp1 = temp1 - temp2;
                    editText1.setText(Double.toString(temp1));
                } else if (temp3.equals("*")) {
                    temp1 = temp1 * temp2;
                    editText1.setText(Double.toString(temp1));
                } else if (temp3.equals("/")) {
                    temp1 = temp1 / temp2;
                    editText1.setText(Double.toString(temp1));
                }
            }
        });
    }
}
