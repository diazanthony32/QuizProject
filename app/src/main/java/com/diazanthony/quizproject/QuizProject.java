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
    private TextView displayScore;

    private Integer totalQuestions;
    private Integer score;
    private Integer questionnum;

    private Button trueButton;
    private Button falseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_project);

        question = (TextView) findViewById(R.id.question);
        displayScore = (TextView) findViewById(R.id.displayScore);

        trueButton = (Button) findViewById(R.id.button);
        falseButton = (Button) findViewById(R.id.button2);

        question.setText("Do you Love Us Moises?");
        questionnum = 1;
        score = 0;
        totalQuestions = 1;

        trueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (questionnum == 1) {

                    Toast toast = Toast.makeText(getApplication(), "Incorrect...", Toast.LENGTH_SHORT);
                    toast.show();

                    questionnum = questionnum + 1;
                    score = score + 0;

                    question.setText("Game Over!");

                    if(questionnum == 2){

                        displayScore.setText(Integer.toString(score));

                    }

                }

            }

        });

        falseButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (questionnum == 1) {

                    Toast toast = Toast.makeText(getApplication(), "Correct!!!", Toast.LENGTH_SHORT);
                    toast.show();

                    questionnum = questionnum + 1;
                    score = score + 1;

                    question.setText("Game Over!");

                    if(questionnum == 2){

                        displayScore.setText(Integer.toString(score));

                    }

                }

            }

        });

    }



}
