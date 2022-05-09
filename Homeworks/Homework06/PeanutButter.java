package Homeworks.Homework06;

/*
 * Written by Kevin Le
 */
//Step 1. Define the class
public class PeanutButter {
	//Step 2. Create the properties
	//Instance variables
	private String name;
	private int calories;
	private boolean isCrunchy;
	
	//Step 3. Create constructors
	public PeanutButter()//default
	{
		this.name = "none";
		this.calories = 100;
		this.isCrunchy = false;
	}
	//aN = a name; aC = a calories; isC = isCrunchy
	public PeanutButter(String aN, int aC, boolean isC)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setIsCrunchy(isC);
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
	public boolean getIsCrunchy()
	{
		return this.isCrunchy;
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
		if(aC >= 100 && aC <= 300)
			this.calories = aC;
		else
			this.calories = 100;
	}
	public void setIsCrunchy(boolean isC)
	{
		if(isC == true)
			this.isCrunchy = true;
		else
			this.isCrunchy = false;
	}
	
	//Step 6. Other Methods
	public String toString()
	{
		return "\nName: "+this.name+
				"\nCalories: "+this.calories+
				"\nIs Crunchy: "+this.isCrunchy;
	}
	//anB = another peanut butter
	public boolean equals(PeanutButter anP)
	{
		return anP != null &&
				this.name.equalsIgnoreCase(anP.getName()) &&
				this.calories == anP.getCalories() &&
				this.isCrunchy == anP.getIsCrunchy();
	}
}
