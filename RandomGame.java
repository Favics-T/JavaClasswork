import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1; // Generates a number between 1 and 10

        System.out.println("Guess a number between 1 and 10:");
        int userInput = scanner.nextInt();

        if (userInput == number) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Try again! The correct number was: " + number);
        }

        scanner.close(); // Closing scanner to prevent resource leak
    }
}
