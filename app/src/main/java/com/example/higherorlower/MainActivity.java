package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void randomGenerator(){
        Random randGen = new Random();
        randomNumber = randGen.nextInt(1000)+1;
    }
    public void guess(View view){
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int guessNumber = Integer.parseInt(editText.getText().toString());

        String message="";

        if (randomNumber > guessNumber){
            message = "Higher!!";
        } else if(randomNumber < guessNumber){
            message = "Lower!";
        }else{
            message = "Correct! Try again!";
            randomGenerator();
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        Log.i("entered value", editText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        randomGenerator();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}