//Write a java program which replace a “I love java” to “we love java”
//Expected output: We love java


package strings;

public class Q3 {  //declare class name
    public static void main(String[] args) {  // declare main method
        String name ="I Love Java";
        String newName = name.replace("I", "We" );

        System.out.println(newName);

    }



}
