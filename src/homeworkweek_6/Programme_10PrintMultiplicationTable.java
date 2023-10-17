package homeworkweek_6;

import java.util.Scanner;

public class Programme_10PrintMultiplicationTable {

    /**
     * Java program that takes a number as input and prints its
     * multiplication table up to 10.
     * Test Data: Input a number: 8
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which multiplication table to display: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
