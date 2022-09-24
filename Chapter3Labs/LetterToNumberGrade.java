
/**
 * Write a description of class LetterToNumberGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class LetterToNumberGrade
{
   public static void main(String args[]){
        int highestNumber = 4;
        String letterGrade;
        double numberGrade = 0;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the letter grade (along with plus or minus if it has that) ");
        letterGrade = input.nextLine();
        
        /*
         * 
         * F = 0
         * D- = 0.7
         * D = 1
         * D+ = 1.3
         * C- = 1.7
           C = 2 
           C+ = 2.3
           B- = 2.7
           B = 3
           B+ = 3.3
           A- = 3.4
           A = 3.7
           A+ = 4.0
    
           */
          
        if (letterGrade.equals("F")){
            numberGrade = 0;
        }else if (letterGrade.equals ("D-")){
            numberGrade = 0.7;
        }else if (letterGrade.equals("D")){
            numberGrade = 1;
        }else if (letterGrade.equals("D+")){
            numberGrade = 1.3;
        }else if (letterGrade.equals("C-")){
            numberGrade = 1.7;
        }else if (letterGrade.equals("C")){
            numberGrade = 2;
        }else if (letterGrade.equals("C+")){
            numberGrade = 2.3;
        }else if (letterGrade.equals("B-")){
            numberGrade = 2.7;
        }else if (letterGrade.equals("B")){
            numberGrade = 3;
        }else if (letterGrade.equals("B+")){
            numberGrade = 3.3;
        }else if (letterGrade.equals("A-")){
            numberGrade = 3.4;
        }else if (letterGrade.equals("A")){
            numberGrade = 3.7;
        }else if (letterGrade.equals("A+")){
            numberGrade = 4;
        }
        
        System.out.println("The number grade equivalent is " + numberGrade);
        
        
    
    }
}
