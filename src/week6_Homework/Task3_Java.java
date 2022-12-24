package week6_Homework;

public class Task3_Java {
    /*
    3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
     */

    float f = 13.202021f; //declare instance variable
    static char a = '%'; //declare static variable
    //declare instance methode
    void display(){
        Task3_Java obj = new Task3_Java(); //create object
        System.out.println(obj.f); //print output
        System.out.println(obj.a); //print output
    }
    //declare static methode
    static void m1(){
        Task3_Java abc1 = new Task3_Java(); //create object
        System.out.println(abc1.a); //print output
        System.out.println(abc1.f); //print output
    }
    //main methode
    public static void main(String[] args) {
        Task3_Java abc2 = new Task3_Java(); //create object
        abc2.display(); //call instance methode using object
        m1(); //call static method

    }
}
