
/**
 * Write a description of class PresSpeeches here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import javax.swing.*;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;
/**
 * they would like you to analyze a set of 
inauguration addresses made by US presidents and calculate the average length of each word in a speech, as well as the 
total number of words. Write a program which reads through a speech (do not write code for each speech) stored in a 
text file (examples provided ) and calculate this information. 
   
   */

public class PresSpeeches
{
    public static void main(String[] args) throws IOException{
        //Scanner scanFile = new Scanner( new File("speeches/John Quincy Adams Inaugural.txt"));
        Scanner scanFile = new Scanner( new File("speeches/tedroosevelt.txt"));

        String word;
        int numOfLines = 0;
        int totalNumOfWords = 0;
        int averageWordLength;
        int wordLength;
        int sumOfLengths = 0;
        Scanner input = new Scanner(System.in);
        String findWord;
    
       
        
        scanFile.useDelimiter("\n");   
        
        while (scanFile.hasNext()){
            String next = scanFile.next();
            numOfLines +=1;
        }
        // try to get rid of delimiter setting by scanning again
        //Scanner scanFileAgain = new Scanner (new File("John Quincy Adams Inaugural.txt"));
        Scanner scanFileAgain = new Scanner( new File("speeches/tedroosevelt.txt"));

        System.out.println("Enter a word to find");
        findWord = input.nextLine();
        int findWordCount = 0;
        String file;
        String firstLine;
        String secondLine;
        String totalText ="";
        
        while (scanFileAgain.hasNext()){
            totalNumOfWords +=1; 
            word = scanFileAgain.next();
            totalText +=word + " ";
            
            wordLength = word.length();
            sumOfLengths += wordLength;
            
            //System.out.println(word);
            if (word.equalsIgnoreCase(findWord) || word.equalsIgnoreCase(findWord+".") ||word.equalsIgnoreCase(findWord+",")){
                findWordCount +=1;
    
            }   
        
        }
        System.out.println(totalText);
        averageWordLength = sumOfLengths/totalNumOfWords;
        System.out.println("First line: ");
        System.out.println("Total num of words: " + totalNumOfWords);
        System.out.println("Total numb of lines: " + numOfLines);
        System.out.println("average word length: " + averageWordLength);
        System.out.println(findWord + " is said " + findWordCount + " times.");
        
        System.out.println();
        
        
        
      
        
    }
}
