/** 
* Name: Lucy Lin
* Date: Feb 15th 2022 
* Description: This program accepts a line of line of code from the user, and encrypts it by switching the first and last characters of each 
* word in the line, and shifting the middle letters back by 2 using ASCII values. The spaces between words are kept, and the encrypted line is printed.
*/

import java.util.Scanner;

public class Lin_Lucy_Encryption {
  public static void main(String[] args){
    //Declaration of variables
    Scanner sc = new Scanner(System.in);
    String lineInput;
    String [] splitLine;

    //Prompts user for a line  
    System.out.println("Please enter a line of code to be encrypted: ");
    lineInput = sc.nextLine();
    sc.close();
    
    //Splits line into array of words
    splitLine = lineInput.split(" ");

    //Iterates through each word in the line, encrypting and adding space at end
    for (int i = 0; i < splitLine.length; i++){
      //Prints last character in current word first
      System.out.print(splitLine[i].charAt(splitLine[i].length() - 1));
      //If the current word is more than one letter middle letters are pushed back 2 ASCII values and first character is printed last
      if (splitLine[i].length() > 1){
        for (int j = 1; j < (splitLine[i].length() - 1); j++){
          System.out.print((char)(splitLine[i].charAt(j) + 2));  //Int value casted back to char before printing
        } 
        System.out.print(splitLine[i].charAt(0));
      }  
      System.out.print(" ");
    }
  }
}
