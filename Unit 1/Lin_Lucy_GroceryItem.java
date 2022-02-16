/**
* Name: Lucy Lin
* Date: Feb 9th 2022
* Description: Grade 11 Challenge Exercise #1, asks for 2 grocery items and their price 
* and prints out a formatted list with the info given
*/

import java.util.Scanner;

public class Lin_Lucy_GroceryItem {
   public static void main(String [] args){
      //Declaration of variables for grocery names and prices
      Scanner sc = new Scanner(System.in);
      String grocery1, grocery2; 
      double price1, price2; 
      
      //Asks user for grocery names and prices and stores values in appropriate variables
      System.out.println("Please enter the name of the first grocery item:");
      grocery1 = sc.nextLine();
      System.out.println("Please enter the price of this item (without the $ sign):");
      price1 = sc.nextDouble();
      sc.nextLine();
      System.out.println("Please enter the name of the second grocery item:");
      grocery2 = sc.nextLine();
      System.out.println("Please enter the price of this item (without the $ sign):");
      price2 = sc.nextDouble();
      sc.nextLine();
      sc.close();
      
      //Prints top and bottom border using looped dashes and formatted list using printf
      for (int i = 0; i < 27; i++){
         System.out.print("-");
      }  
      
      System.out.printf ("%n%-21s%s%5.2f", grocery1, "$", price1);
      System.out.printf ("%n%-21s%s%5.2f%n", grocery2, "$", price2);
      
      for (int i = 0; i < 27; i++){
         System.out.print("-");
      }
   }
}
