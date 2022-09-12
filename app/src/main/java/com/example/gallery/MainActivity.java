package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Extracting listView
        ListView listView = (ListView) findViewById(R.id.listView);

        // array of string to display in Activity
        String arr[] = { "Welcome", "To", "Compose", "Camp", "Hope", "You", "All", "Had",
                            "Great", "Day"};

        // Creating array adapter this convert array to list view
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arr);
        listView.setAdapter(ad);
    }
}