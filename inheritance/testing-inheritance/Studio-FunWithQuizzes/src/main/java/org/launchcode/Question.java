package org.launchcode;

public abstract class Question {
    private String question;
    private String correctAnswer;

    //Constructor
    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    //Abstract methods
    public abstract void displayQuestion();

    public abstract boolean checkAnswer(String userAnswer);

    public abstract void displayOptions();

    //Getters and Setters
    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public final void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}