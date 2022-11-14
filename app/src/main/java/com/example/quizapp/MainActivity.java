package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQ, question;
    Button b1, b2, b3, b4, b5;

    int score=0, Question = questions.question.length;
    int currentIndex=0;
    String selectedIndex="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQ = findViewById(R.id.textView);
        question = findViewById(R.id.textView2);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);

        totalQ.setText("Total questions are " + Question);
        loadNewQuestion();
    }

    public void onClick(View view)
    {

    }

    void loadNewQuestion()
    {
        question.setText(questions.question[currentIndex]);
        b1.setText(questions.options[currentIndex][0]);
        b2.setText(questions.options[currentIndex][1]);
        b3.setText(questions.options[currentIndex][2]);
        b4.setText(questions.options[currentIndex][3]);
    }
}



