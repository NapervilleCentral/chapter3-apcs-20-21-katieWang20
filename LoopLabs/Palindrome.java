
/**
 * Katie Wang
 * 10/23/2022
 * Palindrome lab
 * ask user for a string and  tells them if it is a palindrome or not
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
        String editedWord = word;
        
        
        for (int i = 0; i < lengthOfString;i++){
            
            leftLetter = editedWord.charAt(i);
            // detects spaces in sentence and replaces it with nothing so it's 1 word

            if (leftLetter == ' '){
                editedWord = editedWord.substring(0, i) + "" + editedWord.substring(i+1); 
            }
           
            lengthOfString = editedWord.length();
            // update word length since it becomes shorter when space is removed
        }
        
        editedWord = editedWord.toLowerCase();
        
        for (int i = 0; i < lengthOfString; i++, lengthOfString--){
            
            leftLetter = editedWord.charAt(i);
            rightLetter = editedWord.charAt((lengthOfString - 1));
            
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
