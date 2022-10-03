
/**
 * Katie Wang 
 * 9/29/22
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
 * yes it's a minivan and not a car
 */

import java.util.Scanner;

public class StupidCar
{
    public static void main(String[] args){
        
        int dashboardL;
        int dashboardR;
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
        dashboardL = input.nextInt();
        dashboardR = input.nextInt();
        childLock = input.nextInt();
        masterUnlock = input.nextInt();
        innerL = input.nextInt();
        innerR = input.nextInt();
        outerL = input.nextInt();
        outerR = input.nextInt();
        input.nextLine();
        gear = input.nextLine();
        
        
        System.out.println("Input: " +dashboardL+dashboardR+childLock+masterUnlock+innerL+innerR+outerL+outerR+gear);;
        System.out.println();
        //checks if childlock is on and masterunlock is off. Car cannot open if child lock is activated
        
        if (childLock == 1 && masterUnlock == 0){
            System.out.println("childlock on. Both doors are closed.");
        
        }else if (masterUnlock == 1 && gear.equals("P")){
            System.out.println("The master unlock is activated.");
            if (childLock == 1)
                System.out.println("Child lock activated");
                
            if (childLock == 1 && innerL == 1 && outerL == 0 && dashboardL == 0
            || childLock == 1 && innerL == 0 && outerL == 0 && dashboardL == 0){
                System.out.println("Left door is closed");
            
            }else{
                System.out.println("Left door is open");
            }
            
            if (childLock == 1 && innerR== 1 && outerR == 0 && dashboardR == 0
            || childLock == 1 && innerR== 0 && outerR == 0 && dashboardR == 0){
                System.out.println("Right door is closed");
            }else{
                System.out.println("Right door is open");
            }
            
            
            
        
        }else{
            System.out.println("Both doors are closed.");
        
        }
        
        
        
        
        
        
        
        
        
    }
}
