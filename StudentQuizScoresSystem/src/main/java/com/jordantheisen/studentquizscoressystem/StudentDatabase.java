package com.jordantheisen.studentquizscoressystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.css.Counter;

public class StudentDatabase {

    Map<String, Student> students = students = new HashMap<>();

    public Map<String, Student> getStudents() {
        return students;
    }

    public void addStudent(String name, Student student) {
        students.put(name, student);
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public Student getStudent(String name) {
        return students.get(name);
    }

    public float getAverageQuizScore(String name) {
        float avgQuizScores = 0;
        int counter = 0;
        Student student = students.get(name);
        for (int quizScore : student.getQuizScores()) {
            avgQuizScores += quizScore;
            counter++;
        }
        return (avgQuizScores / counter);
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public boolean contains(String name) {
        return students.containsKey(name);
    }

}
