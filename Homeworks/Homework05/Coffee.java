package Homeworks.Homework05;

/*
 * Written by Kevin Le
 */
//import java.util.Scanner;
public class Coffee {
	private String name;
	private double caffeineContent;
	private double cupAmount;

	public Coffee()
	{
		this.name = "none";
		this.caffeineContent = 50;
	}
	
	//aN = a name; aCC = a coffee content
	public Coffee(String aN, double aCC)
	{
		this.setName(aN);
		this.setCaffeineContent(aCC);
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	public double getCaffeineContent()
	{
		return this.caffeineContent;
	}
	
	//Mutators
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setCaffeineContent(double aCC)
	{
		if(aCC >= 50 && aCC <= 300)
		{
			this.caffeineContent = aCC;
		}
		else
		{
			this.caffeineContent = 50;
		}

	}
	
	public double getRiskAmount()
	{
		caffeineContent = 180.0/((caffeineContent/100.0)*6.0);
		return this.caffeineContent;
	}

	
}
