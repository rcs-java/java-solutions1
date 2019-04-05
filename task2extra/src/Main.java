import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to admissions!");
        System.out.print("Please enter the number of people in the room: ");
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        System.out.print("Please enter the number of people in the queue: ");
        int queue = sc.nextInt();

        while (queue > 0) {
            if (room < 100) {
                System.out.println("You can fit!");
            } else {
                System.out.println("You can't fit!");
            }
            room++;
            queue--;
        }
    }
}
