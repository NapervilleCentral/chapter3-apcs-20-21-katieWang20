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
        
        
        x = Keyboard.nextInt();
        //extended ifs order is important. 
        
        
        if (x<10){
            
            System.out.println("You're a baby");    
            System.out.println("What grade school are you in?");
            Keyboard.nextLine();
            school = Keyboard.nextLine();
            
            if (school.equals("Scott")){
                System.out.println("Go Eagles "); //one equal sign is assignment
                // double equal sign is comparison. DOES NOT WORK WITH STRINGS
            
            }else if (school =="Steeple Run"){
                System.out.println("Go super stars");
            }else{
                System.out.println("Did you not go to a school");
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
        
/**/
    String word1 = "apple";
    String word2 = "cat";
    String word3 = "dog";

    if(word2.compareTo(word1)<0)//;end a statement BAD BAD simicolen
    {
        System.out.println(word2 +" is before " + word1  );
        System.out.println("and cats are evil" );
    }//ctrl M - will match brackets
    else
        System.out.println(word1 +" is before " + word2  );

    if(word2.compareTo(word3)<0)
        System.out.println(word2 +" is before " + word3  );
/*

      int num = 5, num1 =10, num2 = 4;  // standard hours in a work week

      System.out.print ("Enter a number ");
      num = Keyboard.nextInt();

       System.out.print ("Enter a  second number ");
       num1 = Keyboard.nextInt();

       System.out.print ("Enter a  third number ");
       num2 = Keyboard.nextInt();

      System.out.println ();
/*

       boolean a = true, b = false, c = false,d;
        //System.out.println(a  );
      // c =(a = true) || (b = true);
      // System.out.println(a + "-" + b + "-" + c);


    //   c = (a = false) || (b = true);
    //   System.out.println(a + "-" + b+ "-" + c);

//     c =(a = false) && (b = true);
 //    System.out.print(a + "-" + b+ "-" + c);
//
//     c = (a = true) && (b = false);
//     System.out.print(a + "-" + b + "-" + c);

//     d =!(a = true) || (b = true) && (c = true);
//     System.out.print(a + "-" + b + "-" + c+ "-" + d);


/*  */

}// end of main


}// end of class









