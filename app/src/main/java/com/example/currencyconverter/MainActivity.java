package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View v){
        //  Extracting the views from layout by their ids
        EditText input = (EditText) findViewById(R.id.input);
        TextView output = (TextView) findViewById(R.id.output);
        //  Extract the input to string
        String userInput = input.getText().toString();

        //  If the input field ( Edittext ) is empty
        if ( userInput.isEmpty() ){
            Toast.makeText(MainActivity.this, "Please Enter the amount in USD", Toast.LENGTH_SHORT).show();
        }

        else{
            // Convert string to decimal (double)
            double usd = Double.parseDouble(userInput);
            double inr = usd * 79.34 ;

           //  Output the inr
            output.setText(userInput + " USD = " + String.format("%.2f", inr) + " INR");

            Toast.makeText(MainActivity.this, "Thanks for using :)", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}