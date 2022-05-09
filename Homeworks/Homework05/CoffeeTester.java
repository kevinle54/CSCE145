package Homeworks.Homework05;

/*
 * Written by Kevin Le
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to the coffee content analyzer where I will determine the danger of your inputted coffee(s) based on the caffeine content.");
		
		System.out.println("What's the name of your first coffee?");
		String coff01 = keyboard.nextLine();
		System.out.println("What's is the caffeine content?");
		int content01 = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("What's the name of your second coffee?");
		String coff02 = keyboard.nextLine();
		System.out.println("What's is the caffeine content?");
		int content02 = keyboard.nextInt();
		keyboard.nextLine();
		
		Coffee coffee01 = new Coffee(coff01,content01);
		System.out.println("It would take "+coffee01.getRiskAmount()+" "+coffee01.getName()+" coffees before it's dangerous to drink more.");
		
		Coffee coffee02 = new Coffee(coff02,content02);
		System.out.println("It would take "+coffee02.getRiskAmount()+" "+coffee02.getName()+" coffees before it's dangerous to drink more.");
	}

}
