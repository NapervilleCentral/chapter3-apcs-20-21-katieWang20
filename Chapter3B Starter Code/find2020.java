
/**
 * Specifically, they need you to find the two entries that sum to 2020 
 * and then multiply those two numbers together.

For example, suppose your expense report contained the following:
1721
979
366
299
675
1456
In this list, the two entries that sum to 2020 are 1721 and 299. 
Multiplying them together produces 1721 * 299 = 514579, 
so the correct answer is 514579.

Of course, your expense report is much larger. 
Find the two entries that sum to 2020; 
what do you get if you multiply them together?
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;       //for File IO
import java.util.Scanner;



public class find2020
{

     public static void main (String [] args) throws IOException // required for File IO
     {
       Scanner keyboard = new Scanner(System.in);
       Scanner scanFile = new Scanner(new File("mistery2020.txt"));
       
       String junk = scanFile.nextLine();
       
    
       while(scanFile.hasNext())
       {
           int number1 = scanFile.nextInt();
           if (scanFile.hasNext()){
               int number2 = scanFile.nextInt();
               int total = number1 + number2;
               System.out.println(number1+ "+"+ number2 +" " + total);
               if (total == 2020){
                   System.out.println("multipliued = " + number1 * number2);
               }    
               
           }
           
                
           
       }
       
       //junk = scanFile.nextLine();
       
           //int num1 = 0;
           //int num2 = 0;
           
           //num1 = number;
           
           
           
           //System.out.println(number);
           
           
           
           
           //String junk = scanFile.nextLine();
           
           
           
           
       
    }//end of main
}//end of class
