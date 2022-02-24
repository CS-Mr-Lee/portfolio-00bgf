/**
Name: Lucy Lin
Date: 2/22/2022 (twosday)
Description: This program uses the Turtle class to fling a turtle around the screen repeatedly, resulting in a drawing of a house.
*/

import java.awt.Color;

public class TurtleMain {
  public static void main(String[] a)
  {
    //A new turtle is borne, lovingly named after my best friend and coloured with what I assume to be her favourite colour
    Turtle anne = new Turtle(-90, 100);
    anne.fillColor("pink");
   
    //Sets background colour and line width
    Turtle.bgcolor(new Color(203, 223, 255));
    anne.width(8);
    
    //Draws a square chimney
    anne.penColor(new Color(185, 159, 99));  
     
    for (int i = 100; i <= 180; i++){
      anne.setPosition(-90, i);
      anne.setPosition(-50, i);
    } 
    
    //Outlines chimney in black
    anne.penColor("black");  
    anne.setPosition(-50, 100);
    anne.setPosition(-90, 100);
    anne.setPosition(-90, 180);
    anne.setPosition(-50, 180);
    anne.up();
    
    //Draws main body of house
    anne.penColor("pink");
    anne.setPosition(-100, -100);
    anne.down();
    
    for (int i = -100; i <= 50; i++){
      anne.setPosition(-100, i);
      anne.setPosition(100, i);
    }   
    
    //Draws roof of house
    anne.penColor("black");
    
    for (int i = 50; i <= 190; i++){
      anne.setPosition(190 - i, i);
      anne.setPosition(-(190 - i), i);
    }
    
    //Outlines the house body
    anne.setPosition(-100, 50);
    anne.setPosition(-100, -100);
    anne.setPosition(100, -100);
    anne.setPosition(100, 50);
    
    //Draws the door
    anne.up();
    anne.setPosition(65, -100);
    anne.down();
    anne.penColor(new Color(140, 140, 140)); 
    
    for (int i = -100; i <= 15; i++){
      anne.setPosition(65, i);
      anne.setPosition(0, i);
    }    
    
    //Outlines the door
    anne.penColor("black");
    anne.setPosition(0, -100);
    anne.setPosition(65, -100);
    anne.setPosition(65, 15);
    anne.setPosition(0, 15);
    
    //Draws a square for the window
    anne.penColor("white");
    anne.up();
    anne.setPosition(-73, -2);
    anne.down();
    
    for (int i = -2; i >= -48; i--){
      anne.setPosition(-73, i);
      anne.setPosition(-27, i);
    }
    anne.up();
    
    //Outlines the window and adds a cross
    anne.setPosition(-25, -50);
    anne.down();
    anne.penColor("black");
    anne.setPosition(-75, -50);
    anne.setPosition(-75, 0);
    anne.setPosition(-25, 0);
    anne.setPosition(-25, -50);
    
    //Draws window outlines
    anne.up(); //Lifting up Anne prevents a thickened line
    anne.setPosition(-50, -50);
    anne.down();
    anne.setPosition(-50, 0);
    anne.up();
    anne.setPosition(-75, -25);
    anne.down();
    anne.setPosition(-25, -25);
    
    //Hiding Anne for full house visibility
    anne.hide();
  }
}