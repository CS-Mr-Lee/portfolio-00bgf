/**
* Name: Lucy Lin
* Date: Feb 14th 2022
* Description: Grade 11 Challenge Exercise #5: this program repeatedly asks for a numerator and divisor, and prints the 
* quotient. If bad data is entered (dividing by 0 or non numerical values), an informative error message is printed.
* The program keeps looping until data starting with 'q' or 'Q' is entered for the numerator, at which point the 
* program quits without asking for the denominator.
*/

import java.util.Scanner;

public class Lin_Lucy_Foolproof {
   public static void main(String [] args){
      //Declaration of variables
      String numerator = "0", divisor; //numerator variable was initialized to avoid error
      double numeratorNumber, divisorNumber, quotient; 
      char firstLetter;
      boolean keepGoing = true;
      Scanner sc = new Scanner(System.in);
       
      //Do while loop repeatedly prompts for input of two numbers
      do {
         try {
            System.out.print("Enter the numerator: ");
            numerator = sc.nextLine();       
            numeratorNumber = Double.parseDouble(numerator);  
            System.out.print("Enter the divisor: ");
            divisor = sc.nextLine();  
            divisorNumber = Double.parseDouble(divisor); 
            
            //If the divisor isn't 0 numbers are divided and result is outputted
            //If divisor is 0 error message outputted
            if (divisorNumber != 0){
               quotient = numeratorNumber / divisorNumber;
               System.out.println(numerator + " / " + divisor + " is " + quotient);
            }  
            else {
               System.out.println("You can't divide " + numerator + " by zero.");
            }       
         }
         //If the input was not numerical an error message is shown 
         //If the input for numerator starts with q or Q the loop stops
         catch (NumberFormatException e){
            firstLetter = numerator.charAt(0);
            switch (firstLetter) {
               case 'q': case 'Q':
                  keepGoing = false;
                  break;
               default: 
                  System.out.println("You entered bad data.");
                  System.out.println("Please try again.");
            }            
         }
      } while (keepGoing == true);
   }
}
