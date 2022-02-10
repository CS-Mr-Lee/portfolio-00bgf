/**
* Name: Lucy Lin
* Date: Feb 10th 2022
* Description: Grade 11 Challenge Exercise #2, this program contains a method that returns the smallest
* angle in a triangle (in degrees), given two sides and the angle between them (in radians). 
*/

import java.util.Scanner;
import java.lang.Math;

public class Lin_Lucy_SASTriangleSolver{
   public static void main (String[] args){
      //Declaration of variables
      Scanner sc = new Scanner(System.in);
      double side1, side2, angle;
      
      //Asks user for measurements of sides and angle and stores values
      System.out.println("Please input the length of the first side:");
      side1 = sc.nextDouble();
      sc.nextLine();
      System.out.println("Please input the length of the second side:");
      side2 = sc.nextDouble();
      sc.nextLine();
      System.out.println("Please input the angle between the two sides, in radians:");
      angle = sc.nextDouble();
      
      //Uses smallestAngle method and given values to print smallest angle 
      System.out.println("The smallest angle in this triangle is " + smallestAngle(side1, side2, angle) + " degrees.");
   }
   
   /**
   * Description: this method takes the measurements for 2 sides of a triangle and the angle between them,
   * calculates the remaining angles, and returns the smallest angle
   * 
   * @param side1: measurement given for the first side 
   * @param side2: measurement given for the second side
   * @param givenAngle: angle measurement given in radians
   * @return the smallest angle in the trianlge in degrees
   */
   
   public static double smallestAngle(double givenSide1, double givenSide2, double givenAngle){  
      //Declaration of variables 
      double calcSide, calcAngle1, calcAngle2;
      
      //Using cosine law (a^2 = b^2 + c^2 -2 bc cosA) to find length of third side opposite to given angle
      calcSide = Math.sqrt(givenSide1*givenSide1 + givenSide2*givenSide2 - 2*givenSide1*givenSide2*Math.cos(givenAngle));
      
      //Using sine law (sina/a = sinb/b) to find the other two angles in radians
      calcAngle1 = Math.asin(Math.sin(givenAngle)/calcSide*givenSide1);
      calcAngle2 = Math.asin(Math.sin(givenAngle)/calcSide*givenSide2);
      
      //Compares the calculated values for angles together and returns the smallest value
      if (givenAngle <= calcAngle1 && givenAngle <= calcAngle2){
         return givenAngle*(180/Math.PI);  //Converts angle from radians to degrees using 180/pi conversion factor
      }
      else if (calcAngle1 <= givenAngle && calcAngle1 <= calcAngle2){
         return calcAngle1*(180/Math.PI);
      }
      else{
         return calcAngle2*(180/Math.PI);
      }
   }
}