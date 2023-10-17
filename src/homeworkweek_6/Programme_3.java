package homeworkweek_6;

public class Programme_3 {

    /**
     * Declare one instance and one static variable.
     * Declare one instance method.
     * Declare one static method.
     * Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * Declare the Main method.
     * Call both instance and static methods into the Main method and run the programme.
     */
    String name = "Dhara";// instance variable
    static int b = 5;// static variable

    public static void main(String[] args) {     //main static method
        Programme_3 t = new Programme_3();
        System.out.println(t.name);
        System.out.println(b);
        t.d1();
    }

    public void d1() {    //non-static method
        Programme_3 obj = new Programme_3();
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(Programme_3.b);
        System.out.println(b);
    }
}

