import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;

        int guess;
        int attempts = 0;

        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");

            guess = scanner.nextInt();

            attempts++;

            if (guess < numberToGuess) {
                System.out.println("To low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");

            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}