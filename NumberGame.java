//import the needed utilities
import java.util.Scanner;
import java.util.Random;

//begin main class
public class NumberGame {
    public static void main(String[] args)
    {
        //sets up the utilities
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        //create variables
        int secretNumber = rand.nextInt(101) ;
        int playerGuess;
        int guessAttempts = 1;
        boolean correct = false;

        //get your first guess
        System.out.println("Please guess a number between 1-100: ");
        playerGuess = keyboard.nextInt();

        //begins the game loop
        while (!correct)
        {
            //check if guess is too low
            if (playerGuess < secretNumber)
            {
                System.out.println(playerGuess + " is too low, please guess again: ");
                playerGuess = keyboard.nextInt();
                guessAttempts ++;
            }

            //check if guess is too high
            if (playerGuess > secretNumber)
            {
                System.out.println(playerGuess + " is too high, please guess again: ");
                playerGuess = keyboard.nextInt();
                guessAttempts ++;
            }

            //checks if guess is correct
            if (playerGuess == secretNumber)
                correct = true;
        }

        //prints the win statement and guess number
        System.out.printf("%d was the correct answer! It only took you %d guesses!\n",playerGuess,guessAttempts);
    }
}
