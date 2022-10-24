
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
        String word2 = word;
        
        
        for (int i = 0; i < lengthOfString;i++){
            
            leftLetter = word2.charAt(i);
            // detects spaces in sentence and replaces it with nothing so it's 1 word

            if (leftLetter == ' '){
                word2 = word2.substring(0, i) + "" + word2.substring(i+1); 
            }
           
            lengthOfString = word2.length();
            // update word length since it becomes shorter when space is removed
        }
        
        word2 = word2.toLowerCase();
        
        for (int i = 0; i < lengthOfString; i++, lengthOfString--){
            
            leftLetter = word2.charAt(i);
            rightLetter = word2.charAt((lengthOfString - 1));
            
            // checks if the letters on left side to right side are equal
            if (leftLetter != rightLetter){
                palindrome = false;
                i = lengthOfString + 1;
                // stops loop once letters are not equal
            }else{
                palindrome = true;
            }
         
        }
        
        if (palindrome == true){
                System.out.println(word + " is a palindrome");
        }else {
                System.out.println(word + " is not a palindrome");
        }
    
    }
    
}
