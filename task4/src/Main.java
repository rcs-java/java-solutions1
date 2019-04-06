import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your potential company name:\n> ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.toLowerCase();

        String reversed = "";

        for (int index = input.length() - 1; index >= 0; index = index - 1) {
            char character = input.charAt(index);
            reversed += character;
            System.out.println(reversed);
        }

        if (input.equals(reversed)) {
            System.out.println("Name is palindrome!");
        } else {
            System.out.println("Name is not palindrome!");
        }
    }
}
