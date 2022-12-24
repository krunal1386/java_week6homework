package week6_Homework;

public class Task19_Java {
 /*   19. Write a Java program to convert a given string into lowercase. Sample
Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
*/

    String abc = "Output: "; //Declare local string variable
    String abc1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."; //Declare locale variable
    String abc2 = abc1.toLowerCase();

    //Declare static method
    static void m1(){
         Task19_Java x = new Task19_Java(); //create an object
        System.out.println(x.abc + x.abc2);//print out

 }
 // main method
 public static void main(String[] args) {
     m1(); //call method
 }



 }




