package com.jordantheisen.studentquizscoressystem;

/**
 *
 * @author J
 */
public class Controller {

    void run() {
        int choice;
        int score;
        StudentDatabase students = new StudentDatabase();
        String studentName;
        do {
            UserIO.printMenu();
            choice = UserIO.getNumber();
            ;
            switch (choice) {
                case 0:
                    System.out.println("The program will now exit, have a good day!");
                    break;
                    
                case 1:
                    if (!students.isEmpty()) {
                        UserIO.printAllStudents(students.getStudents());
                        break;
                    } else {
                        System.out.println("The database is empty.");
                        break;
                    }
                    
                case 2:
                    studentName = UserIO.getStudentFromUser("Enter the students name you'd like to add.");
                    if (!students.contains(studentName)) {
                        students.addStudent(studentName, new Student(studentName));
                        do {

                            System.out.println("Enter the score to add (-1 to stop):");
                            score = UserIO.getNumber();
                            if (score != -1) {
                                students.getStudent(studentName).addScore(score);
                            }
                        } while (score != -1);
                        break;
                    } else {
                        System.out.println("Student is already in the database.");
                        break;
                    }
                    
                case 3:
                    studentName = UserIO.getStudentFromUser("Enter the students name you'd like to remove.");
                    if (students.contains(studentName)) {
                        students.removeStudent(studentName);
                        break;
                    } else {
                        System.out.println("That student isnt in the database.");
                        break;
                    }
                    
                case 4:
                    studentName = UserIO.getStudentFromUser("Enter the students name you'd like to see quiz scores for.");
                    if (students.contains(studentName)) {
                        UserIO.printQuizScores(students.getStudent(studentName));
                        break;
                    } else {
                        System.out.println("That student isn't in the database.");
                        break;
                    }
                    
                case 5:
                    studentName = UserIO.getStudentFromUser("Enter the students name you'd like to get the average quiz score for.");
                    if (students.contains(studentName)) {
                        UserIO.printQuizScore(students.getAverageQuizScore(studentName));
                        break;
                    } else {
                        System.out.println("That student isn't in the database.");
                        break;
                    }
                    
                case 6:
                    studentName = UserIO.getStudentFromUser("Enter the students name you'd like to add a score for.");
                    if (students.contains(studentName)) {
                        System.out.println("Enter the score to add:");
                        score = UserIO.getNumber();
                        students.getStudent(studentName).addScore(score);
                        break;
                    } else {
                        System.out.println("That student isn't in the database.");
                        break;
                    }
                    
                default:
                    System.out.println("That is not a option.");
            }
        } while (choice != 0);
    }
}
