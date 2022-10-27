
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
      
        
        
        int prevNum1 = 0;
        int prevNum2 = 1;
        int prod = 0;
        
        //System.out.println("Enter the max number of Fibonacci numbers you want: ");
        int maxNum = 2;//input.nextInt();
        
        
        
       
        
      
        for (int count = 1; count <= maxNum; count ++){
            
                prod = prevNum1 + prevNum2;
                System.out.println(prevNum1);    
                //System.out.println(prevNum2); 
                 
                for (int i = 1; i <=5; i++){
                    pen.move(20 * prevNum1);
                    pen.turn(90);
                    
                    
                }
                pen.move(20*prevNum1);
                
                //pen2.turn(prevNum1/prevNum2);
                //pen2.move(10);
                prevNum1 = prevNum2;
                
                
                prevNum2 = prod;
                
             
                
            
        }
        pen.home();
        pen.setColor(Color.red);
        prevNum1 = 0;
        prevNum2 = 1;
        prod = 0;
        //pen.penUp();
        
        for (int count = 1; count <= maxNum; count ++){
            
                prod = prevNum1 + prevNum2;
                System.out.println(prevNum1);    
                //System.out.println(prevNum2); 
                 
                //pen.move(prevNum1);
                //pen.turn(prevNum1);
                
                
                double theta =0;
                double r = prevNum2;
                double xCenter = 0;
                double yCenter = -1;
                double x;
                double y;
               
                for (theta = Math.PI/2; theta <= Math.PI;){
                        
                            
                        if (count % 4 == 1){
                            yCenter +=prevNum2;
                            xCenter = xCenter;
                            
                            
                            
                        }else if (count % 4 == 2){
                            yCenter = yCenter;
                            xCenter += prevNum2;
                        }else if (count % 4 == 3){
                            yCenter -= prevNum2;
                            xCenter = xCenter;
                        }else if (count % 4 == 0){
                            yCenter = yCenter;
                            xCenter -= prevNum2;
                        }else{
                            ;
                        }
                    
                        x = xCenter + r * Math.cos(theta);
                        y = yCenter +  r * Math.sin(theta);
                                
                        theta += Math.PI/100;
                        System.out.println("sdffsdfsd");
                        pen.move(x*10, y*10);
                    }
                    
                
                
                
                
                
                //double x = r * Math.cos(theta)-1;
                //double y = r * Math.sin(theta);
                /*
                for (; theta <= Math.PI * 6;){
                    double x = r * Math.cos(theta);
                    double y = r * Math.sin(theta);
                    pen.move(x, y);
                    
                    
                    theta += Math.PI/100;
                
                }
                */
                
                
                
                
                
                
                prevNum1 = prevNum2;
                
                prevNum2 = prod;
                
                
                
            
        }
        
        //Shapes circle = new Shapes();
        
        //circle.drawCircle(10, 10, 5);
        
        
        
        
    }
}
