package org.launchcode;

import java.util.Objects;

public class TrueOrFalse extends Question{
    //constructor
    public TrueOrFalse(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public void displayQuestion() {
        System.out.println("True or false: " + getQuestion());
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return getCorrectAnswer().equalsIgnoreCase(userAnswer);
    }

    @Override
    public void displayOptions() {
        System.out.println("Options: 'True' or 'False'");
    }
}
