package com.example.hadi.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by hadi on 09/08/2016.
 */
public class ListView1 extends AppCompatActivity {
    ListView listView ;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.listview1);
        listView = (ListView) findViewById(R.id.Lview);

        String[] values = new String[] { "hadi saeidi0",
                "hadi saeidi1",
                "hadi saeidi2",
                "hadi saeidi3",
                "hadi saeidi4",
                "hadi saeidi5",
                "hadi saeidi6",
                "hadi saeidi7",
                "hadi saeidi8",
                "hadi saeidi9",
                "hadi saeidi10"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
    }
}
