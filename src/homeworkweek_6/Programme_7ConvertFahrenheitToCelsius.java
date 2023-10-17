package homeworkweek_6;

import java.util.Scanner;

public class Programme_7ConvertFahrenheitToCelsius {

    /**
     * program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        //Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        //Print the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius + " °C");
        scanner.close();
    }
}
