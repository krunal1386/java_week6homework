package extraHomework_week6;

public class Task_1 {
    /*
            1. Write a Java program to print your name on screen and then print your surname on a separate line.
*/

    //Main method
    public static void main(String[] args) {
        String name = "Krunal Patel"; //declare local string variable
        System.out.println(name); //print
        System.out.println("Last Name: " + name.substring(6)); //print surname only
    }
}
