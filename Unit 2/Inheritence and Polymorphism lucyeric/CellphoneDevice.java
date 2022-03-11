/**
Name: Lucy 
Date: March 10th 2022
Description: A CellphoneDevice class which is a subclass of the Device superclass. The method for using
the cellphone is overriden to drain 10% per hour instead of 15%. The unique attributes are phoneNumber and
headphoneJack, and both have unique accessors (only phoneNumber has mutator). There are unique methods 
.call(String number) and .text(String number, String message)
*/

public class CellphoneDevice extends Device{
  /*Attributes*/
  /**The phone number associated with the phone*/
  private String phoneNumber;
  /**Whether the phone has a headphone jack*/
  private boolean headphoneJack;

  /*Constructors*/
  /**Creates a cellphone*/
  public CellphoneDevice (String brand, String colour, String material, int battery, double price, boolean power, String phoneNumber, boolean headphoneJack, boolean isBroken){
    super (brand, colour, material, battery, price, power, isBroken);
    this.phoneNumber = phoneNumber;
    this.headphoneJack = headphoneJack;
  }

  /**Creates a default cellphone*/
  public CellphoneDevice(){
    super();
    this.phoneNumber = "";
    this.headphoneJack = false;
  }
  
  /*Accessors and mutators*/
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

  /**Changes the phone's phone number because I've had like 3 numbers throughout high school
  @param newNumber the new phone number AS A STRING WHY STRING
  */
  public void setPhoneNumber(String newNumber){
    this.phoneNumber = newNumber;
  }

  /*Other methods and method overriding*/
  
  /**Uses the device, which drains the	battery by 10%	each hour. Overrides the superclass method, which drains by 15%
  @param	hours	the number of hours that the laptop	is	being	used for
  @return the new	battery percentage of the laptop
  */
  public	int use (double hours){
	 int newBattery =	(int)(this.getBattery() -	10	* hours); //.getBattery() used because battery is superclass attribute
	 if (newBattery <	0){  //Battery percentage restricted to >= 0%
		this.setBattery(0);  //Same with .setBattery
	 }
	 else{
		this.setBattery(newBattery);  
	 }
	 return this.getBattery();
  }
  
  /**Calls someone. Doesn't really do much. Drains battery a little. If the battery is 0, an error message is printed.
  @param number the phone number being called
  */
  public void call(String number){
    if (this.getBattery() > 0){
      System.out.println("Ring ring. You are now calling " + number);
      this.setBattery(this.getBattery()-1);
    }
    else {
      System.out.println("Your phone is dead :(");
    }
  }

  /**Texts someone. Doesn't really do much. Drains battery a little. If the battery is 0, an error message is printed.
  @param number the phone number being texted
  @param message the text message being sent
  */
  public void text(String number, String message){
    if (this.getBattery() > 0){
      System.out.println("Texting " + number + ": \"" + message + "\"");
      this.setBattery(this.getBattery() - 1);
    }
    else {
      System.out.println("Your phone is dead D:");
    }
  }  
}