package homeworkweek_6;

import java.util.Scanner;

public class Programme_5Calculator {  //instance method for addition

    /**
     * program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods - Two static and Two instance methods
     */

    public void addition(int a, int b) { //instance method for addition
        int sum = a + b;
        System.out.println("addition number : " + sum);
    }

    public void subtraction(int a, int b) { // instance method for subtraction
        int sub = a - b;
        System.out.println("subtraction number: " + sub);
    }

    public static void multiplication(int a, int b) { // static method for multiplication
        int multi = a * b;
        System.out.println("multiplication number:" + multi);
    }

    public static void division(int a, int b) { // static method for division
        int div = a / b;
        System.out.println("division number:" + div);
    }

    public static void main(String[] args) {
        Programme_5Calculator p5 = new Programme_5Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        p5.addition(a, b);
        p5.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        scanner.close();
    }
}
