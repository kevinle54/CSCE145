package Homeworks.Homework06;

/*
 * Written by Kevin Le
 */
//Step 1. Define the class
public class Jelly {
	//Step 2. Create constructors
	//Instance variables
	private String name;
	private int calories;
	private String fruitType;
	
	//Step 3. Create Constructors
	public Jelly()//Default
	{
		this.name = "none";
		this.calories = 50;
		this.fruitType = "Grape";
	}
	//aN = a name; aC = a calories; aFT = a fruitType
	public Jelly(String aN, int aC, String aFT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setFruitType(aFT);
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
	public String getFruitType()
	{
		return this.fruitType;
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
		if(aC >= 50 && aC <= 200)
			this.calories = aC;
		else
			this.calories = 50;
	}
	public void setFruitType(String aFT)
	{
		if(aFT != null && aFT.equalsIgnoreCase("Apple"))
		{
			aFT = "Apple";
			this.fruitType = aFT;
		}
		if(aFT != null && aFT.equalsIgnoreCase("Blueberry"))
		{
			aFT = "Blueberry";
			this.fruitType = aFT;
		}
		if(aFT != null && aFT.equalsIgnoreCase("Strawberry"))
		{
			aFT = "Strawberry";
			this.fruitType = aFT;
		}
		if(aFT != null && aFT.equalsIgnoreCase("Tomato"))
		{
			aFT = "Tomato";
			this.fruitType = aFT;
		}
		if(aFT != null && aFT.equalsIgnoreCase("Grape"))
		{
			aFT = "Grape";
			this.fruitType = aFT;
		}
	}
	
	//Step 6. Other Methods
	public String toString()
	{
		return "\nName: "+this.name+
				"\nCalories: "+this.calories+
				"\nFruit Type: "+this.fruitType;
	}
	//anJ = another jelly
	public boolean equals(Jelly anJ)
	{
		return anJ != null &&
				this.name.equalsIgnoreCase(anJ.getName()) &&
				this.calories == anJ.getCalories() &&
				this.fruitType.equalsIgnoreCase(anJ.getFruitType());
	}
}
