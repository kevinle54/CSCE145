package Homeworks.Homework06;

/*
 * Written by Kevin Le
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the PBJ Sandwich Maker.");
		
		//Bread
		System.out.println("\n-----Sandwich 1-----\nTop Slice of Bread Information\nEnter the brand name of the bread.");
		String tbName01 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int tbCal01 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread: must be \"honey wheat\", \"white\", \"whole grain\", or \"whole wheat\".");
		String tbType01 = keyboard.nextLine();
		
		//Peanut Butter
		System.out.println("Peanut Butter Information\nEnter the brand name of the peanut butter.");
		String pButterName01 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int pButterCal01 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Is it crunchy? Enter \"true\" or \"false\".");
		boolean crunchy01 = keyboard.nextBoolean();
		keyboard.nextLine();
		
		//Jelly
		System.out.println("Jelly Information\nEnter the brand name of the jelly.");
		String jName01 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int jCal01 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of fruit flavor: must be \"apple\", \"blueberry\", \"grape\", \"strawberry\", or \"tomato\".");
		String jType01 = keyboard.nextLine();
		
		//Bread
		System.out.println("Bottom Slice of Bread Information\nEnter the brand name of the bread.");
		String bbName01 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int bbCal01 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread: must be \"honey wheat\", \"white\", \"whole grain\", or \"whole wheat\".");
		String bbType01 = keyboard.nextLine();
		
		
		//Sandwich02
		//Bread
		System.out.println("\n-----Sandwich 2-----\nTop Slice of Bread Information\nEnter the brand name of the bread.");
		String tbName02 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int tbCal02 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread: must be \"honey wheat\", \"white\", \"whole grain\", or \"whole wheat\".");
		String tbType02 = keyboard.nextLine();
				
		//Peanut Butter
		System.out.println("Peanut Butter Information\nEnter the brand name of the peanut butter.");
		String pButterName02 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int pButterCal02 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Is it crunchy? Enter \"true\" or \"false\".");
		boolean crunchy02 = keyboard.nextBoolean();
		keyboard.nextLine();
				
		//Jelly
		System.out.println("Jelly Information\nEnter the brand name of the jelly.");
		String jName02 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int jCal02 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of fruit flavor: must be \"apple\", \"blueberry\", \"grape\", \"strawberry\", or \"tomato\".");
		String jType02 = keyboard.nextLine();
				
		//Bread
		System.out.println("Bottom Slice of Bread Information\nEnter the brand name of the bread.");
		String bbName02 = keyboard.nextLine();
		System.out.println("Enter the number of calories.");
		int bbCal02 = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter the type of bread: must be \"honey wheat\", \"white\", \"whole grain\", or \"whole wheat\".");
		String bbType02 = keyboard.nextLine();
		
		
		PBJSandwich sandwich01 = new PBJSandwich(new Bread(tbName01, tbCal01, tbType01),
												 new PeanutButter(pButterName01, pButterCal01, crunchy01), 
												 new Jelly(jName01, jCal01, jType01), 
												 new Bread(bbName01, bbCal01, bbType01));
		
		PBJSandwich sandwich02 = new PBJSandwich(new Bread(tbName02, tbCal02, tbType02),
												 new PeanutButter(pButterName02, pButterCal02, crunchy02),
												 new Jelly(jName02, jCal02, jType02),
												 new Bread(bbName02, bbCal02, bbType02));
		
		System.out.println("\n-----Sandwich 1-----\n"+sandwich01);
		System.out.println("\n-----Sandwich 2-----\n"+sandwich02);
		
		//boolean to check if the sandwiches are the same
		System.out.print("\nAre these sandwiches the same? "+sandwich01.equals(sandwich02));
	}
}
