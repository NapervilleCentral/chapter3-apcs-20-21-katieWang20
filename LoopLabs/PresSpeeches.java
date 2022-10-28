
/**
 * Katie Wang
 * 10/26/2022
 * US President speeches lab
 * This program anyalizes speeches of president from different eras
 * 
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
        // home computer can scan file without underscores as spaces
        // school computer needs underscores 
        
        //1776 - 1830s:
        //Scanner scanFile = new Scanner( new File("speeches/George Washington first Inaugural.txt"));
        Scanner scanFile = new Scanner( new File("speeches/John Quincy Adams Inaugural.txt"));
        
        //1830 - 1920s:
        //Scanner scanFile = new Scanner( new File("speeches/tedroosevelt.txt"));
        //Scanner scanFile = new Scanner( new File("speeches/taft.txt"));
        
        //modern:
        //Scanner scanFile = new Scanner( new File("speeches/R Nixon Decision to resign.txt"));
        //Scanner scanFile = new Scanner (new File("speeches/obamatakebackamerica.txt"));
        String word;
        int numOfLines = 0;
        int totalNumOfWords = 0;
        int averageWordLength;
        int wordLength;
        int sumOfLengths = 0;
        Scanner input = new Scanner(System.in);
        String findWord;
        String findWord2;
        String findWord3;
    
       
        while (scanFile.hasNext()){
            String next = scanFile.nextLine();
            numOfLines +=1;
        }
         
        //starts scanning from beginning again
        Scanner scanFileAgain = new Scanner( new File("speeches/John Quincy Adams Inaugural.txt"));
      
        
        System.out.println("Enter three words to find");
        findWord = input.nextLine();
        findWord2 = input.nextLine();
        findWord3 = input.nextLine();
        
        int findWordCount = 0;
        int findWordCount2 = 0;
        int findWordCount3 = 0;
        String file;
        String firstLine;
        String secondLine;
        String totalText ="";
        String line1 = scanFileAgain.nextLine();
        String line2 = scanFileAgain.nextLine();
        
        while (scanFileAgain.hasNext()){ 
            
            numOfLines +=1;
            //does not count name and date 
            totalNumOfWords +=1; 
            word = scanFileAgain.next();
            
            
            wordLength = word.length();
            sumOfLengths += wordLength;
    
            if (word.equalsIgnoreCase(findWord) || word.equalsIgnoreCase(findWord + ".") ||word.equalsIgnoreCase(findWord + ",")){
                findWordCount +=1;
    
            }else if (word.equalsIgnoreCase(findWord2) || word.equalsIgnoreCase(findWord2 + ".") ||word.equalsIgnoreCase(findWord2 + ",")){
                findWordCount2 +=1;
            }else if (word.equalsIgnoreCase(findWord3) || word.equalsIgnoreCase(findWord3 + ".") ||word.equalsIgnoreCase(findWord3 + ",")){
                findWordCount3 += 1;
            }else{
            ;
            }
      
            
        
        
        }
        
        averageWordLength = sumOfLengths/totalNumOfWords;
        
        System.out.println("First line: "+ line1);
        System.out.println("Second line: " + line2);
        System.out.println("Total num of words: " + totalNumOfWords);
        System.out.println("Total numb of lines: " + numOfLines);
        System.out.println("average word length: " + averageWordLength);
        System.out.println();
        
        System.out.println(findWord + " is said " + findWordCount + " times.");
        System.out.println(findWord2 + " is said " + findWordCount2 + " times.");
        System.out.println(findWord3 + " is said " + findWordCount3 + " times.");
    }
}
