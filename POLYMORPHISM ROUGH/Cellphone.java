/**
Name: Lucy and Eric
Date: March 6th 2022
Description: A laptop class, containing the attributes brand, colour, material, battery, price, power, phoneNumber, 
headphoneJack and isBroken. This class contains accessors for all attributes, and mutators for battery, price, power,
phoneNumber, and isBroken. Contains other various methods for "using" the phone.
*/
public class Cellphone {
  /*attributes*/
  /**The brand of the phone (Apple, Samsung, etc)*/
  private String brand;
  /**The color of the phone*/
  private String colour;
  /**The material the phone is made of (idk Eric came up with this)*/
  private String material;
  /**The battery level in percentage*/
  private int battery;
  /**The price of the phone in dollars*/
  private double price;
  /**Whether the phone is powered on*/
  private boolean power;
  /**The number to call the phone at (idk why it's a String that was Eric's decision)*/
  private String phoneNumber;
  /**Whether the phone has a headphone jack*/
  private boolean headphoneJack;
  /**Whether the phone has a shattered screen*/
  private boolean isBroken;
  
  /*Constructor*/
  /**Creates a cellphone*/
  public Cellphone (String brand, String colour, String material, int battery, double price, boolean power, String phoneNumber, boolean headphoneJack, boolean isBroken){
    this.brand = brand;
    this.colour = colour;
    this.material = material;
    if (battery > 100){
      this.battery = 100;
    }  
    else if (battery < 0){
      this.battery = 0;
    }
    else {
      this.battery = battery;
    }
    this.price = price;
    this.power = power;
    this.phoneNumber = phoneNumber;
    this.headphoneJack = headphoneJack;
    this.isBroken = isBroken;
  }
  /**Creates a default cellphone*/
  public Cellphone (){
    this.brand = "";
    this.colour = "";
    this.material = "";
    this.battery = -1;
    this.price = -1;
    this.power = true;
    this.phoneNumber = "";
    this.headphoneJack = false;
    this.isBroken = false;
  }

  /*Accessors and mutators*/

  
  /**Returns the brand
  @return the brand of the phone
  */
  public String getBrand(){
    return this.brand;
  }

  /**Returns the colour
  @return the colour of the phone
  */
  public String getColour(){
    return this.colour;
  }

  /**Returns the material
  @return the material of the phone
  */
  public String getMaterial(){
    return this.material;
  }

  /**Returns the battery percent
  @return the battery percentage of the phone
  */
  public int getBattery(){
    return this.battery;
  }

  /**Returns the price
  @return the price of the phone in dollars
  */
  public double getPrice(){
    return this.price;
  }

  /**Returns whether the phone is powered on
  @return whether the phone is powered on
  */
  public boolean getPower(){
    return this.power;
  }

  /**Returns the phone's number
  @return the phone number as a String (why eric? why String?)
  */
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

  /**Returns whether the phone has a headphone jack
  @return whether the phone has a headphone jack*/
  public boolean getHeadphoneJack(){
    return this.headphoneJack;
  }

  /**Returns whether the phone has broken screen
  @return if the phone has a broken screen
  */
  public boolean getIsBroken(){
    return this.isBroken;
  }

  /**Changes the phone's battery level
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

  /**Changes the phone's price
  @param newPrice the new price in dollars
  */
  public void setPrice(double newPrice){
    this.price = newPrice;
  }

  /**Changes the phone's power on/off status
  @param newPower whether the phone is currently powered on or off
  */
  public void setPower(boolean newPower){
    this.power = newPower;
  }

  /**Changes the phone's phone number because I've had like 3 numbers throughout high school
  @param newNumber the new phone number AS A STRING WHY STRING
  */
  public void setPhoneNumber(String newNumber){
    this.phoneNumber = newNumber;
  }

  /**Changes whether the phone's screen is broken
  @param newIsBroken whether the phone is now shattered or not
  */
  public void setIsBroken(boolean newIsBroken){
    this.isBroken = newIsBroken;
  }
  
  /*Other methods*/
  /**Turns the phone on if it is off*/
  public void powerOn(){
    if (this.power == false){
      this.power = true;
    }
  }

  /**Turns the phone off if it is on*/
  public void powerOff(){
    if (this.power == true){
      this.power = false;
    }
  }

  /**Charges the phone 10% for every hour it is charged (it's a bad phone)
  @param hours how many hours the phone is charged for
  @return the new battery percentage
  */
  public int charge (double hours){
    int newCharge = (int)(this.battery + hours * 10);
    if (newCharge > 100){
      this.battery = 100;
    }
    else {
      this.battery = newCharge;
    }
    return this.battery;
  }

  /**Breaks the phone if mad? (I think you can guess who came up with this method)
  @param mad whether the user is mad
  @return explitives or something I'm going to use something eric said a while ago
  */
  public String breakScreen(boolean mad){
    if (mad == true){
      this.isBroken = true;
      return ("Distuibfhf [redacted] pathiece [redacted] sucking [redacted] dogs that like watching a useless sack of [redacted] cry and eat one for alls [redacted] and [redacted]");
    }
    else{
      return "mad?";
    }
  }

  /**Calls someone. Doesn't really do much. Drains battery a little.
  @param number the phone number being called
  */
  public void call(String number){
    if (battery > 0){
      System.out.println("Ring ring. You are now calling " + number);
      this.battery = this.battery - 1;
    }
    else {
      System.out.println("Your phone is dead :(")
    }
  }

  /**Texts someone. Doesn't really do much. Drains battery a little.
  @param number the phone number being texted
  @param message the text message being sent
  */
  public void text(String number, String message){
    if (battery > 0){
      System.out.println("Texting " + number + ". " + message);
      this.battery = this.battery - 1;
    }
    else {
      System.out.println("Your phone is dead D:");
    }
  }

  /**Uses the phone, which drains the battery by 15% each hour.
  @param hours the number of hours that the phone is being used for
  @return the new battery percentage of the phone
  */
  public int use (double hours){
    int newBattery = (int)(this.battery - 15 * hours);
    if (newBattery < 0){
      this.battery = 0;
    }
    else{
      this.battery = newBattery;
    }
    return this.battery;
  }  
}