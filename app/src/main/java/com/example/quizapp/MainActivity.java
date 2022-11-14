package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalQ, question;
    Button b1, b2, b3, b4, b5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);totalQ = findViewById(R.id.textView);
        question = findViewById(R.id.textView2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2)
        b3 = findViewById(R.id.button3;
        b4 = findViewById(R.id.button4;
        b5 = findViewById(R.id.button5);
    }

}



