/**
Name: Lucy Lin <br>
Date: March 1st 2022 <br>
Description: this is a Vegetable class, and each object has the attributes name, calories, and weight
*/

public class Vegetable {
   /*Attributes*/
   
   /**The name of the vegetable*/
   private String name;
   
   /**The amount of calories*/
   private int calories;
   
   
   /**The weight of the vegetable*/
   private double weight;
   
   /*Constructors*/
   
   /**
   Default veggie constructor
   */
   public Vegetable(){
      this.name = "";
      this.weight = -1;
      this.calories = -1;
   }
   
   /**
   Creates a veggie
   @param name the name of the veg
   @param weight the weight of the veg
   @param calories the number of calories in the veg
   */  
   public Vegetable(String name, double weight, int calories){
      this.name = name;
      this.calories = calories;
      this.weight = weight;
      
      //Restrictions on number of calories, cannot be less than 0
      if (calories < 0){
         this.calories = 0;
      }
      else {
         this.calories = calories;
      }
      
      //Restrictions on weight, cannot be less than 0
      if (weight < 0){
         this.weight = 0;
      }
      else {
         this.weight = weight;
      }
   }
   
   /*Accessors*/
   
   /**
   Gets name of vegetable
   @return name of the veg
   */
   public String getName(){
      return this.name;
   }
   
   /**
   Gets number of calories in veg
   @return number of calories
   */
   public double getCalories(){
      return this.calories;
   }
   
   /**
   Gets the weight of the veg
   @return the weight of the veg
   */
   public double getWeight(){
      return this.weight;
   }
   
   /*Mutators and other methods*/ 
   
   /**Allows the vegetable to be eaten, removes calories based on the percentage of weight eaten, and returns new caloric value
   @param weight the weight of the vegetable eaten
   @return eatenCalories the number of calories the food now contains
   */
   public int eaten(double weight){ //Checks to ensure weight eaten doesn't exceed weight of food
      if (weight <= this.weight){
         int eatenCalories = (int)(weight/this.weight*this.calories);
         this.weight = this.weight - weight;
         this.calories = this.calories - eatenCalories;
         return this.calories;
      }
      else {
         return -1;  //otherwise returns -1 to signal that you tried to be jesus 
      }
   }
   
   /**Returns all the info of the veg in a string
   @return the veggie's name, caloric content, and weight
   */
   public String toString(){
      String vegInfo = "Name: " + this.name + "\n" + "Caloric Content: " + this.calories + "\n" + "Weight: " + this.weight;
      return vegInfo; 
   }
}