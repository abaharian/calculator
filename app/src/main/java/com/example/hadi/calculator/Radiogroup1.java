package com.example.hadi.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by hadi on 09/08/2016.
 */
public class Radiogroup1 extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton sound, vibration, silent;
    private Button button,button2;
    private TextView textView;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.radiogroup1);
        radioGroup = (RadioGroup) findViewById(R.id.myRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.silent) {
                    Toast.makeText(getApplicationContext(), "choice: Silent",
                            Toast.LENGTH_SHORT).show();
                } else if(checkedId == R.id.sound) {
                    Toast.makeText(getApplicationContext(), "choice: Sound",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "choice: Vibration",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        sound = (RadioButton) findViewById(R.id.sound);
        vibration = (RadioButton) findViewById(R.id.vibration);
        silent = (RadioButton) findViewById(R.id.silent);
        textView = (TextView) findViewById(R.id.text);
        button = (Button)findViewById(R.id.chooseBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                // find which radioButton is checked by id
                if(selectedId == sound.getId()) {
                    textView.setText("You chose 'Sound' option");
                } else if(selectedId == vibration.getId()) {
                    textView.setText("You chose 'Vibration' option");
                } else {
                    textView.setText("You chose 'Silent' option");
                }
            }
        });
        button2=(Button) findViewById(R.id.chooseBtn2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Radiogroup1.this, Radiobutton1.class));
            }
        });
    }
}
