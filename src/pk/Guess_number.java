package pk;
import java.util.Random;
import java.util.Scanner;

public class Guess_number {

 	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1;
	        int upperBound = 100; // You can change the range as desired
	        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        
	        int maxAttempts = 10; // You can change the number of attempts as desired
	        int attempts = 0;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
	        System.out.println("Can you guess it within " + maxAttempts + " attempts?");
	        
	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            
	            if (userGuess < lowerBound || userGuess > upperBound) {
	                System.out.println("Please enter a valid guess within the range.");
	                continue;
	            }
	            
	            attempts++;
	            
	            if (userGuess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (userGuess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number (" + numberToGuess + ") in " + attempts + " attempts.");
	                break;
	            }
	        }
	        
	        if (attempts == maxAttempts) {
	            System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess + ". Better luck next time!");
	        }
	        
	        scanner.close();
 	    	    
}

}
	


