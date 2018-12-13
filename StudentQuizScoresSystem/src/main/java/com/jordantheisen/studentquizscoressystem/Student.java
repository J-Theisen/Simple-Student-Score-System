package com.jordantheisen.studentquizscoressystem;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    List<Integer> quizScores = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addScore(int score) {
        quizScores.add(score);
    }

    public List<Integer> getQuizScores() {
        return quizScores;
    }
}
