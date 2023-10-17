package homeworkweek_6;

import java.util.Scanner;

public class Programme_13PrintAverageNumbers {
    /**
     * Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args) {

        int a, b, c, sum;// declare integer variables
        Scanner scanner = new Scanner(System.in); // create object
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        c = scanner.nextInt();
        sum = a + b + c; // find sum
        double avg = sum / 3;// calculate average
        System.out.println("Average of the numbers is " + avg);
        scanner.close();
    }
}
