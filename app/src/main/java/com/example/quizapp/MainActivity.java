package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
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

    @Override
    public void onClick(View view)
    {
        b1.setBackgroundColor(Color.BLACK);
        b2.setBackgroundColor(Color.BLACK);
        b3.setBackgroundColor(Color.BLACK);
        b4.setBackgroundColor(Color.BLACK);


        Button clickbtn = (Button) view;
        if(clickbtn.getId() == R.id.button5)
        {
            if (selectedIndex.equals(questions.correctAns[currentIndex])) {
                score++;
            }
            loadNewQuestion();
            currentIndex++;

        }
        else
        {
           selectedIndex = clickbtn.getText().toString();
           clickbtn.setBackgroundColor(Color.GREEN);
        }
    }

    void loadNewQuestion()
    {
        if (currentIndex == Question)
        {
            finish();
            return;
        }

        question.setText(questions.question[currentIndex]);
        b1.setText(questions.options[currentIndex][0]);
        b2.setText(questions.options[currentIndex][1]);
        b3.setText(questions.options[currentIndex][2]);
        b4.setText(questions.options[currentIndex][3]);
    }

    public void finish()
    {
        String status= "";
        if (score > Question*0.60)
        {
            status = "passed";
        }
        else
        {
            status = "failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(status)
                .setMessage("score is  " + score)
                .setPositiveButton("Restart", (dialogInterface, i) -> restart())
                .setCancelable(false)
                .show();
    }
    void restart()
    {
        score=0;
        currentIndex=0;
        loadNewQuestion();
    }
}



