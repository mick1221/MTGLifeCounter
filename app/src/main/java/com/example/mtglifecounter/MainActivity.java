package com.example.mtglifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView lifeTotal;
        Button plusFive;
        Button minusFive;
        Button plusOne;
        Button minusOne;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intalizing objects

        lifeTotal = findViewById(R.id.lifeTotal);
        plusFive = findViewById(R.id.plusFive);
        minusFive = findViewById(R.id.minusFive);
        plusOne = findViewById(R.id.plusOne);
        minusOne = findViewById(R.id.minusOne);
    }
}
