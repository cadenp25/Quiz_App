package com.phillipscaden.quizapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

     TextView displayText;

    int it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         Button submitButton1, submitButton2, submitButton3;
        setContentView(R.layout.activity_main);
        displayText=findViewById(R.id.textBox);
        submitButton1=findViewById(R.id.clickButtonR);
        submitButton2=findViewById(R.id.clickButtonG);
        submitButton3=findViewById(R.id.clickButtonB);
        submitButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                it++;
                System.out.println("roja");
                 Log.i("r", "red" + it);
                displayText.setTextColor(Color.RED);
                displayText.setText(" " + it);
            }
        });

        submitButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                it++;
                System.out.println("verde");
                Log.i("g", "green" + it);
                displayText.setTextColor(Color.GREEN);
                displayText.setText(" " + it);
            }
        });

        submitButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                it++;
                System.out.println("azul");
                Log.i("b", "blue" + it);
                displayText.setTextColor(Color.BLUE);
                displayText.setText(" " + it);
            }
        });

    }
}
