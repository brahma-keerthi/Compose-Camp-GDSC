package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   4 TextViews in activity
        TextView view1 = (TextView) findViewById(R.id.textView);
        TextView view2 = (TextView) findViewById(R.id.textView2);
        TextView view3 = (TextView) findViewById(R.id.textView3);
        TextView view4 = (TextView) findViewById(R.id.textView4);
    }
}