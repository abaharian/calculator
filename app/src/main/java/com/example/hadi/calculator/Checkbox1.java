package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by hadi on 09/08/2016.
 */
public class Checkbox1 extends AppCompatActivity {
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.checkbox1);
        Button btn = (Button) findViewById(R.id.btnCheck);
        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View view) {
                                       CheckBox chbox1 = (CheckBox) findViewById(R.id.chbox);
                                       if (chbox1.isChecked()) {
                                           startActivity(new Intent(Checkbox1.this, MainActivity.class));
                                       }
                                   }
                               }
        );
    }
}
