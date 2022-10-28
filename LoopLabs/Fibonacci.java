
/**
 * Katie Wang
 * 10/26/2022
 * Fibonacci program
 * This program asks user how many numbers of the fibonacci sequence that they want
 * Then returns the numbers
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
        int sum = 0;
        
        System.out.println("Enter the max number of Fibonacci numbers you want: ");
        int maxNum = input.nextInt();
        
      
        for (int count = 1; count <= maxNum; count ++){
                System.out.println(prevNum1);
                //split fibonacci sequence into 3 sections
                //  prevNum1 = addend, prevNum2 = addend, sum = sum
                
                // add the  two previous numbers (addends) to get the sum
                
                sum = prevNum1 + prevNum2;
                
                // move each variable to the next number of the sequence
                prevNum1 = prevNum2;
                prevNum2 = sum;
            
        }
    }
}
