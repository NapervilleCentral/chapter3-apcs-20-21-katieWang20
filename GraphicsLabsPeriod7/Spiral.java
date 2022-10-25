
/**
 * Write a description of class FourLeafRose here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.StandardPen;

import TurtleGraphics.*;
import java.awt.*;

public class Spiral
{
   public static void main (String[] args){
        StandardPen pen = new StandardPen();
        //Shapes shape = new Shapes();
        
        Color newColor = new Color(128, 0, 128);
        
        for (int z = 0; z < 29; z++){
            
            pen.move(z*4);
            pen.turn(90);
            
        
        
        }
        
   }
}
