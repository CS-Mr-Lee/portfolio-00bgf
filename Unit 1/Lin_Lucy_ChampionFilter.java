/**
* Name: Lucy Lin 
* Date: Feb 15th 2022
* Description: This program reads through a file containing a list of league champions and their stats. It finds
* the champion with the highest hp and the champion with the lowest armor, and writes the name and respective hp/armor
* values to a text file on separate lines.
*/

import java.io.*;

public class Lin_Lucy_ChampionFilter{
   public static void main(String[] args){
      /*All variables were intialized to prevent error.
      lowestArmor set ludicrously high intially so that the first armor value
      would be stored as the initial lowest armour, same with maxHp being
      set to 0 so that the first hp value would be stored as the initial highest hp*/
      String line, currentName = "", lowArmorName = "", hpName = "";
      double currentArmor = 0, lowestArmor = 10000, currentHp = 0, maxHp = 0; 
      
      //A buffered reader is used to read through the entire file line by line
      try {           
         BufferedReader br = new BufferedReader(new FileReader("champions.json"));
         while ((line = br.readLine()) != null){
        
            //If current line contains id identifier, name of champion is stored
            if (line.contains("id\"")){
               currentName = line.substring(11, (line.length()-2));  
            }
            
            //If current line contains armor identifier, armor value is stored
            if (line.contains("armor\"")){
               currentArmor = Double.parseDouble(line.substring(15, (line.length()-1)));  
               //Current armor value is compared to the lowest armor value, if current is lower than the stored lowest the current becomes the new lowest
               if (currentArmor < lowestArmor){
                  lowestArmor = currentArmor;
                  lowArmorName = currentName;   //Current champion's name stored as name of champion with lowest armor
               }
            }
            
            //If current line contains hp identifier, hp value is stored
            if (line.contains("hp\"")){
               currentHp = Double.parseDouble(line.substring(12, (line.length()-1)));
               //Current hp value compared to max hp value, if current higher than max the current becomes the new max
               if (currentHp > maxHp){
                  maxHp = currentHp;
                  hpName = currentName; //Current champion's name stored as name of champion with highest hp
               }
            }
         }
         br.close();
      }
      catch (IOException e){
         System.out.println("Error reading file");
      }
      
      /*A buffered writer is used to write the name and hp of the champion with the highest hp on one line, 
      and the name and armor of the champion with the lowest armor on a new line. Both lines are written to
      a text file named MaxChampStats.txt*/
      try {
         BufferedWriter bw = new BufferedWriter(new FileWriter("MaxChampStats.txt", false));  
         bw.write(hpName + " " + maxHp); 
         bw.newLine();
         bw.write(lowArmorName + " " + lowestArmor);
         bw.close();
      }
      catch (IOException e){
         System.out.println("Error writing file");
      }
   }
}