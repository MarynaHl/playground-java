import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondInput = scanner.nextInt();
        int hours = (secondInput/3600)%24;
        int minutes = (secondInput/60)%60;
        int seconds = secondInput%60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);

    }
}