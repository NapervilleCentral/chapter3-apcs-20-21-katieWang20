/*
 * Katie Wang
 * 10/18/2022
 * Monty Hall program
 *  This program stimulates the Monty Hall game using two strategies
 *  and prints out the number of successes for each strategy
 *  
 * 
   */
//Simulate the game 1000 times

import java.util.Random;


public class MontyHall
{
   public static void main(String[] args)
   {
        //strategy1Count counts the number of wins made with the strategy of switching doors after a zonk is revealed
        //strategy2Count counts the number of wins made with the strategy of sticking with the same door after a zonk is revealed
        int strategy1Count = 0;
        int strategy2Count = 0;
        final int NUMBER_OF_RUNS = 1000;
        Random generator = new Random();
       
        
      
        for (int y = 1; y<=NUMBER_OF_RUNS;){
            
            // y only increases if a win is made. Otherwise the run count will repeat.
            System.out.println("Run number" + y +"\n");
            int prizeDoor = generator.nextInt(3) + 1;
            // choose door 1, 2, or 3
            int doorChoice1 = generator.nextInt(3) + 1;
            int doorChoice2 = 0;
            System.out.println();
            int hostChoice = generator.nextInt(3) + 1;
            // Host must pick a door that's not the player's door or door with the car
         
            // if host chooses a prize door or the same choice as the player,
            // keep regenerating the door number until it is not
            
            while (hostChoice == doorChoice1 || hostChoice == prizeDoor){
                hostChoice = generator.nextInt(3) + 1;
            
            }
            
            
            if ((doorChoice1 != prizeDoor) ||(doorChoice1 == prizeDoor)){
            System.out.println("You chose Door " + doorChoice1);
                
             
            System.out.println("host reveals Door " +hostChoice + " is the zonk!\n");
            
                
            System.out.println("Choose new door or stick");
                
            int newDoorChoice = generator.nextInt(3)+1;
            while (newDoorChoice == hostChoice){
                    //if the new choice is same as zonk ,then keep regenereating a door number until it is not
                newDoorChoice = generator.nextInt(3)+1; 
                
            }
            // if the new generated number is the same as the original choice, that means the player sticks
            // else, the player has chosen a new door
            if (doorChoice1 == newDoorChoice){
                    
                System.out.println ("stick\n");
                System.out.println(); 
                    
                if (newDoorChoice == prizeDoor){
                        strategy2Count +=1;
                        System.out.println("prizedoor is" + prizeDoor + ". Your stuck choice is " + newDoorChoice);
                        System.out.println("You get the prize.");
                        y+=1;
                }else{
                        System.out.println("You chose door " + newDoorChoice + ". It is not door " + prizeDoor);
                        
                }
                    
                    
                
            }else{
                    
                System.out.println("Choose new door\n");
                if (newDoorChoice == prizeDoor){
                        strategy1Count +=1;
                        System.out.println("prizedoor is " + prizeDoor + " and new door is " + newDoorChoice);
                        System.out.println("You get the prize.");
                        y+=1;
                }else{
                        System.out.println("You chose door" + newDoorChoice + ". It is not door " + prizeDoor);
                        
                }
            }
                    
                
            
           
            
            
                
        
            
            
        
        }
        
          System.out.println(strategy1Count + "   " + strategy2Count);
          System.out.printf("After %d runs, strategy 1 yielded %d wins while "
            + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count,
            strategy2Count);
        }
    }
}
