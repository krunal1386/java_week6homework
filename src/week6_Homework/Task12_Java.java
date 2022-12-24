package week6_Homework;

public class Task12_Java {
    /*12. Write a Java program to compute the specified expressions and print the
    output.
    Test Data:
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output : 2.138888888888889
     */

    public static void main(String[] args) {//main Method
        m1(); //call method
    }

    //Declare static method
    static void m1 () {
        double abc = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //declare variable
        System.out.println("Expected Output:"); //printing the specified text
        System.out.println(String.format("%.15f", abc)); //setting the precise to 15 decimal places
    }
}
