package com.jordantheisen.studentquizscoressystem;

import java.util.Map;
import java.util.Scanner;

public class UserIO {

    private static Scanner scanner = new Scanner(System.in);

    public static int getNumber() {
        int decision;
        //System.out.println(prompt);
        while (true) {
            String choiceString = scanner.next();
            if (validEntry(choiceString)) {
                decision = Integer.parseInt(choiceString);
                break;
            }
        }
        return decision;
    }

    public static boolean validEntry(String num) {
        try {
            int i = Integer.parseInt(num);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("That is not a valid entry. Try again.");
            return false;
        }
    }

    public static void printMenu() {
        System.out.println("");
        System.out.println("******************************MENU***********************************");
        System.out.println("*Please enter the number associated with the action you'd like to do*");
        System.out.println("1 - View a list of students in the system.");
        System.out.println("2 - Add a student to the system.");
        System.out.println("3 - Remove a student from the system.");
        System.out.println("4 - View a list of quiz scores for a given student.");
        System.out.println("5 - View the average score for a given student.");
        System.out.println("6 - Add a score for a given student.");
        System.out.println("0 - End the program.");
        System.out.println("");
    }

    public static String getStudentFromUser(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public static void printQuizScores(Student student) {

        System.out.print("Student: " + student.getName());
        for (int quizScore : student.getQuizScores()) {
            System.out.print(" | " + quizScore + " |");
        }
        System.out.println("");
    }

    public UserIO() {
    }

    public static void printQuizScore(float quizScore) {
        System.out.println("Average quiz score: " + quizScore);
        System.out.println("");
    }

    public static void printAllStudents(Map<String, Student> students) {
        System.out.println("Students: ");
        for (Map.Entry<String, Student> e : students.entrySet()) {
            System.out.println(e.getKey());
        }
    }

}
