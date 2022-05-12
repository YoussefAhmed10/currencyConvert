package com.example.currencychanges;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeCurrency(View view){
        Log.i("info","Converted Successfully");
        EditText text = findViewById(R.id.currency);
        String amountInEgp = text.getText().toString() ;
        double amountInEgpInDouble = Double.parseDouble(amountInEgp);
        double amountInUsdInDouble = amountInEgpInDouble * 18.39 ;
        String amountInUsd = Double.toString(amountInUsdInDouble);
        Toast.makeText(this, amountInUsd, Toast.LENGTH_LONG).show();
        Log.i("text",text.getText().toString());
    }
}