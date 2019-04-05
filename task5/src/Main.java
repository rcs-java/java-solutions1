import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your credit card number:\n> ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        char last = '#';
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit >= '0' && digit <= '9' && digit == last) {
                sum += (int) digit - '0';
            }
            last = digit;
        }

        System.out.println("The hash is: " + sum);
    }
}
