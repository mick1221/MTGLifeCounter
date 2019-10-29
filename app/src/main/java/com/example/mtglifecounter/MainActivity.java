package com.example.mtglifecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final TextView lifeTotal;
        Button plusFive;
        Button minusFive;
        Button plusOne;
        Button minusOne;
        Button reset;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning objects to widgets

        lifeTotal = findViewById(R.id.lifeTotal);
        plusFive = findViewById(R.id.plusFive);
        minusFive = findViewById(R.id.minusFive);
        plusOne = findViewById(R.id.plusOne);
        minusOne = findViewById(R.id.minusOne);
        reset = findViewById(R.id.reset);



        //adds 5 to life
        plusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String lifeString = lifeTotal.getText().toString();//get current life from textview
                Integer life=Integer.parseInt(lifeString.trim());//parse the integer
                life+=5;//increment
                lifeTotal.setText(life.toString());//print new total
            }
        });

        //subtracts 5 from life
         minusFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String lifeString = lifeTotal.getText().toString();
                Integer life=Integer.parseInt(lifeString.trim());
                life-=5;
                lifeTotal.setText(life.toString());
            }
        });

         //adds one to life
        plusOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String lifeString = lifeTotal.getText().toString();
                Integer life=Integer.parseInt(lifeString.trim());
                life+=1;
                lifeTotal.setText(life.toString());
            }
        });

        //subtracts one from life
        minusOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String lifeString = lifeTotal.getText().toString();
                Integer life=Integer.parseInt(lifeString.trim());
                life-=1;
                lifeTotal.setText(life.toString());
            }
        });


        //Resets the life counter  to 40
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Integer life=40;
                lifeTotal.setText(life.toString());
            }
        });
    }
}
