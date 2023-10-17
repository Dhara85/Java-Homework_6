package homeworkweek_6;

import java.util.Scanner;

public class Programme_6Radius {
    /**
     * program to enter any radius value of the circle and find out the
     * area -Formula of Area A=PI*r*r
     */

    public static void main(String[] args) {
        double pi = 3.142;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = s.nextDouble();
        double area = (pi * r * r);
        System.out.println("Area of Circle is: " + area);
        s.close();
    }
}
