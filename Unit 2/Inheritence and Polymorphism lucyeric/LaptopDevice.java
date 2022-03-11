/**
Name: Eric 
Date: March 10th 2022
Description: A LaptopDevice class which is a subclass of the Device superclass. The method for charging
the laptop is overriden to charge 13% per hour instead of 10%. The unique attributes are os and
hasPort, and both have unique accessors (only os has mutator). There are unique methods 
.code(double hours) and .runGames(double hours)
*/

public class LaptopDevice extends Device {

  /* Attributes */

  /** operating system of laptop*/
  private String os;
  /** checks if laptop has ports*/
  private boolean hasPort;

  /*Constructors*/
  /** creates a laptop device class*/
  public LaptopDevice(String	brand, String colour, String material,	int battery, double price,	boolean power, boolean	isBroken, String os, boolean hasPort) {
    super(brand, colour, material, battery, price, power, isBroken);
    this.os = os;
    this.hasPort = hasPort;
  }

  /**creates a default laptop device class*/
  public LaptopDevice() {
    super();
    this.os = "";
    this.hasPort = false;
  }

  /*Accessors and mutators*/
  
  /**Returns the laptop's OS
  @return the laptop's OS
  */
  public	String getOs(){
	 return this.os;
  }

  /**Returns whether	the laptop has	a VGA	port
  @return whether	the laptop has	a VGA	port*/
  public	boolean getHasPort(){
	 return this.hasPort;
  }

  /**Changes the laptop's OS
  @param	newNumber the new	OS
  */
  public	void setOs(String	newOs){
	 this.os	= newOs;
  }

  /*Other methods and method overriding*/
  
  /**Runs games on the laptop	:)	Drains the battery by 25% per	hour played	and returns	the new battery percent.*/
	public int runGames(double hours){
		int newBattery	= (int)(this.getBattery()	- hours*25);
		if	(newBattery	< 0){
			this.setBattery(0);
		}
		else if (newBattery > 100){
			this.setBattery(100);
		}
		else {
			this.setBattery(newBattery);
		}
      System.out.println("2 week forced vacation from Riot Games");
      return this.getBattery();
	}
   
   /**Uses the laptop to write code. Drains battery by 15% per hour coded and returns the new battery percent.*/
   public int	code(double hours){
		int newBattery	= (int)(this.getBattery()	- hours*15);
		if	(newBattery	< 0){
			this.setBattery(0);
		}
		else if (newBattery > 100){
			this.setBattery(100);
		}
		else {
			this.setBattery(newBattery);
		}
      System.out.println("Hello world!");
      return this.getBattery();
	}

  //charge method override                            
  /**Charges the laptop	13% for every hour it is charged	(it's	a bad	laptop)
  @param	hours	how many	hours	the laptop is charged for
  @return the new	battery percentage
  */
  public	int charge (double hours){
	 int newCharge	= (int)(this.getBattery()	+ hours * 13);
	 if (newCharge	> 100){
		this.setBattery(100);
	 }
	 else	{
		this.setBattery(newCharge);
	 }
	 return this.getBattery();
  }  
}