package week6_Homework;

public class Task5_Java {
    /*
    5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
     */
    int a1 = 13, b1 = 26; //declare instance variables
    int ans = a1 * b1; //multiplication

    int a2 = 140, b2 = 10; //declare instance variables
    int abc = a2 / b2; //division

    //declare static method with parameters
    static void addition(int a, int b){
        int xyz = a+b; //declare local variable
        System.out.println(a + " + " + b + " = " + xyz); //print statement
    }

    //declare static method with parameters
    static void subtraction(int a, int b){
        int xyz1 = a-b; //declare local variable
        System.out.println(a + " - " + b + " = " + xyz1); //print statement
    }

    //declare public method
    static void m3(){
        String abc1 = "Output:"; //declare local variable
        System.out.println(abc1); //print statement
    }

    public static void main(String[] args) { //Main method
        m3(); //call static method
        addition(13,26); //call static method directly
        subtraction(140, 10); //call static method directly
        Task5_Java obj = new Task5_Java(); //create object
        System.out.println(obj.a1 + " x " + obj.a1 + " = " + obj.ans); //print statement
        System.out.println(obj.a2 + " / " + obj.b2 + " = " + obj.abc); //print statement
    }

}
