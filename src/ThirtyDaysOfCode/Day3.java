package ThirtyDaysOfCode;
import java.io.*;

public class Day3 {
    static class Result {

        /*
         * Complete the 'solve' function below.
         *
         * The function accepts following parameters:
         *  1. DOUBLE meal_cost
         *  2. INTEGER tip_percent
         *  3. INTEGER tax_percent
         */

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            double tip = ((meal_cost * tip_percent) / 100);
            double tax = ((meal_cost * tax_percent) / 100);
            long totalCost = Math.round(meal_cost + tax + tip);
            System.out.println(totalCost);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter meal cost: ");
        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        System.out.println("Enter tip percent in whole number: ");
        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Enter tax percent in whole number: ");
        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
