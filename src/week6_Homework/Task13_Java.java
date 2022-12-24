package week6_Homework;

public class Task13_Java {
    /*
    13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
     */
    int a = 4, b = 8, c = 2; //declare instance variable
    int d = (a+b+c)/2; //declare instance variable

    //main method
    public static void main(String[] args) {
        Task13_Java obj = new Task13_Java(); //create object
        System.out.println("Input Numbers =" + obj.a + " , " + obj.b + " , " + obj.c); //print output
        System.out.println("Average = " + obj.d); //print output

    }
}
