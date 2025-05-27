package CTSJava;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the student's score between 0-100: ");
        int mark = get.nextInt();

        char grade;

        if (mark >= 90 && mark <= 100) {
            grade = 'A';
        } else if (mark >= 80 && mark < 90) {
            grade = 'B';
        } else if (mark >= 70 && mark < 80) {
            grade = 'C';
        } else if (mark >= 60 && mark < 70) {
            grade = 'D';
        } else if (mark >= 0 && mark < 60) {
            grade = 'F';
        } else {
            grade = 'I';
            System.out.println("Invalid Mark. Please enter a score between 0 and 100.");
        }

        if (grade != 'I') {
            System.out.println("The student's grade is: " + grade);
        }

        get.close();
    }
}