//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java


package strings;

public class Q6 {
    public static void main(String[] args) {

        String text = "I@Love@Java";
        String newText = text.replace("@"," " );

        System.out.println(newText);

    }

}
