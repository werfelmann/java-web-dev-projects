package org.launchcode;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private ArrayList<String> listOfAnswers;

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> listOfAnswers) {
        super(question, correctAnswer);
        this.listOfAnswers = listOfAnswers;
    }

    @Override
    public void displayQuestion() {
        System.out.println(getQuestion());
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        return getCorrectAnswer().equalsIgnoreCase(userAnswer);
    }

    @Override
    public void displayOptions() {
        for (String multiChoiceOption : listOfAnswers){
            System.out.println(multiChoiceOption);
        }

    }
}
