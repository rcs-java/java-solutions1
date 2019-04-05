import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter compressed signature:\n> ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String decompressed = "";

        for (int cur = 0; cur < text.length(); cur++) {
            char symbol = text.charAt(cur);
            if (symbol != '(') {
                decompressed += symbol;
                continue;
            }

            String marked = text.substring(cur);
            int xIndex = marked.indexOf('x');
            int closingIndex = marked.indexOf(')');
            String len = marked.substring(1, xIndex);
            String mul = marked.substring(xIndex + 1, closingIndex);

            int segmentLen = Integer.parseInt(len);
            int segmentTimes = Integer.parseInt(mul);

            String segment = marked.substring(closingIndex + 1, closingIndex + 1 + segmentLen);

            for (int i = 0; i < segmentTimes; i++) {
                decompressed += segment;
            }

            cur += segmentLen + len.length() + mul.length() + 2;;
        }

        System.out.println("The decompressed signature:\n" + decompressed);
    }
}
