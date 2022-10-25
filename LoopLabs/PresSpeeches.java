
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

/**
 * they would like you to analyze a set of 
inauguration addresses made by US presidents and calculate the average length of each word in a speech, as well as the 
total number of words. Write a program which reads through a speech (do not write code for each speech) stored in a 
text file (examples provided ) and calculate this information. 
   
   */

public class PresSpeeches
{
    public static void main(String[] args) throws IOException{
        Scanner scanFile = new Scanner( new File("C:\\Users\\xwang\\Desktop\\chapter3-apcs-20-21-katieWang20\\Chapter3B Starter Code\\speeches\\jfk.txt"));
        
        String word;
        int numOfLines = 0;
        int totalNumOfWords = 0;
        int averageWordLength;
        int wordLength;
        int sumOfLengths = 0;
        
        /*
        while (scanFile.hasNextLine()){
            numOfLines +=1;
        
        }
        */
       
        
        scanFile.useDelimiter("\n");   
        
        while (scanFile.hasNext()){
            String next = scanFile.next();
            numOfLines +=1;
        }
        // try to get rid of delimiter setting by scanning again
        Scanner scanFileAgain = new Scanner( new File("C:\\Users\\xwang\\Desktop\\chapter3-apcs-20-21-katieWang20\\Chapter3B Starter Code\\speeches\\jfk.txt"));
        
        while (scanFileAgain.hasNext()){
            totalNumOfWords +=1; 
            word = scanFileAgain.next();
            
            wordLength = word.length();
            sumOfLengths += wordLength;
            
            
            
            
            
        
        }
        averageWordLength = sumOfLengths/totalNumOfWords;
        System.out.println("Total num of words: " + totalNumOfWords);
        System.out.println("Total numb of lines: " + numOfLines);
        System.out.println("average word length: " + averageWordLength);
        
    }
}
