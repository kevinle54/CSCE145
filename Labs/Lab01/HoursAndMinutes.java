package Labs.Lab01;

/*
 * Written by Kevin Le
 */
import java.util.Scanner;
public class HoursAndMinutes {

	public static final int HOUR = 60;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value from 1 to 999 to represent the amount of minutes. The machine will determine the amount of hours and minutes for that value.");
		int val = keyboard.nextInt();
		int valCopy = val;
		
		int h = val / HOUR;
		val = val % HOUR;
		
		int m = val;
		
		System.out.println("The value "+valCopy+" has:\n"+h+" hours\n"+m+" minutes");
		
    }
	
}