package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by hadi on 09/08/2016.
 */
public class Radiobutton1 extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.radiobutton1);
        Button btnRadioo = (Button) findViewById(R.id.btnRadio);
        final RadioButton Rbtn1, Rbtn2, Rbtn3, Rbtn4, Rbtn5;
        Rbtn1 = (RadioButton) findViewById(R.id.radio1);
        Rbtn2 = (RadioButton) findViewById(R.id.radio2);
        Rbtn3 = (RadioButton) findViewById(R.id.radio3);
        Rbtn4 = (RadioButton) findViewById(R.id.radio4);
        Rbtn5 = (RadioButton) findViewById(R.id.radio5);
        btnRadioo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Rbtn1.isChecked()) {
                    startActivity(new Intent(Radiobutton1.this, MainActivity.class));
                } else if (Rbtn2.isChecked()) {
                    startActivity(new Intent(Radiobutton1.this, TestActivity.class));
                } else if (Rbtn3.isChecked()) {
                    startActivity(new Intent(Radiobutton1.this, Main3.class));
                } else if (Rbtn4.isChecked()) {
                    startActivity(new Intent(Radiobutton1.this, Main4.class));
                } else if (Rbtn5.isChecked()) {
                    startActivity(new Intent(Radiobutton1.this, Main5.class));
                }
            }
        });
    }
}
