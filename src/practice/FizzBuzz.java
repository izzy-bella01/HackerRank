package practice;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz at: " + i);
            } else if(i % 3 == 0) {
                System.out.println("Fizz at: " + i);
            } else if(i % 5 == 0) {
                System.out.println("Buzz at: " + i);
            }
        }
    }
}
