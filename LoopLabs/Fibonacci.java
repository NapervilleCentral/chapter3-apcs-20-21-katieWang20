
/**
 * Write a description of class Fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;


public class Fibonacci
{
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        int x = 0;
        int y = 1;
        int prevNum1 = 0;
        int prevNum2 = 1;
        int prod = 0;
        
        System.out.println("Enter the max number of Fibonacci numbers you want: ");
        int maxNum = input.nextInt();
        
      
        for (int count = 1; count <= maxNum; count ++){
                System.out.println(prevNum1);
                
                prod = prevNum1 + prevNum2;
            
                prevNum1 = prevNum2;
                prevNum2 = prod;
            

            
        }
    }
}
