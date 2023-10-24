package Task1;
import java.util.Random;
import java.util.Scanner;
public class Number_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int lower = 1;
		int upper = 100;
		int turns = 0;
		int totalAttempts = 0;
		int maxAttempts = 10;

		System.out.println("Welcome to the Guess the Number game!");

		while (true) {
			int numberToGuess = random.nextInt(upper - lower + 1) + lower;
			int attempts = 0;
			turns++;

			System.out.println("I'm thinking of a number between " + lower + " and " + upper + ".");
			System.out.println("You have " + maxAttempts + " attempts to guess it.");

			while (attempts < maxAttempts) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;

				if (userGuess < numberToGuess) {
					System.out.println("Oops...Too low. Try again.");
				} else if (userGuess > numberToGuess) {
					System.out.println("Oops...Too high. Try again.");
				} else {
					System.out.println("Yipee....Congratulations You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
					totalAttempts += attempts;
					break;
				}
			}

			System.out.print("Do you want to play another round? (yes/no): ");
			String playAgain = scanner.next().toLowerCase();
			if (!playAgain.equals("yes")) {
				break;
			}
		}

		System.out.println("Game over! You played " + turns + " rounds and your average score	 per round was " + (double) totalAttempts / turns);
	}
}

