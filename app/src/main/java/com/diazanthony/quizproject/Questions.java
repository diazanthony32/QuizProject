package com.diazanthony.quizproject;

import java.util.Random;

public class Questions {

    private static Questions questions;
    private String[] selectedQuestion;

    private Questions() {

        // The selection of random predictions the app shall "predict"
        selectedQuestion = new String[] {
                "Do you Love Us Moises?"

        };
    }

    //checks if the predictions variable is set to null
    public static Questions get(){
        if(questions == null){
            questions = new Questions();
        }
        return questions;
    }

    // Sends back the "prediction" to the CrystalBall.java
    public String getQuestion() {

        //Generates a random number to select an answer from
        Random prediction = new Random();

        return selectedQuestion[prediction.nextInt(1)];
    }


}
