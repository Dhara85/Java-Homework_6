package homeworkweek_6;

import java.util.Scanner;

public class Programme_19ConvertStringToLowerCase {
    /**
     * Java program to convert a given string into lowercase
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
     * Output: the quick brown fox jumps over the lazy dog
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// declare Scanner class
        System.out.print("Input a String: ");// we have to put message to print
        String name = scanner.nextLine();
        name = name.toLowerCase();// will convert to lower case
        System.out.println(name);
        scanner.close();
    }
}