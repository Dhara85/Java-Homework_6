package homeworkweek_6;


public class Programme_1 {

    /**
     * Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    int x = 5;// instance variable
    int y = 15;// instance variable

    public void a1Method() {
        Programme_1 c1 = new Programme_1();
        System.out.println(c1.x);
        System.out.println(c1.y);
    }

    //  main method
    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();//object declaration
        //System.out.println(obj.x);
        //System.out.println(obj.y);
        obj.a1Method();
    }
}

