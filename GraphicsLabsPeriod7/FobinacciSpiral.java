
/**
 * Write a description of class FobinacciSpiral here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        int x = 0;
        int y = 1;
        int prevNum1 = 0;
        int prevNum2 = 1;
        int prod = 0;
        
        //System.out.println("Enter the max number of Fibonacci numbers you want: ");
        int maxNum = 10;//input.nextInt();
        
        
        
        for (int sides = 1; sides <=5; sides++){
                    
                    pen.move(10 * prevNum1);
                    pen.turn(90);
                    
        }
        pen.move(10 * prevNum1);
        
        if (maxNum == 1){
            System.out.println(prevNum1);
        }else if (maxNum == 2){
            System.out.println(prevNum1);
            System.out.println(prevNum2);
        }else{
            System.out.println(prevNum1);
            System.out.println(prevNum2);
            for (int count = 1; count <= maxNum; count ++){
            
                prod = prevNum1 + prevNum2;
                //System.out.println(prevNum1);    
                //System.out.println(prevNum2); 
                System.out.println(prod);
                
                
                
                for (int sides = 1; sides <=5; sides++){
                    pen.move(10 * prevNum1);
                    pen.turn(90);
                
                }
                pen.move(10 * prevNum1);
                pen.move(10 * prevNum2);
                for (int sides = 1; sides <=5; sides++){
                    pen.move(10 * prevNum2);
                    pen.turn(90);
                
                }
                pen.move(10 * prevNum2);
                pen.move(10 * prod);
                
                for (int sides = 1; sides <=5; sides++){
                    pen.turn(90);
                    pen.move(10 * prod);
                
                }
            
                pen.move(10 * prod);
                prevNum1 = prevNum2;
                prevNum2 = prod;
                
                
                pen.move(prevNum2);
            
            }
        }
    }
}
