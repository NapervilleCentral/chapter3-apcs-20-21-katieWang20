import java.util.Random;
import java.lang.Math;


public class MontyHall
{
   public static void main(String[] args)
   {
        
        int strategy1Count = 0;
        int strategy2Count = 0;
        final int NUMBER_OF_RUNS = 1000;
        Random generator = new Random();
       
        
      
        for (int y = 1; y<=NUMBER_OF_RUNS; y+=1){
            
            int prizeDoor = generator.nextInt(3) + 1;
            System.out.println(prizeDoor);
            int doorChoice1 = generator.nextInt(3) + 1;
            int stick = 0; // 0 true, 1 is false
            int doorChoice2 = 0;
            System.out.println();
            
            if (doorChoice1 != prizeDoor){
                
                
                System.out.println("Choose or stick");
                int newDoorChoice = generator.nextInt(3)+1;
                
                if (doorChoice1 == newDoorChoice){
                    strategy2Count +=1;
                    System.out.println ("stick");
                    System.out.println(); 
                    
                    if (newDoorChoice == prizeDoor){
                        System.out.println("prizedoor" + prizeDoor + " " + newDoorChoice);
                    }else{
                        System.out.println("You chose door" + newDoorChoice + ". It is not door " + prizeDoor);
                        
                    }
                    
                    
                
                }else{
                    strategy2Count +=1; 
                    System.out.println("new remaining door chosen");
                    if (newDoorChoice == prizeDoor){
                        System.out.println("prizedoor" + prizeDoor + " " + newDoorChoice);
                    }else{
                        System.out.println("You chose door" + newDoorChoice + ". It is not door " + prizeDoor);
                        
                    }
                }
                    
                
            
            } 
            
            
                
        
            
            
        
        }
        
      
      
      
      /*for (int y = 2; y<=20; y+=2)
            if(y%3 == 0)
            System.out.print(++y);
                
        */

      
            
      
      // Simulate the game 1000 times

         // Host must pick a door that's not the player's door and not the
         // door with the car

            /**
               Host has only one choice, the door that is left over. We can
               do this in one step by adding the current player door with the
               car door to yield a number between 1 and 3, if we subtract 3
               from that, we get the leftover door
            */


         // Same trick as the above else case

      System.out.printf("After %d runs, strategy 1 yielded %d wins while "
            + "strategy 2 yielded %d.%n", NUMBER_OF_RUNS, strategy1Count,
            strategy2Count);
   }
}
