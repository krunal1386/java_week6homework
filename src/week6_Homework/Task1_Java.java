package week6_Homework;

public class Task1_Java {
    /*
    1. Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print
    statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme.
     */
    //declare instance variable
    String abc = "Codebuster Testing";
    int a = 13;
    //declare instance method
    void display () {
        Task1_Java obj = new Task1_Java(); //create object
        System.out.println(obj.abc); //print output
        System.out.println(obj.a); //print output
    }
    //main method
    public static void main(String[] args) {
        Task1_Java b = new Task1_Java(); //create object
        b.display(); //call instance methode using object
    }
}
