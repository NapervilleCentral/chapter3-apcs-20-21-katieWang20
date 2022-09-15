/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */
import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class ch3notesstartercode
{
public static void main (String [] args)
{

        Scanner Keyboard = new Scanner(System.in);
        int x;
        String school = "Washington";
        
        /*
        x = Keyboard.nextInt();
        //extended ifs order is important. 
        
        
        if (x<10){ //extended ifs are like "or"s. 
            //if your less than 10 or less than 13 or etc...
            
            System.out.println("You're a baby");    
            System.out.println("What grade school are you in?");
            Keyboard.nextLine();
            school = Keyboard.nextLine();
            
            if (school.equals("Scott")){
                System.out.println("Go Eagles "); //one equal sign is assignment
                // double equal sign is comparison. DOES NOT WORK WITH STRINGS
            
            }else if (school.equals("Steeple Run")){
                System.out.println("Go super stars");
            }else{
                System.out.println("You are not a soup star. That is very sad");
                System.out.println("Yo what;s up it's Tartar in da house");
            }
            
            
            
        }else if (x<13){
        
            System.out.println("You;re still in junior high");
        
        }else if (x < 20){
            System.out.println
            ("You're still in high school");
            
        }else if (x < 55){ 
            System.out.println
            ("You are younger than Mr. Hayes. Ok.");
        
        }else if (x > 55){
            System.out.println
            ("You are older than Mr. Hayes. Retiring soon? Congratulations");
            
        }else if (x>0){
            
            System.out.println("How old are you bruh");
        
        
        
        
        }
        
*/
/*
    String word1 = "apple";
    String word2 = "cat";
    String word3 = "dog";
    //compare by alphabetical order
    // if a word comes before another one, result is negative
    // if equal, result is 0
    // if after, result is positive
    
    //compares by alphabetical order
    if(word1.compareTo(word2)<0)//a semicolon ; ends a statement BAD BAD simicolen
    {
        System.out.println(word1 +" is before " + word2  );
        System.out.println("and cats are evil" );
    }//ctrl M - will match brackets
    else
        System.out.println(word1 +" is before " + word2  );

    if(word2.compareTo(word3)<0)
        System.out.println(word2 +" is before " + word3  );
*/
/*
      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();

       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();

      if (num>num1)
           {
               if (num>num2)
                {
                    System.out.println( num + "is the greatest number");
                }
                else {
                    System.out.println( num2 + "is the greatest number");
                }
            }
        else
        {  
            if (num1>num2){
                System.out.println( num1 + "is the greatest number");
            }
            else {
                System.out.println( num2 + " is the greatest number");
            }
        }
      */
      
        // short circuiting
        
        boolean a = false, b = false, c = false,d;
        
        //System.out.println(a  );
        //c = (a = true) || (b = true); // 
        //System.out.println(a  );//short circuit on true
       // System.out.println(a + "-" + b + "-" + c);
        
    //   c = (a = false) || (b = true);
    //   System.out.println(a + "-" + b+ "-" + c);

        //c =(a = false) && (b = true); // && short circuits on false. does not assign b = true
        //System.out.print(a + "-" + b+ "-" + c); //if any is false, all are false
//
     //c = (a = true) && (b = false);
     //System.out.print(a + "-" + b + "-" + c); // 
//   =! (not equal to) is done first, then && (and) is done second, then | | (or) is done last
    // if d is not equal to a or b = c (true), then everything is true 
    // true is prioritized?
    // d gets assigned true 
    //d =!(a = true) || (b = true) && (c = true);
     //System.out.print(a + "-" + b + "-" + c+ "-" + d);
     

/*  */
    /*
    double wallet = 1 * 0.01 + 2 * 0.05 + 3 * 0.10 + 4 * 0.25;
    System.out.println(wallet);
    
    // add tolerance level
    
    final double TOLERANCE = 0.01;
    
    
    if (Math.abs(wallet-1.41)<TOLERANCE) //abs=  asbolute value. turns number into abs value
    
    {
        System.out.println("correct");
    }
    else
    {
        System.out.println("Add good?");
    }
    */
    
    char choice = Keyboard.nextLine().charAt(0);
    
    switch (choice){
        
        case 'h':
            System.out.println("4.99");
            break;
            // has cascading effect if there is no break after this
            // prints the next numbers if there is no break
            // breaks stops the execution of a current structure
            // it is also poor programming practice to use it for loop or while
            // do not use it often
            
        case 'f':
            System.out.println("1.99");
            break;
        case 's':
            System.out.println("2.99");
            break;
        default:
            System.out.println ("Invalid choice");
            
    
    
        }
    
    
    }// end of main


}// end of class









