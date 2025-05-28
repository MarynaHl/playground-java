import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bill = scanner.nextInt();
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }
        int friends = scanner.nextInt();
        if (friends <= 0) {
            System.out.println("Number of friends cannot be negative");
            return;
        }

        int totalWithTip = bill + bill / 10;
        int partToPay = totalWithTip / friends;

        System.out.println(partToPay);
    }
}