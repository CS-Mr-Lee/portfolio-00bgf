/**
Name: Lucy and Eric
Date: March 6th 2022
Description: A laptop class, containing the attributes brand, colour, material, battery, price, power, os, hasPort,
and isBroken. This class contains accessors for all attributes, and mutators for battery, price, power, os, and 
isBroken. Contains other various methods for "using" the laptop.
*/

public class Laptop {
  /*attributes*/
  /**The	brand	of	the laptop*/
  private String brand;
  /**The	color	of	the laptop*/
  private String colour;
  /**The	material	the laptop is made of (idk	Eric came up with	this)*/
  private String material;
  /**The	battery level in percentage*/
  private int battery;
  /**The	price	of	the laptop in dollars*/
  private double price;
  /**Whether the laptop	is	powered on*/
  private boolean	power;
  /**The	operating system the	laptop uses*/
  private String os;
  /**Whether the laptop	has a	VGA port*/
  private boolean	hasPort;
  /**Whether the laptop	has a	shattered screen*/
  private boolean	isBroken;

  /*Constructor*/
  /**Creates a	laptop*/
  public	Laptop (String	brand, String colour, String material,	int battery, double price,	boolean power,	String os, boolean hasPort, boolean	isBroken){
	 this.brand	= brand;
	 this.colour =	colour;
	 this.material	= material;
	 if (battery >	100){
		this.battery =	100;
	 }
	 else	if	(battery	< 0){
		this.battery =	0;
	 }
	 else	{
		this.battery =	battery;
	 }
	 this.price	= price;
	 this.power	= power;
	 this.os	= os;
	 this.hasPort = hasPort;
	 this.isBroken	= isBroken;
  }
  /**Creates a	default laptop*/
  public	Laptop (){
	 this.brand	= "";
	 this.colour =	"";
	 this.material	= "";
	 this.battery = -1;
	 this.price	= -1;
	 this.power	= true;
	 this.os	= "";
	 this.hasPort = false;
	 this.isBroken	= false;
  }

  /*Accessors and	mutators*/
  /**Returns the brand
  @return the brand of the	laptop
  */
  public	String getBrand(){
	 return this.brand;
  }

  /**Returns the colour
  @return the colour	of	the laptop
  */
  public	String getColour(){
	 return this.colour;
  }

  /**Returns the material
  @return the material of the	laptop
  */
  public	String getMaterial(){
	 return this.material;
  }

  /**Returns the battery percent
  @return the battery percentage	of	the laptop
  */
  public	int getBattery(){
	 return this.battery;
  }

  /**Returns the price
  @return the price of the	laptop in dollars
  */
  public	double getPrice(){
	 return this.price;
  }

  /**Returns whether	the laptop is powered on
  @return whether	the laptop is powered on
  */
  public	boolean getPower(){
	 return this.power;
  }

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

  /**Returns whether	the laptop has	broken screen
  @return if the laptop	has a	broken screen
  */
  public	boolean getIsBroken(){
	 return this.isBroken;
  }

  /**Changes the laptop's battery level
  @param	newBattery the	new battery	level	as	a percentage
  */
  public	void setBattery(int newBattery){
	 if (newBattery >	100){
		this.battery =	100;
	 }
	 else	if	(newBattery	< 0){
		this.battery =	0;
	 }
	 else	{
		this.battery =	newBattery;
	 }
  }

  /**Changes the laptop's price
  @param	newPrice	the new price in dollars
  */
  public	void setPrice(double	newPrice){
	 this.price	= newPrice;
  }

  /**Changes the laptop's power on/off	status
  @param	newPower	whether the	laptop is currently powered on or off
  */
  public	void setPower(boolean newPower){
	 this.power	= newPower;
  }

  /**Changes the laptop's OS
  @param	newNumber the new	OS
  */
  public	void setOs(String	newOs){
	 this.os	= newOs;
  }

  /**Changes whether	the laptop's screen is broken
  @param	newIsBroken	whether the	laptop is now shattered	or	not
  */
  public	void setIsBroken(boolean newIsBroken){
	 this.isBroken	= newIsBroken;
  }

  /*Other methods*/
  /**Turns the	laptop on if it is off*/
  public	void powerOn(){
	 if (this.power == false){
		this.power = true;
	 }
  }

  /**Turns the	laptop off if it is on*/
  public	void powerOff(){
	 if (this.power == true){
		this.power = false;
	 }
  }

  /**Charges the laptop	10% for every hour it is charged	(it's	a bad	laptop)
  @param	hours	how many	hours	the laptop is charged for
  @return the new	battery percentage
  */
  public	int charge (double hours){
	 int newCharge	= (int)(this.battery	+ hours * 10);
	 if (newCharge	> 100){
		this.battery =	100;
	 }
	 else	{
		this.battery =	newCharge;
	 }
	 return this.battery;
  }

  /**Breaks	the laptop if mad? (I think you can	guess	who came	up	with this method)
  @param	mad whether	the user	is	mad
  @return explitives	or	something I'm going to use	something eric	said a while ago
  */
  public	String breakScreen(boolean	mad){
	 if (mad	==	true){
		this.isBroken = true;
		return ("Distuibfhf [redacted] pathiece [redacted] sucking [redacted] dogs that like watching a useless sack of [redacted] cry and eat one for alls [redacted] and [redacted]");
	 }
	 else{
		return "mad?";
	 }
  }

  /**Uses the laptop, which drains the	battery by 15%	each hour.
  @param	hours	the number of hours that the laptop	is	being	used for
  @return the new	battery percentage of the laptop
  */
  public	int use (double hours){
	 int newBattery =	(int)(this.battery -	15	* hours);
	 if (newBattery <	0){
		this.battery =	0;
	 }
	 else{
		this.battery =	newBattery;
	 }
	 return this.battery;
  }

  /**Runs games on the laptop	:)	Drains the battery by 25% per	hour played	and returns	the new battery percent.*/
	public int runGames(double hours){
		int newBattery	= (int)(this.battery	- hours*25);
		if	(newBattery	< 0){
			this.battery =	0;
		}
		else if (newBattery > 100){
			this.battery =	100;
		}
		else {
			this.battery =	newBattery;
		}
      System.out.println("2 week forced vacation from Riot Games");
      return this.battery;
	}
   
   /**Uses the laptop to write code. Drains battery by 15% per hour coded and returns the new battery percent.*/
   public int	code(double hours){
		int newBattery	= (int)(this.battery	- hours*15);
		if	(newBattery	< 0){
			this.battery =	0;
		}
		else if (newBattery > 100){
			this.battery =	100;
		}
		else {
			this.battery =	newBattery;
		}
      System.out.println("Hello world!");
      return this.battery;
	}
}