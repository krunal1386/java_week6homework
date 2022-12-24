package week6_Homework;

public class Task6_Java {
    /*
    6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
     */
    //declare static method
    static void m1 (){
        double pi = 3.142; //declare variable
        int r = 37; //declare value for radius
        double area = (pi*r*r); //declare variable for area
        System.out.println("Answer = " + area); //print statement
    }

    public static void main(String[] args) {
        m1(); //call static method
    }
}
