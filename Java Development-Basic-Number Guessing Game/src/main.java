import java.util.Random;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 7;
        boolean guessedCorrectly = false;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have 7 attempts to guess it!");

        for (int i = 1; i <= attempts; i++) {

            System.out.print("Attempt " + i + ": Enter your guess: ");
            int guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! Correct guess!");
                guessedCorrectly = true;
                break;
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low! Try a higher number.");
            }
            else {
                System.out.println("Too High! Try a lower number.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Game Over!");
            System.out.println("The correct number was: " + secretNumber);
        }

        input.close();
    }
}




