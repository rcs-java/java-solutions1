import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter parenthesis for verification:\n> ");
        Scanner sc = new Scanner(System.in);
        String parens = sc.nextLine();

        int depth = 0;

        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') depth++;
            if (parens.charAt(i) == ')') depth--;

            if (depth < 0) {
                System.out.println("Invalid parenthesis!");
                return;
            }
        }

        if (depth != 0) {
            System.out.println("Invalid parenthesis!");
        } else {
            System.out.println("Valid parenthesis!");
        }
    }
}
