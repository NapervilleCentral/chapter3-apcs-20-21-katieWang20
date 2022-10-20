
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Palindrome
{
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        char leftLetter;
        char rightLetter;
        int lengthOfString = word.length();
        boolean palindrome = false;
        for (int i = 0; i < lengthOfString; i++, lengthOfString--){
            
            //System.out.println(word.charAt(i) + "   " + word.charAt((lengthOfString - 1) - i));
            
            
            leftLetter = word.charAt(i);
            rightLetter = word.charAt((lengthOfString - 1));
            
            if (leftLetter != rightLetter){
                palindrome = false;
                i = lengthOfString + 1;
            }else{
                palindrome = true;
            }
         
            
        
            
            // index the first letter and last letter
            // compare the first letter and last letter
            // if true, then compare the second letter and second last letter.
            // etc... use index 
            // use i as index
        
        }
        System.out.println(palindrome);
        if (palindrome == true){
                System.out.println(word + " is a palindrome");
        }else {
                System.out.println(word + " is not a palindrome");
        }
    
    }
    
}
