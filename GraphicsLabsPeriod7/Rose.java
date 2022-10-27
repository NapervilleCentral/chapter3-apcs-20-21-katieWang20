
/**
 * Write a description of class Rose here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import TurtleGraphics.StandardPen;
import TurtleGraphics.*;
import java.awt.*;
import java.lang.Math;

public class Rose
{
    public static void main (String[] args){
        StandardPen aPen = new StandardPen();
        double theta = 0;
        double r;
        double x=0;
        double y=0;
        
        
        //for (int count = 0; count <100; count++){
            for (int a = 0; theta < Math.PI* 2;a++){
                
                    
                    
                r = Math.cos(2 * theta);
                x = r * Math.cos(theta)-1;
                y = r * Math.sin(theta);
                
                aPen.turn(theta);
                        
                theta+= (2*Math.PI)/100;
                //System.out.println(a);
                aPen.move(x*100, y * 100);
                
                
                
            }
            //System.out.println(count);
            
    }
         
        //System.out.println(r);
    
    
}
