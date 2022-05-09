package Homeworks.Homework06;

/*
 * Written by Kevin Le
 */
//Step 1. Define the class
public class PBJSandwich {
	//Step 2. Create the properties
	//Instance Variables
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	//Step 3. Create Constructors
	public PBJSandwich()//Default
	{
		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	//tS = topSlice; pB = peanutButter; j = Jelly; bS = bottomSlice
	public PBJSandwich(Bread tS, PeanutButter pB, Jelly j, Bread bS)
	{
		this.setTopSlice(tS);
		this.setPeanutButter(pB);
		this.setJelly(j);
		this.setBottomSlice(bS);
	}
	//Step 4. Create Accessors
	public Bread getTopSlice()
	{
		return this.topSlice;
	}
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	public Jelly getJelly()
	{
		return this.jelly;
	}
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	
	//Step 5. Create Mutators
	public void setTopSlice(Bread tS)
	{
		if(tS != null)
			this.topSlice = tS; //may need to replace "topSlice" with "Bread"
	}
	public void setPeanutButter(PeanutButter pB)
	{
		if(pB != null)
			this.peanutButter = pB;
	}
	public void setJelly(Jelly j)
	{
		if(j != null)
			this.jelly = j;
	}
	public void setBottomSlice(Bread bS)
	{
		if(bS != null)
			this.bottomSlice = bS;
	}
	
	//Step 6. Other Methods
	public String toString()
	{
		return "PBJ Sandwich\nTop Slice:\nBread "+this.topSlice+
				"\nPeanut Butter:\nPeanut Butter "+this.peanutButter+
				"\nJelly:\nJelly "+this.jelly+
				"\nBottom Slice:\nBread "+this.bottomSlice;
	}
	//anS = another sandwich
	public boolean equals(PBJSandwich anS)
	{
		return anS != null &&
				this.topSlice.equals(anS.getTopSlice()) && 
				this.peanutButter.equals(anS.getPeanutButter()) && 
				this.jelly.equals(anS.getJelly()) &&
				this.bottomSlice.equals(anS.getBottomSlice());
	}
}
