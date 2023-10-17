package homeworkweek_6;

import java.util.Scanner;

public class Programme_14PerimeterOfRectangle {
    /**
     * Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.5 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input length and width
        System.out.println("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter of the triangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
