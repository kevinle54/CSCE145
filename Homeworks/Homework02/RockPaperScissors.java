package Homeworks.Homework02;

/*
 * Written by Kevin Le
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int userInput = 0;
		int roundsPlayed = 0;
		int playerPoints = 0;
		int computerPoints = 0;
		
		boolean playAgain = true;

		do 
		{
			System.out.println("Let's play Rock Paper Scissors. Best 2 out of 3.\nEnter \"1\" for Rock, \"2\" for Paper, or \"3\" for Scissors.");

			boolean game = false;
			
			while(!game)
			{
				userInput = keyboard.nextInt();
				int computerInput = r.nextInt(3)+1;
				if((int)userInput <= 1 || (int)userInput >= 3)
				{
					computerInput = r.nextInt(3)+1;
				}
	
				if((int)userInput == computerInput)
				{
					System.out.println("The CPU choose "+computerInput+" ,it's a tie.");
					roundsPlayed++;
				}
				
				else if(userInput == 1 && computerInput == 2)
				{
					System.out.println("The CPU choose "+computerInput+", CPU won.");
					computerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
				
				else if(computerInput == 1 && userInput == 2)
				{
					System.out.println("The CPU choose "+computerInput+", you won.");
					playerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
				
				else if(userInput == 2 && computerInput == 3)
				{
					System.out.println("The CPU choose "+computerInput+", CPU won.");
					computerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
				
				else if(computerInput == 2 && userInput == 3)
				{
					System.out.println("The CPU choose "+computerInput+", you won.");
					playerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
				
				else if(userInput == 3 && computerInput == 1)
				{
					System.out.println("The CPU choose "+computerInput+", CPU won.");
					computerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
				
				else if(computerInput == 3 && userInput == 1)
				{
					System.out.println("The CPU choose "+computerInput+", you won.");
					playerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
					
				else //if((int)userInput < 1 || (int)userInput > 3)
				{
					System.out.println("Not valid, Computer wins a point.");
					computerPoints++;
					roundsPlayed++;
					System.out.println("You got "+playerPoints+" points and the CPU got "+computerPoints+" points.");
				}
			
				if(roundsPlayed == 3)
				{
					if(computerPoints < playerPoints)
					{
						System.out.println("You won the game.");
					}
					if(computerPoints > playerPoints)
					{
						System.out.println("CPU won the game.");
					}
					if(computerPoints == playerPoints)
					{
						System.out.println("You tied with the CPU.");
					}
					computerPoints = 0;
					playerPoints = 0;
					game = true;
				}
					
			}
		
		roundsPlayed = 0;
		System.out.println("Do you want to play again?\nEnter \"true\" to play again.");
		playAgain = keyboard.nextBoolean();
		}while(playAgain);
	}

}
