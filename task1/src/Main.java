import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, dear guest!");
        System.out.println("How should I address you?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("Please, come in!");
    }
}
