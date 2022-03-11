/**
Name: Lucy and Eric 
Date: March 10th 2022
Description: this is the Device superclass, which contains the subclasses CellphoneDevice and LaptopDevice.
*/

public class Device {
  /*Attributes*/
  /**The	brand	of	the device*/
  private String brand;
  /**The	color	of	the device*/
  private String colour;
  /**The	material	the device is made of (idk	Eric came up with	this)*/
  private String material;
  /**The	battery level in percentage*/
  private int battery;
  /**The	price	of	the device in dollars*/
  private double price;
  /**Whether the device	is	powered on*/
  private boolean	power;
  /**Whether the laptop	has a	shattered screen*/
  private boolean	isBroken;
  
  /*Constructors*/
  /**Creates a new device*/
  public	Device (String	brand, String colour, String material,	int battery, double price,	boolean power, boolean	isBroken){
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
	 this.isBroken	= isBroken;
  }
  /**Creates a	default device*/
  public Device (){
	 this.brand	= "";
	 this.colour =	"";
	 this.material	= "";
	 this.battery = -1;
	 this.price	= -1;
	 this.power	= true;
	 this.isBroken	= false;
  }
  /*Accessors and Mutators*/

  /**Returns the brand
  @return the brand of the device
  */
  public String getBrand(){
    return this.brand;
  }

  /**Returns the colour
  @return the colour of the device
  */
  public String getColour(){
    return this.colour;
  }

  /**Returns the material
  @return the material of the device 
  */
  public String getMaterial(){
    return this.material;
  }

  /**Returns the battery percent
  @return the battery percentage of the device
  */
  public int getBattery(){
    return this.battery;
  }

  /**Returns the price
  @return the price of the device in dollars
  */
  public double getPrice(){
    return this.price;
  }

  /**Returns whether the device is powered on
  @return whether the device is powered on
  */
  public boolean getPower(){
    return this.power;
  }

  /**Returns whether the device has broken screen
  @return if the device has a broken screen
  */
  public boolean getIsBroken(){
    return this.isBroken;
  }

  /**Changes the device's battery level
  @param newBattery the new battery level as a percentage
  */
  public void setBattery(int newBattery){
    if (newBattery > 100){
      this.battery = 100;
    }  
    else if (newBattery < 0){
      this.battery = 0;
    }
    else {
      this.battery = newBattery;
    }
  }

  /**Changes the device's price
  @param newPrice the new price in dollars
  */
  public void setPrice(double newPrice){
    this.price = newPrice;
  }

  /**Changes the device's power on/off status
  @param newPower whether the device is currently powered on or off
  */
  public void setPower(boolean newPower){
    this.power = newPower;
  }

  /**Changes whether the device's screen is broken
  @param newIsBroken whether the device is now shattered or not
  */
  public void setIsBroken(boolean newIsBroken){
    this.isBroken = newIsBroken;
  }

  /*Other Methods*/
  /**Turns the	device on if it is off*/
  public	void powerOn(){
	 if (this.power == false){
		this.power = true;
	 }
  }

  /**Turns the device off if it is on*/
  public	void powerOff(){
	 if (this.power == true){
		this.power = false;
	 }
  }

  /**Charges the device	10% for every hour it is charged	(it's	a bad	device)
  @param	hours	how many	hours	the device is charged for
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

  /**Breaks	the device if mad? (I think you can	guess	who came	up	with this method)
  @param	mad whether	the user	is	mad
  @return explitives	or	something I'm going to use	something eric	said a while ago
  */
  public String breakScreen(boolean mad){
	 if (mad	==	true){
		this.isBroken = true;
		return ("Distuibfhf [redacted] pathiece [redacted] sucking [redacted] dogs that like watching a useless sack of [redacted] cry and eat one for alls [redacted] and [redacted]");
	 }
	 else{
		return "mad?";
	 }
  }

  /**Uses the device, which drains the	battery by 15%	each hour.
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
}