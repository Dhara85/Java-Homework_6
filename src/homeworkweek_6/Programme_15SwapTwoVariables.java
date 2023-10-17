package homeworkweek_6;

public class Programme_15SwapTwoVariables {
    // Java program to swap two variables

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;
        int tempNum = 0;

        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

        tempNum = num1;
        num1 = num2;
        num2 = tempNum;

        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
    }

}
