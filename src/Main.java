import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsInput = scanner.nextInt();
        int hours = (secondsInput/3600) % 24;
        int minutes = (secondsInput/60) % 60;
        int seconds = secondsInput % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }
}
