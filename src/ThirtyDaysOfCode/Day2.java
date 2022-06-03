package ThirtyDaysOfCode;

import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int i2 = scan.nextInt();

        System.out.println("Enter a double: ");

        double d2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Finish the sentence \"HackerRank \"");
        String s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        int totalInt = i + i2;
        System.out.println(totalInt);

        /* Print the sum of the double variables on a new line. */
        double totalDouble = d + d2;
        System.out.println(totalDouble);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        String bigString = s + s2;
        System.out.println(bigString);

        scan.close();
    }
}
