import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");
        System.out.println("Enter students' grades. Enter -1 to finish.");

        // Read grades from the user
        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
            return;
        }

        // Compute average
        double average = computeAverage(grades);

        // Find highest and lowest
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        // Display results
        System.out.println("=====================================");
        System.out.println("Grades Entered: " + grades);
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("=====================================");

        scanner.close();
    }

    private static double computeAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private static int findHighest(ArrayList<Integer> grades) {
        return Collections.max(grades);
    }

    private static int findLowest(ArrayList<Integer> grades) {
        return Collections.min(grades);
    }
}

