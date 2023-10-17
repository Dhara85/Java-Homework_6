package homeworkweek_6;

import java.util.Scanner;

public class Programme_9ConvertUpperCaseToLowerCase {

    // program to convert the upper case to lower case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        //Convert uppercase to lowercase
        String convertedString = input.toLowerCase();

        System.out.println("String in lowercase: " + convertedString);
        scanner.close();
    }
}
