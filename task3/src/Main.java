import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("First 40 Fibonacci numbers:");

        int current = 1;
        int prev = 1;
        System.out.print(prev + ", " + current);

        for (int i = 0; i < 38; i++) {
            int sum = prev + current;
            prev = current;
            current = sum;
            System.out.print(", " + current);
        }
    }
}
