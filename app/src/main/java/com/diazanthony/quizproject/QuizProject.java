package com.diazanthony.quizproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizProject extends Activity {

    private TextView question;

    private Button trueButton;
    private Button falseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_project);

        question = (TextView) findViewById(R.id.question);

        trueButton = (Button) findViewById(R.id.button);
        falseButton = (Button) findViewById(R.id.button2);

        question.setText(Questions.get().getQuestion());

        trueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplication(),"You Chose True...", Toast.LENGTH_SHORT);
                toast.show();

            }

        });

        falseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplication(),"You Chose False...", Toast.LENGTH_SHORT);
                toast.show();

            }

        });


    }



}
