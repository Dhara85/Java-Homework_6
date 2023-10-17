package homeworkweek_6;

public class Programme_4 {

    /**
     * Declare two instance and two static variables.
     * Declare one instance method.
     * Declare one static method.
     * Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme
     */
    int x = 20;// instance variable
    String name = "Sunday Funday";//instance variable
    static int number = 2;// static variable
    static String a = "Hey Georgeous";//static variable

    public static void main(String[] args) {
        Programme_4 s = new Programme_4();
        System.out.println(s.name);
        System.out.println(s.x);
        System.out.println(number);
        System.out.print(a);
        s.a2();
    }

    public void a2() {
        Programme_4 obj = new Programme_4();
        System.out.println();
        System.out.println(obj.name);
        System.out.println(x);
        System.out.println(Programme_4.number);
        System.out.println(a);
    }
}

