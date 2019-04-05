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
}
