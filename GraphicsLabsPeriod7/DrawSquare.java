
/**
 * Write a description of class DrawSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import TurtleGraphics.StandardPen;
import TurtleGraphics.*;
import java.awt.*;

public class DrawSquare
{
    public static void main (String[] args){
        StandardPen pen = new StandardPen();
        
        Color newColor = new Color(128, 0, 128);
        
        pen.move(100);
        pen.setColor(Color.red);
        pen.turn(90);
        pen.move(50);
       /* pen.turn(-90);
        pen.move(100);
        pen.setColor(newColor);
        pen.turn(90);
        pen.move(1000);
        */
    }
}
