package week6_Homework;

public class Task18_Java {
    /*18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

    public static void main(String[] args) { //Main method
        m3 (); //call static method
        addition (125,24); //call static method
        subtraction(125,24); //call static method
        m1(); //call static method
        m2(); //call static method
    }
    //No return type with parameters
    static void addition(int x, int y){
        int abc = x+y; //declare local variable
        System.out.println(x + " + " + y + " = "+ abc); //print statement

    }
    //No return type with parameters
    static void subtraction(int x, int y){
     int abc1 = x-y; //declare local variable
        System.out.println(x + " - " + y + " = " + abc1); //print statement

    }
    //declare static method
    static void m1(){
        int x = 125, y = 24; //declare instance variable
        int abc2 = x*y; //multiplication
        int abc3 = x/y; //division
        System.out.println(x + " x " + y + " = " + abc2);
        System.out.println(x + " / " + y + " = " + abc3);
    }
    //declare static method
    static void m2(){
        int x = 125, y = 24; //declare local variable
        int mod = x%y; //modules
        System.out.println(x + " mod " + y + " = " + mod); //print output
    }
    //declare public method
    static void m3(){
        String abc4 = "Expected Output:"; //declare local variable
        System.out.println(abc4); //print statement
    }










}
