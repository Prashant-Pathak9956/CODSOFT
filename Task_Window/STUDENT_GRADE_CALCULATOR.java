package Task_Window;
import java.util.*;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        double sum = 0;
        double avg;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks for required Subjects: ");
        System.out.println("Mathematics: ");
        double marks1 = sc.nextDouble();
        System.out.println("English: ");
        double marks2 = sc.nextDouble();
        System.out.println("Hindi: ");
        double marks3 = sc.nextDouble();
        System.out.println("Social Studies: ");
        double marks4 = sc.nextDouble();
        System.out.println("Science: ");
        double marks5 = sc.nextDouble();
        System.out.println("Computer Applications: ");
        double marks6 = sc.nextDouble();

        System.out.println("Marks over per Subject: ");
        double totalSum = sc.nextDouble();
         double totalMarks = 6 * (totalSum);

        sum = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        System.out.println("Total Marks: " + sum);

        double AvgPer = (sum / totalMarks) * 100;
        System.out.println("Average Percentile: " + AvgPer);

        if (AvgPer >= 90) {
            System.out.println("A+ Grade");
        }
        else if (AvgPer >= 80) {
            System.out.println("A Grade");
        }
        else if (AvgPer >= 70) {
            System.out.println("B+ Grade");
        }
        else if (AvgPer >= 60) {
            System.out.println("B Grade");
        }
        else if (AvgPer >= 50) {
            System.out.println("C Grade");
        }
        else if (AvgPer >= 40) {
            System.out.println("D Grade");
        }
        else
            System.out.println("Work Hard For Better Results");

    }
}
