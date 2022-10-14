/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;

import java.io.*;       //for File IO

public class ch3notesper7
{
    Integer one = 1;
    enum Classes  {CalculusAB, English, SpanishIII, Gym, Lunch, APCS, APush, Photo}
    enum Grades {A,B,C,D,F}
    enum Week {Monday,Tuesday,Wednesday,Thursday,Friday}
    // enums have an order
   public static void main (String [] args) throws IOException // required for File IO
   { 
       //enum whatever{1,3,5,7,9}must be declared outside of main
       
       Scanner Keyboard = new Scanner(System.in);
       DecimalFormat fmt = new DecimalFormat ("0.###");
       Integer two = 2;
        
       
       Grades mygrade = Grades.F;
       Grades yourgrade = Grades.A;
    
       Week today = Week.Tuesday;
       Week realtoday = Week.Thursday;
       System.out.println( );

       Week sad = Week.Monday;
       Week happy = Week.Friday;
       //System.out.println(happy.compareTo(sad));
       //System.out.println(sad.compareTo(happy));

       //System.out.println(yourgrade.compareTo( mygrade) );
       String[] people = {"Deepa", "Trevor", "Murugan", "Emy",
                          "Thomas", "Charlie",
                          "heinz doofenshmirtz", "Michael",
                          "NoOne", "Bueller","Justin","David"};
                          
    
                        
        
                        

     // enter numbers until user enters Q
/*
     String number;
     int num, total = 0;
     for(int i = 0; i< 5;i++)
     {
         System.out.print("Enter a number");
         number = Keyboard.next();// "5"
         num = Integer.parseInt(number);//converts "5" to digit 5
         total += num;
      }
      System.out.println(total);


    
       
       System.out.println("You scedule is:");
        // new for loop to use with iterators
        //foreach loop
        for (Classes period: Classes.values())
            System.out.println(period);

        System.out.println("Your class roster is:");
        for(String student: people)
            System.out.println(student);




/*    int wordCount = 0, characterCount = 0;
             String line, word;
             StringTokenizer tokenizer;

             System.out.println ("Please enter text");

             line = Keyboard.readString();

                tokenizer = new StringTokenizer (line,"/");


        x = Integer.parseInt(input);
        System.out.print(x);





/* WHAT WILL OUTPUT?
    int k =0, j=0;

    System.out.println("k \tj");

    for(j=0; j<20; j+=k)
    {
        k++;
        System.out.println(k + "\t" + j);
    }

    System.out.println("After the loop \n k= " +k +"\tj= " +j);

C:\Users\khayes\Desktop\Classrooms\APCS 2021\chapter3-apcs-20-21-kevinthayes\Chapter 3 RepoStarterCode

/**/
    // Scanner file i/o defaults at the space
    //relative path, the Folder MUST BE IN THE SAME DIR AS THIS FILE
    
    //review file directories
    // double click -- > \\
    
    Scanner scanFile = new Scanner(new File("speeches\\people.txt"));
    // version 9 -- use single slash
    
    Scanner scanFile2 = new Scanner(new File("data/Debate12016.txt"));
    String data = scanFile.nextLine(); // reads the whole line
    /*
    String name, address, phone;
    
    //dox people 
    
    while(scanFile.hasNext()) // sees if file has another line
    {
        name = scanFile.next();//  reads up to the space before address line
        
        //nextLine() only reads until the \n
        address = scanFile.next();// up to the space before the phone number
        phone = scanFile.next();// up to the space before next line
        System.out.println(data);
        System.out.println(name + "---"+ phone);

    }
    
    
   */
    String word;
    int total = 0;
    int total2 = 0;
     while(scanFile2.hasNext())//hasNext until no more tokens
    {
        word = scanFile2.next();
        //System.out.println(word);

        if (word.equalsIgnoreCase("Donald") || word.equalsIgnoreCase("Donald,") || word.equalsIgnoreCase("Donald.") || word.equalsIgnoreCase("Donald?"))
            total ++;
        else if (word.equalsIgnoreCase("Trump") || word.equalsIgnoreCase("Trump,") || word.equalsIgnoreCase("Trump.") || word.equalsIgnoreCase("Trump?"))
            total2 ++;
    }
    System.out.println("Donald was said "+total);
    System.out.println("Trump : " +total2);







/**/


    //Scanner scanFile = new Scanner(new File ("state of the union 2011.txt"));

    //Scanner scanFile = new Scanner
    //  (new File ("data\\obamatakebackamerica.txt"));
    //Scanner scanFile = new Scanner
    //(new File ("data\\Debate12016.txt"));
    //Scanner scanFile = new Scanner(new File ("jimmy carter a crisis of confidence.txt"));

/*
    String word;
    int count_p = 0, count_y = 0, count_n = 0, count_words = 0, count_j = 0;

    while ()
    {


        //count_words ++;

        //System.out.println(word  );



    }//end of while


//_______________________basic for and scope of i________________________

        // step 1a. ini - only happens once
        // step 1b. middle - condition that results true/false
        //2. body - executes  code
        //3. last - 
        // ini             test            inc
*/

/*  
int i = 0, j = 10;
    for(; i < j && j > 0 ;) // for( ; ; ) is a valid loop
    {
        int k = 5;
        // 
        //                     increase, then output i
        //                     ouput j, and then decrease
        System.out.print("Hi" + ++i + ", "+ j-- + "\n");
        
    }
    
    // ++i increments first, and then outputs the value
    // i ++ outputs the value first, then increments
    // scope of i is only within the loop if it is only intitalized within header
    // >v this creates error because of ^ 
    // System.out.print("After the Loop" + i + "\n");

/*


//--- While loop and sentinel value

/*

    int test;
    System.out.println("Guess my favorite number \n" +
                            "it is between 1-20");
    test = Keyboard.nextInt();

    while (test != -9999)
    {
        if (test == 14)
            System.out.println
                ("it the age of my sons"+
                " Thomas and Charlie");
        else
            System.out.println("Guess again, or -9999 to end the program");

        test = Keyboard.nextInt();

    }


*/

  /*
   * 
   int i =0;//#1
        
        while (i<10)//#2
        {
            System.out.print( "i =" + i +"\n");
            i++;//#3
        }



    
   
   String number = "y";
   int num, sum = 0;
   
   System.out.println("Enter a number: ");
    number = Keyboard.next();
       
   while (!number.equals("q")){
       // get parsed idiot
       
       num = Integer.parseInt(number);
       sum += num;
       System.out.println("Enter a number: ");
       number = Keyboard.next();
       
       
       //converts string to an int
       // Double.parseDouble converts string to a double
       
        
   }
   System.out.println("Sum: " + sum);
   */

   }// end of main

}// end of class









