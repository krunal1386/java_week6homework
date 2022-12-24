package extraHomework_week6;

public class Task_6 {
    /*
        6.  Write a java program which replace a “I@love@java” to “we love java”
            Expected output: We love java
*/

    //Main method
    public static void main(String[] args) {
        String str1 = "I@love@java "; //declare local variable
        String str2 = "We love java"; //declare local variable
        System.out.println("Expected Output: " + str1.replaceAll(str1,str2)); //print after replacement
    }
}
