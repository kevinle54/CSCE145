package Labs.Lab05;

/*
 * Written by Kevin Le
 */
//Step 1. Define the class
public class Apple {
	//Step 2. Create instance variables
	private String type;
	private double weight;
	private double price;
	
	//Step 3. Create Constructors
	public Apple()//Default
	{
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	//aT = a Type; aW = a weight; aP = a price
	public Apple(String aT, double aW, double aP)
	{
		//TODO call mutators
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	
	//Step 4. Create Accessors
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	//Step 5. Create Mutators
	public void setType(String aT)
	{
		if(aT != null &&
				(aT.equalsIgnoreCase("Gala") ||
				 aT.equalsIgnoreCase("Red delicious") ||
				 aT.equalsIgnoreCase("Golden delicious") ||
				 aT.equalsIgnoreCase("Granny smith")))
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala";
		}
	}
	public void setWeight(double aW)
	{
		if(aW >= 0.0 && aW <= 2.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 0.0;
		}
	}	
	public void setPrice(double aP)
	{
		if(aP >= 0.0)
		{
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	
	public String toString()
	{
		return "Type: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
	}
	
	//anA = another apple
	public boolean equals(Apple anA)
	{
		return anA != null &&
				this.type.equals(anA.getType()) && 
				this.weight == anA.getWeight() && 
				this.price == anA.getPrice(); 
	}

}
