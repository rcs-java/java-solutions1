import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to admissions!");
        System.out.print("Please enter the number of people in the room: ");
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        System.out.print("Please enter the number of people in the queue: ");
        int queue = sc.nextInt();
        if (room + queue > 100) {
            System.out.println("Sadly, some can't fit!");
        } else {
            System.out.println("Please, everyone, come in!");
        }
    }
}
