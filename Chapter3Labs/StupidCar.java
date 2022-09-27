
/**
 * Write a description of class StupidCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * I KNOW IT'S A MINIVAN AND NOT A CAR
 */

import java.util.Scanner;

public class StupidCar
{
    public static void main(String[] args){
        
        short doorL;
        short doorR;
        short childLock;
        short masterUnlock;
        short innerL;
        short innerR;
        short outerL;
        short outerR;
        
        
        
        Scanner input = new Scanner(System.in);
        String carInputs = new String();
        
        System.out.println("Car mechanism order: DL. DR. CL, MU, IL, IR, OL, OR, Gear");
        System.out.println("Enter the car mechanisms in this order.\n0 for off, 1 for activated\nGear options are P N D 1 2 3 R");
        doorL = input.nextShort();
        doorR = input.nextShort();
        childLock = input.nextShort();
        masterUnlock = input.nextShort();
        innerL = input.nextShort();
        innerR = input.nextShort();
        outerL = input.nextShort();
        outerR = input.nextShort();
        
        
        //INTEGERING A CHAR  TURNS IT INTO ITS ASCII FORM
      
        
        //use indexing
        // do NOT use indexing (read above)
        // .equals() does not like dereferenced chars (chars that are taken from an already-referenced/established string)
        
        if (masterUnlock == 1){
            System.out.println("The master unlock is activated");
            if (doorL == 1){
                System.out.println("The left door is open.");
            }
            if (doorR == 1){
                System.out.println("The right door is open.");
            }
        
        }
        
        
        
        
        
        
        
        
        
    }
}
