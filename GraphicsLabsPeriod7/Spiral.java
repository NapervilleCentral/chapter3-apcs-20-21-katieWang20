
/**
 * Katie Wang
 * 10/25/2022
 * Spiral 
 * draws a square-shaped spiral
 */
import TurtleGraphics.StandardPen;

import TurtleGraphics.*;
import java.awt.*;
import java.util.Scanner;

public class Spiral
{
   public static void main (String[] args){
        StandardPen pen = new StandardPen();
        Scanner input = new Scanner(System.in);
        //Shapes shape = new Shapes();
        
        Color newColor = new Color(128, 0, 128);
        int maxNum; 
        System.out.println("Enter a number: ");
        maxNum = input.nextInt();
        for (int z = 0; z <= maxNum; z++){
            
            pen.move(z*4);
            pen.turn(90);
            
        
        
        }
        
   }
}
