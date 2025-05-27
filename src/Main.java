import java.util.Scanner;

public class Main {
    final static int PASSWORD = 123976;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == PASSWORD) {
            System.out.println("Hello, Agent");

        } else {
            System.out.println("Access denied");
        }
    }
}
