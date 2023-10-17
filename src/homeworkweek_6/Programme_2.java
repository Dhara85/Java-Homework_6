package homeworkweek_6;

public class Programme_2 {
    /**
     * Declare two static variables
     * Declare one static method
     * Call both static variables into the static method inside the print statement.
     * Declare the Main method.
     * Call the static method into the Main method and Run the programme.
     */
    static int a = 20;
    static String name = "Dhara";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(name);
    }

    public void a2() {
        System.out.println(a);
        System.out.println(Programme_2.a);
    }

}
