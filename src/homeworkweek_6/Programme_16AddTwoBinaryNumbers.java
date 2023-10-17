package homeworkweek_6;

import java.util.Scanner;

public class Programme_16AddTwoBinaryNumbers {
    /**
     * Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * Expected Output:
     * Sum of two binary numbers: 101
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input two binary numbers as strings
        System.out.print("Enter the first binary number : ");
        String binary1 = scanner.next();
        System.out.print("Enter the second binary number : ");
        String binary2 = scanner.next();

        // call the function to add two binary numbers using concatenation
        String sum = addBinary(binary1, binary2);
        System.out.println("Sum of the binary numbers: " + sum);
        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) { // Function to add two binary numbers

        //Convert binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the integers
        int sum = num1 + num2;

        return Integer.toBinaryString(sum);
    }
}
