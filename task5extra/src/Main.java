import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your credit card number:\n> ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        String filteredNumber = "";

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit >= '0' && digit <= '9') {
                filteredNumber += digit;
            }
        }

        if (filteredNumber.length() == 0) {
            System.out.println("The hash is: 0");
            return;
        }

        filteredNumber += filteredNumber.charAt(0);

        char last = '#';
        int sum = 0;

        for (int i = 0; i < filteredNumber.length(); i++) {
            char digit = filteredNumber.charAt(i);
            if (digit == last) {
                sum += (int) digit - '0';
            }
            last = digit;
        }

        System.out.println("The hash is: " + sum);
    }
}
