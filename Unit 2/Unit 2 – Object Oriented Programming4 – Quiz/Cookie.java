/**
Name: Lucy Lin <br>
Date: March 1st 2022 <br>
Description: this is a Cookie class, and each object has the attributes name, calories, weight, and isPackaged. There are 
3 constructors, one for a fully specified cookie, one for a default cookie, and one for a cookie that has everything
specified except for the packaging so you assume it's unpackaged. All accessor methods are created, as well as a method
to return the new number of calories after a cookie is eaten, a method to return all attributes of the cookie in a String,
and a method to unpackage a packaged cookie.
*/

public class Cookie{
   /*Attributes*/
   
   /**The name of the cookie*/
   private String name;
   
   /**The weight of the cookie in grams*/
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
      //Restrictions are set on weight, cannot be less than 0
      if (weight < 0){
         this.weight = 0;
      }
      else {
         this.weight = weight;
      }
      //Restrictions are set on calories, cannot be less than 0
      if (calories < 0){
         this.calories = 0;
      }
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
      //Restrictions are set on weight, cannot be less than 0
      if (weight < 0){
         this.weight = 0;
      }
      else {
         this.weight = weight;
      }
      //Restrictions are set on calories, cannot be less than 0
      if (calories < 0){
         this.calories = 0;
      }
      else {
         this.calories = calories;
      }
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
   @return the weight of the cookie in grams
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
   @param weight the weight eaten in grams
   @return the new number of calories in the cookie
   */
   public int eaten(double weight){
      //Checks to ensure the weight eaten is less than or equal to the total weight and cookie is not packaged
      if (weight > this.weight){
         return -1;  //-1 flags an attempt to eat too much
      }
      else if (this.isPackaged == true){
         return -2;  //-2 flags an attempt to eat a packaged cookie
      }
      else {   //Otherwise calculates number of calories eaten and returns new amount of calories in food
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