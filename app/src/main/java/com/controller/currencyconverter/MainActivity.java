package com.controller.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click (View view){
        EditText currency=(EditText)  findViewById(R.id.currency);
        String amountInRupee= currency.getText().toString();
        Double amountInRupeeDouble=Double.parseDouble(amountInRupee);
        Double amountInDollar=amountInRupeeDouble*0.013;
        TextView dollar =(TextView) findViewById(R.id.dollar);
        dollar.setText("$ "+amountInDollar);
        Toast.makeText(this, "$ "+amountInDollar, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}