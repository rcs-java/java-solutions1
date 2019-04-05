import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter your potential company name:\n> ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        int length = name.length();

        for (int i = 0; i < length / 2; i++) {
            if (name.charAt(i) != name.charAt(length - i - 1)) {
                System.out.println("Name is not palindromic!");
                return;
            }
        }

        System.out.println("Name is palindromic!");
    }
//
//    public static void main(String[] args) {
//        String input, reverse = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Help us to create a brand name! We want to use a palindrome.");
//
//        input = sc.nextLine();
//        input = input.toLowerCase();
//
//        int length = input.length();
//
//        for (int i = length - 1; i >= 0; i--)
//            reverse = reverse + input.charAt(i);
//
//        if (input.equals(reverse))
//            System.out.println("It is a palindrome.");
//        else
//            System.out.println("It is not a palindrome.");
//    }
}
