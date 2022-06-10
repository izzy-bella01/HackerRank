package ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words will you enter? ");
        int numOfWords = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < numOfWords; i++) {
            System.out.println("Enter word: ");
            String inputString = scan.nextLine();
            String even = "";
            String odd = "";
            for (int j = 0; j < inputString.length(); j++) {
                if (j % 2 == 0) {
                    even += inputString.charAt(j);
                } else {
                    odd += inputString.charAt(j);
                }
            }

            System.out.println(even + " " + odd);
        }
    }
}
