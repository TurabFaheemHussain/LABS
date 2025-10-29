package scd;
import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = input.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = input.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        String grade;
        double gpa;

        if (percentage >= 85) {
            grade = "A+";
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = "A";
            gpa = 3.7;
        } else if (percentage >= 70) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage >= 60) {
            grade = "C";
            gpa = 2.0;
        } else if (percentage >= 50) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.0;
        }

        // Display the mark sheet neatly
        System.out.println("\n===============================");
        System.out.println("         MARK SHEET");
        System.out.println("===============================");
        System.out.println("Student Name   : " + name);
        System.out.println("Total Marks    : " + totalMarks);
        System.out.println("Obtained Marks : " + obtainedMarks);
        System.out.printf("Percentage     : " +  percentage);
        System.out.println("Grade          : " + grade);
        System.out.println("GPA            : " + gpa);
        System.out.println("===============================");
    }
}
