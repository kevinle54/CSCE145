package Homeworks.Homework06;

/*
 * Written by Kevin Le
 */
//Step 1. Define the class
public class Bread {
	//Step 2. Create the properties
	//Instance variables
	private String name;
	private int calories;
	private String type;
	
	//Step 3. Create constructors
	public Bread()//Default
	{
		this.name = "none";
		this.calories = 50;
		this.type = "Whole wheat";
	}
	//aB = a Name; aC = a calories; aT = a type
	public Bread(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);
	}
	
	//Step 4. Create Accessors
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public String getBreadType()
	{
		return this.type;
	}
	
	//Step 5. Create Mutators
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC >= 50 && aC <= 250)
			this.calories = aC;
		else
			this.calories = 50;
	}
	public void setType(String aT)
	{
		if(aT != null && aT.equalsIgnoreCase("Honey wheat"))
		{
			aT = "Honey wheat";
			this.type = aT;
		}
		if(aT != null && aT.equalsIgnoreCase("White"))
		{
			aT = "White";
			this.type = aT;
		}
		if(aT != null && aT.equalsIgnoreCase("Whole grain"))
		{
			aT = "Whole Grain";
			this.type = aT;
		}
		if(aT != null && aT.equalsIgnoreCase("Whole wheat"))
		{
			aT = "Whole wheat";
			this.type = aT;
		}
	}
	
	//Step 6. Other Methods
	public String toString()
	{
		return "\nName: "+this.name+
				"\nCalories: "+this.calories+
				"\nBread Type: "+this.type;
	}
	//anB = another bread
	public boolean equals(Bread anB)
	{
		return anB != null &&
				this.name.equalsIgnoreCase(anB.getName()) &&
				this.calories == anB.getCalories() &&
				this.type.equalsIgnoreCase(anB.getBreadType());
	}
}
