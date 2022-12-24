package week6_Homework;

public class Task4_Java {
    /*
    4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the
    print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
     */
    //declare instance variable
    String abc1 = "What is your name";
    String a = "Krunal Patel";

    //declare static variable
    static String abc2 ="kunal patel";
    static boolean abc3 = false;

    //declare instance method
    void display(){
        Task4_Java obj = new Task4_Java(); //create object
        System.out.println(obj.abc1); //print output
        System.out.println(obj.a); //print output
        System.out.println(obj.abc2); //print output
        System.out.println(obj.abc3); //print output
    }
    //declare static method
    static void m1(){
        Task4_Java a1 = new Task4_Java(); //create object
        System.out.println(a1.abc1); //print output
        System.out.println(a1.a); //print output
        System.out.println(a1.abc2);//print output
        System.out.println(a1.abc3);//print output
    }
    //main method
    public static void main(String[] args) {
        Task4_Java a2 = new Task4_Java(); //create object
        a2.display(); // call instance method using object name
        m1(); //call static method directly
    }
}
