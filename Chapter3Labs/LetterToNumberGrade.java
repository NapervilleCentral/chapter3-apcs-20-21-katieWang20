
/**
 * Katie Wang
 * 9/23/22
 * Letter to number grade converter program
 * 
 * converts letters to number grade ranging from 0-4
 * 0.3 is subtracted if a grade has a minus sign
 * 0.3 is added if grade has a plus sign
 * BUT A+ = 4
 * so I interpreted as A B C D F = 3.7, 3, 2, 1, 0 respectively
 */

import java.util.Scanner;

public class LetterToNumberGrade
{
   public static void main(String args[]){
        int highestNumber = 4;
        String letterGrade;
        double numberGrade = 0;
        boolean invalidGrade = false;
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the letter grade (along with plus or minus if it has that) ");
        letterGrade = input.nextLine();
        
        /**
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
        // compares user input to each of these letter grades and then assigns the number equivalent to numberGrade
        // and then prints it out at the end (if it is valid)
        //use .equals() because input is a string
        
       
        // compares the first letter of the string to each letter in the if statements
        // if the entered string do not pass these conditions, then invalidGrade = true
        
        if (letterGrade.substring(0,1).equals("F")){
            
            if (letterGrade.length() >= 2){
                invalidGrade = true;
                
            }else{
                numberGrade = 0;
            
            }
        
            
        }else if (letterGrade.substring(0,1).equals("D")){
            if (letterGrade.length() == 2){
                if (letterGrade.substring(1).equals("-")){
                    numberGrade = 0.7;
                    
                }else if (letterGrade.substring(1).equals("+")){
                    numberGrade = 1.3;
                    
                }else{
                    invalidGrade = true;
                    
                }
            }else if(letterGrade.length() > 2){
                invalidGrade = true;
                
            }else{
                
                numberGrade = 1;
                
            }
      
        
        }else if (letterGrade.substring(0,1).equals("C")){
            if (letterGrade.length() == 2){
                if (letterGrade.substring(1).equals("-")){
                    numberGrade = 1.7;    
                    
                }else if (letterGrade.substring(1).equals("+")){
                    numberGrade = 2.3;
                    
                }else{
                    invalidGrade = true;
                    
                }
            }else if (letterGrade.length() > 2){
                invalidGrade = true;
                
            }else{
                numberGrade = 2;
                
            }
            
            
        }else if (letterGrade.substring(0,1).equals("B")){
            if (letterGrade.length() == 2){
                if (letterGrade.substring(1).equals("-")){
                    numberGrade = 2.7;
                    
                }else if (letterGrade.substring(1).equals("+")){
                    numberGrade = 3.3;
                    
                }else{
                    invalidGrade = true;
                    
                }
            }else if (letterGrade.length() > 2){
                invalidGrade = true;
                
            }else{
                numberGrade = 3;
                
            }
         
            
        }else if (letterGrade.substring(0,1).equals("A")){
            if (letterGrade.length() == 2){
                if (letterGrade.substring(1).equals("-")){
                    numberGrade = 3.4;
                    
                }else if (letterGrade.substring(1).equals("+")){
                    numberGrade = 4;
                    
                }else{
                    invalidGrade = true;
                    
                }
            }else if (letterGrade.length() > 2){
                invalidGrade = true;
                
            }else{
                numberGrade = 3.7;
                
            }
        }else{
            invalidGrade = true;
        }
      
        
        // if grade entered is invalid, print out that the grade is invalid. 
        // Otherwise, the grade is valid and will print out the number equivalent       
        
        if (invalidGrade == true){
            System.out.println("This grade is invalid");
        
        }else{
            
            System.out.println("The number grade equivalent is " + numberGrade);
        }
    }
}




 
       

    

