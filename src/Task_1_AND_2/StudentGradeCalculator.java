  //     TASK 2
  //      STUDENT GRADE CALCULATOR
  //
  //      Input: Take marks obtained (out of 100) in each subject.
  //      Calculate Total Marks: Sum up the marks obtained in all subjects.
  //      Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
  //      average percentage.
  //      Grade Calculation: Assign grades based on the average percentage achieved.
  //      Display Results: Show the total marks, average percentage, and the corresponding grade to the user



package Task_1_AND_2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int SubNum = sc.nextInt();

        if (SubNum <= 0) {
            System.out.println("Enter a valid number of subjects.");
            sc.close();
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <=SubNum; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks!!! Marks should be between 0 to 100.");
                sc.close();
                return;
            }

            totalMarks += marks;
        }

        double avgPercentage = (double) totalMarks / (SubNum * 100) * 100;
        
        String grade;

        if (avgPercentage >= 90) {
            grade = "A+";
        } else if (avgPercentage >= 80) {
            grade = "A";
        } else if (avgPercentage >= 70) {
            grade = "B";
        } else if (avgPercentage >= 60) {
            grade = "C";
        } else if (avgPercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

