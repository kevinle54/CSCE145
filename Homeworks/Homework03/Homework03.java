/*
 * Written by Kevin Le
 */
import java.util.Scanner;
public class Homework03 {

	public static final int SIZE = 10;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 10 taco names and prices so I can sort them.");
		
		String[] tacoName = new String[SIZE];
		double[] tacoPrice = new double[SIZE];
		
		
		for(int i=0;i<tacoPrice.length;i++)
		{
			System.out.println("Enter the name for taco "+(i+1));
			tacoName[i] = keyboard.nextLine();
			
			System.out.println("Enter taco's price");
			tacoPrice[i] = keyboard.nextDouble();
			keyboard.nextLine();
		}
		
		//Bubble Sort
		boolean Swapped = true;
		while(Swapped)
		{
			Swapped = false;
			for(int i=0;i<tacoPrice.length-1;i++)
			{
				if(tacoPrice[i] > tacoPrice[i+1])
				{
					double tempPrice = tacoPrice[i];
					tacoPrice[i] = tacoPrice[i+1];
					tacoPrice[i+1] = tempPrice;
					
					for(int j=0;j<tacoName.length-1;j++)
					{
						String tempName = tacoName[i];
						tacoName[i] = tacoName[i+1];
						tacoName[i+1] = tempName;
						Swapped = true;	
					}
				
				}
			}

		}
		
		System.out.println("The prices are sorted:");
		for(int i=0;i<tacoPrice.length;i++)
		{
			System.out.println(tacoName[i]+" "+tacoPrice[i]);
		}
	}

}
