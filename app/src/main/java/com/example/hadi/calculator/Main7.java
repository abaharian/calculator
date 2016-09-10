package com.example.hadi.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;


/**
 * Created by hadi on 09/08/2016.
 */
public class Main7 extends AppCompatActivity {
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main7);
        ArrayAdapter adapter1=new ArrayAdapter<String>(this,R.layout.main7,mobileArray);
        ListView list=(ListView) findViewById(R.id.listview1);
        list.setAdapter(adapter1);
    }
}
