
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Palindrome
{
    // instance variables - replace the example below with your own
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter ONE word: ");
        String word = input.nextLine();
        
        int lengthOfString = word.length();
        
        for (int i = 0; i < lengthOfString; i ++){
            
            //System.out.println(word.charAt(i) + "   " + word.charAt((lengthOfString - 1) - i));
            char compare1 = word.charAt(i);
            char compare2 = word.charAt((lengthOfString - 1) - i);
            
            if (compare1 == compare2){
                System.out.println(compare1 + "   " + compare2);
                    
            }
        }
        
        // index the first letter and last letter
        // compare the first letter and last letter
        // if true, then compare the second letter and second last letter.
        // etc... use index 
        // use counters as index
        
    
    }
    
}
