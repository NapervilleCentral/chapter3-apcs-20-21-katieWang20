
/**
 *Katie Wang
 *10/26/2022
 *Four leaf rose
 *This program draws a four leaf rose
 *
 */
import TurtleGraphics.StandardPen;
import TurtleGraphics.*;
import java.awt.*;
import java.lang.Math;

public class Rose
{
    public static void main (String[] args){
        RainbowPen aPen = new RainbowPen();
        double theta = 0;
        double r;
        double x=0;
        double y=0;
        
        
           // draw in 100 steps
            for (; theta < Math.PI* 2;){
                
                    
                //formulas for each point that the pen should move to 
                r = Math.cos(2 * theta);
                x = r * Math.cos(theta)-1; 
                // - 1 removes weird line by shifting x-coordinates to the left 
                y = r * Math.sin(theta);
                
                aPen.turn(theta);
                        
                theta+= (2*Math.PI)/100;
                
                aPen.move(x*100, y * 100);
                
                
                
            }  
    }
}
