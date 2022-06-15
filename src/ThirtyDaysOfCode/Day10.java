package ThirtyDaysOfCode;

import java.io.*;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Write your code here

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

}

public class Day10 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int factNum = scan.nextInt();

        System.out.println(Result.factorial(factNum));

    }
}
