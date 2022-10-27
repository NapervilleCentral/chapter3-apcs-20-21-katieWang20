
/**
 * Katie Wang
 * 10/26/2022
 * Draws the fibonacci squares only
 */

import java.util.Scanner;
import TurtleGraphics.StandardPen;
import TurtleGraphics.*;
import java.awt.*;

public class FobinacciSpiral
{
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        StandardPen pen = new StandardPen();
        
        
        
        int prevNum1 = 0;
        int prevNum2 = 1;
        int prod = 0;
        int maxNum;
        
        System.out.println("Enter the max number of Fibonacci numbers you want: ");
        maxNum = input.nextInt();
      
        for (int count = 1; count <= maxNum; count ++){
            
                prod = prevNum1 + prevNum2;
                System.out.println(prevNum1);    
                
                //draw line, turn 5 times and draw line after each time
                for (int i = 1; i <=5; i++){
                    pen.move(5 * prevNum1);
                    pen.turn(90);
                    
                    
                }
                //draws last line of square before moving on to drawing next square of fibonacci number
            
                pen.move(5*prevNum1);
                
                prevNum1 = prevNum2;
                prevNum2 = prod;
                
             
                
            
        }  
    }
}
