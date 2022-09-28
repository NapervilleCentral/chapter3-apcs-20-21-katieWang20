
/**
 * Katie Wang 
 * Minivan program
 * 
 * Program gets user inputs for each mechanism of the car 
 * Then prints out the output of the car
 * see which car doors are open
 * 
 * However, th inside handles do not work if the child lock switch is activated. 
 * In order for the sliding doors to open, the gear shift must be in park,
 * and the master unlock switch must be activated.
 * 
 * I KNOW IT'S A MINIVAN AND NOT A CAR
 */

import java.util.Scanner;

public class StupidCar
{
    public static void main(String[] args){
        
        int doorL;
        int doorR;
        int childLock;
        int masterUnlock;
        int innerL;
        int innerR;
        int outerL;
        int outerR;
        String gear;
        
        
        Scanner input = new Scanner(System.in);
        String carInputs = new String();
        
        System.out.println("Car mechanism order: DL. DR. CL, MU, IL, IR, OL, OR, Gear");
        System.out.println("Enter the car mechanisms in this order.\n0 for off, 1 for activated\nGear options are P N D 1 2 3 R");
        doorL = input.nextInt();
        doorR = input.nextInt();
        childLock = input.nextInt();
        masterUnlock = input.nextInt();
        innerL = input.nextInt();
        innerR = input.nextInt();
        outerL = input.nextInt();
        outerR = input.nextInt();
        input.nextLine();
        gear = input.nextLine();
        
        //INTEGERING A CHAR  TURNS IT INTO ITS ASCII FORM
      
        
        //use indexing
        // do NOT use indexing (read above)
        // .equals() does not like dereferenced chars (chars that are taken from an already-referenced/established string)
        System.out.println("Input: " +doorL+doorR+childLock+masterUnlock+innerL+innerR+outerL+outerR+gear);;
        System.out.println();
        System.out.println(doorL);
        System.out.println(doorR);
        
        if (masterUnlock == 1 && gear.equals("P")){
            System.out.println("The master unlock is activated.");
            if (doorL == 1 || doorL == 0 && innerL == 0 || doorL == 0 && innerL ==1 && outerL == 1){
                System.out.println("The left door is open.");
            }else{
                
            }
            if (doorR == 1 || doorR == 0 && innerR == 0 || doorR == 0 && innerR == 1 && outerR == 1 ){
                System.out.println("The right door is open.");
            }else{
                
            }
        
        }else{
            System.out.println("Both of the doors are closed.");
        
        }
        
        
        
        
        
        
        
        
        
    }
}
