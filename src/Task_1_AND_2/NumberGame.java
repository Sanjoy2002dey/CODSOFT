//     TASK 1
//       NUMBER GAME
//
//     1. Generate a random number within a specified range, such as 1 to 100.
//     2. Prompt the user to enter their guess for the generated number.
//     3. Compare the user's guess with the generated number and provide feedback on whether the guess
//     is correct, too high, or too low.
//     4. Repeat steps 2 and 3 until the user guesses the correct number.
//     You can incorporate additional details as follows:
//     5. Limit the number of attempts the user has to guess the number.
//     6. Add the option for multiple rounds, allowing the user to play again.
//     7. Display the user's score, which can be based on the number of attempts taken or rounds won



package Task_1_AND_2;

import java.util.Scanner;
import java.util.Random;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minimumRange = 1;
        int maximumRange = 100;
        int maximumAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!!!");

        while (true) {
            int targetNumber = random.nextInt(maximumRange - minimumRange + 1) + minimumRange;
            int attempts = 0;

            System.out.println("\nGuess a number between " + minimumRange + " and " + maximumRange + ". Try to guess it!!!");

            while (attempts < maximumAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congrats You are a Hacker!!! You guessed the number right in " + attempts + " attempts.");
                    score=maximumAttempts-attempts;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Your number is too low, Please try again!!!");
                } else {
                    System.out.println("Your number is too high , Please try again!!!");
                }

                if (attempts == maximumAttempts) {
                    System.out.println("Sorry!!! Your attempts are finished. The correct number was: " + targetNumber);
                }
            }

            System.out.print("Are you interested to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (playAgain.equals("yes")) {
                System.out.println("Thank you for playing! Your score: " + score);
                break;
            }
        }

        sc.close();
    }
}
