package ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Day6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter an integer: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++) {
           int multiple = n * i;
            System.out.println(n + " x " + i + " = " + multiple);
        }

            bufferedReader.close();
    }
}
