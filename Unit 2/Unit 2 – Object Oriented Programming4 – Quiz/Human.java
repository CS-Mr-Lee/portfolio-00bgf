/** Name: Just Lucy Lin this time<br>
    Date: 02/25/2022 <br>
    This program contains a Human class, with each object having attributes name, weight, energyLevel, grade, and inComputerScience. <br>
    <b> <i> A fun fact is that humans can be both meat and vegetables at the same time. </i> </b> <br>
*/

public class Human {
  /*Attributes*/

  /**The name of the human*/
  private String name;

  /**The weight of the human in kilograms*/
  private double weight;

  /**The energy level of the human, from 0 to 100*/
  private int energyLevel;
  
  /*Constructors*/
   
  /** 
  Creats a default human; sets name to empty string and other values to -1
  */ 
  public Human(){
   this.name = "";
   this.weight = -1;
   this.energyLevel = -1;
  }
  
  /** Human
    Creates a human
    @param name -- name of human
    @param weight -- weight in kg
    @param energyLevel -- percentage of energy from 0 - 100 %
  */
  public Human(String name, double weight, int energyLevel){
    this.name = name;
    this.weight = weight; 
    this.energyLevel = energyLevel;

    /*setting restrictions for weight, must be 12.5 kg or above which is the weight of the average human skeleton*/
    if (weight < 12.5){
      this.weight = 12.5;
    }

    /*restriction for energy level between 0 and 100 percent*/
    if (energyLevel > 100){
      this.energyLevel = 100; 
    }  
    else if (energyLevel < 0){
      this.energyLevel = 0; 
    }
    else {
      this.energyLevel = energyLevel;
    }
  }
    
  /*Methods*/

  /*Accessors*/
  /**Gets name
    @return name of human*/
  public String getName(){
    return this.name;
  }

  /**Gets weight
    @return weight in kilograms*/
  public double getWeight(){
    return this.weight;
  }

  /**Gets energy Levels
    @return energy level percentage*/
  public int getEnergyLevel(){
    return this.energyLevel;
  }

  /*Mutators and other methods*/

  /**
  For each kilometer run, this method decreases the energy level of the human by 3% and decreases weight by 0.001kg
  @param km the number of kilometers run
  */
  public void run(double km){
    //Decreases energy level by 3% for each km, sets energy to 0 if it's negative
    this.energyLevel = (int)(this.energyLevel - 3*km);
    if (this.energyLevel < 0){
      this.energyLevel = 0;
    }

    //Decreases weight by 0.001kg per km
    if ((this.weight - 0.001*km) >= 12.5){
      this.weight = this.weight - 0.001*km;
    }
    else {
      this.weight = 12.5;  //The skeleton weight restriction appears again
    } 
  }

  /**raises energyLevel by hours of sleep * 10%
    @param hour the number of hours of sleep*/
  public void sleep(int hour){
    if(hour < 0){
      hour = 0;
    }
    this.energyLevel = (int)(this.energyLevel + (hour*10));
    if (this.energyLevel > 100){
      this.energyLevel = 100;
    }
  }

  /**
  Returns all the attributes of the human in a String
  @return all the attributes of the human in a String with each attribute on a new line 
  */
  public String toString(){
    String attributes = ("Name: " + this.name + "\n" + "Weight: " + this.weight + "\n" + "Energy Level: " + this.energyLevel + "%");
    return attributes;
  }
  
  /**
  Human eats a vegetable, gains the weight eaten, and gains 1% energy for every 15 cals eaten. In the 
  case that the human tries to eat more veg than exists, a warning message is printed..
  @param veg the veggie being eaten
  @param grams the number of grams being eaten
  */
  public void eat(Vegetable veg, double grams){
    if (grams <= veg.getWeight()){
      this.weight = this.weight + (grams/1000); //If conditions are met, human gains weight eaten and 1% energy for every 15 cal
      this.energyLevel = (int)(this.energyLevel + (veg.getWeight() - veg.eaten(grams))/15);
    }
    else {
      System.out.println("You don't have that much food.");
    }
  }
  
  /**
  Human eats a cookie, gains the weight eaten, and gains 1% energy for every 15 cals eaten. In the 
  case that the human tries to eat more cookie than exists, a warning message is printed, same with if the
  human tries to eat a cookie in the bag. When the cookie is eaten, the .eaten() method is called to assign the
  cookie its new caloric content and weight.
  @param cookie the cookie being eaten
  @param grams the number of grams being eaten
  */
  public void eat(Cookie food, double grams){    
    if (food.getIsPackaged() == true){
      System.out.println("You can't eat the bag.");
    }
    else if (grams > food.getWeight()) {
      System.out.println("You don't have that much food.");
    }
    else {
      this.weight = this.weight + (grams/1000); //If conditions are met, human gains weight eaten and 1% energy for every 15 cal
      this.energyLevel = (int)(this.energyLevel + (food.getWeight() - food.eaten(grams))/15);
    }
  }
}
