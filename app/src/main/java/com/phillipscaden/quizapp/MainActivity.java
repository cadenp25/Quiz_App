package com.phillipscaden.quizapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.SharedPreferences;
import android.widget.SeekBar;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     TextView displayText;

    int it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         SeekBar seekRed, seekBlue, seekBlue;
        setContentView(R.layout.activity_main);
        displayText=findViewById(R.id.textBox);


    }
}
