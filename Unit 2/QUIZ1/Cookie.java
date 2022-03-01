/**
Name: Lucy Lin <br>
Date: March 1st 2022 <br>
Description: this is a Vegetable class, and each object has the attributes name, calories, and weight
*/

public class Cookie{
   /*Attributes*/
   
   /**The name of the cookie*/
   private String name;
   
   /**The weight of the cookie*/
   private double weight;
   
   /**The calories in the cookie*/
   private int calories;
   
   /**If the cookie is pacakged*/
   private boolean isPackaged;
   
   /*Constructors*/
   
   /**
   Default cookie constructor, creates a cookie with an empty string as the name, -1 for numerical values, and false for isPackaged
   */
   public Cookie(){
      this.name = "";
      this.weight = -1;
      this.calories = -1;
      this.isPackaged = false;
   }
   
   /**
   Constructs an unpackaged cookie if the packing is not specified. 
   @param name the name of the cookie
   @param weight the weight of the cookie
   @param calories the calories in the cookie
   */
   public Cookie(String name, double weight, int calories){
      this.name = name;
      this.weight = weight;
      this.calories = calories;
      this.isPackaged = false;
   }
   
   /**
   Constructs a fully specified cookie. 
   @param name the name of the cookie
   @param weight the weight of the cookie
   @param calories the calories in the cookie
   @param isPackaged whether the cookie is packaged
   */
   public Cookie(String name, double weight, int calories, boolean isPackaged){
      this.name = name;
      this.weight = weight;
      this.calories = calories;
      this.isPackaged = isPackaged;
   }
   
   /*Methods*/
   
   /**
   Returns the name of the cookie
   @return the name of the cookie
   */
   public String getName(){
      return this.name;
   }
   
   /**
   Returns the weight of the cookie
   @return the weight of the cookie
   */
   public double getWeight(){
      return this.weight;
   }
   
   /**
   Returns the calories of the cookie
   @return the calories of the cookie
   */
   public int getCalories(){
      return this.calories;
   }
   
   /**
   Returns if the cookie is packaged
   @return whether the cookie is packaged
   */
   public boolean getIsPackaged(){
      return this.isPackaged;
   }
   
   /**
   Opens the cookie by setting isPackaged to false
   */
   public void open(){
      this.isPackaged = false;
   }
   
   /**
   Allows the cookie to be eaten, removes calories proportionate to the weight eaten and returns the new caloric content.
   If more than the weight is taken, a -1 is returned and if the cookie is packaged a -2 is returned.
   @param weight the weight eaten
   @return the new number of calories in the cookie
   */
   public int eaten(double weight){
      //Checks to ensure
      if (weight > this.weight){
         return -1;
      }
      else if (this.isPackaged == true){
         return -2;
      }
      else {
         int eatenCalories = (int)(weight/this.weight*this.calories);
         this.weight = this.weight - weight;
         this.calories = this.calories - eatenCalories;
         return this.calories;
      }
   }
   
   /**
   Returns all the info of the cookie in a string
   @return the info of the cookie
   */
   public String toString(){
      String cookieInfo = "Name: " + this.name + "\n" + "Caloric Content: " + this.calories + "\n" + "Weight: " + this.weight + "\n" + "Is packaged: " + this.isPackaged;
      return cookieInfo; 
   }
}