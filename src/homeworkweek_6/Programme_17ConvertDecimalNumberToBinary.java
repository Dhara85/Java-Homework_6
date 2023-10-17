package homeworkweek_6;

import java.util.Scanner;

public class Programme_17ConvertDecimalNumberToBinary {
    /**
     * Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Number: ");
        int myNum;
        myNum = Integer.parseInt(scanner.next());

        // convert decimal to binary
        String binary = Integer.toBinaryString(myNum);
        System.out.println(myNum + " in decimal = " + binary + " in binary.");
        scanner.close();
    }
}
