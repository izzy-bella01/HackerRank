package ThirtyDaysOfCode;

import java.io.*;

public class Day4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N % 2 == 0 && (N <= 5 && N >= 2)) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && (N <= 20 && N >= 6)){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N >= 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        bufferedReader.close();
    }
}
