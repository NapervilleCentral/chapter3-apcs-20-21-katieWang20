
/**
 * Katie Wang
 * 9/23/2022
 * Weight on planet program
 * 
 * Calculator a person's weight on other planets
 * Takes user input of their weight in pounds or kilograms, and the planet they choice
 * Then multiplies it by the proportion needed to find the weight on the planet
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class WeightOnPlanet
{
    public static void main(String[] args){
        
        DecimalFormat fmt = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        int weightOnEarth;
        double weightOnOther = 0;
        int planetChoice;
        String planet = "";
 
        
        
        System.out.println("1. Mercury\n2. Venus\n3. Earth\n4. Mars\n5. Jupiter\n6. Saturn\n7. Uranus\n8. Neptune\n9. Pluto");

        System.out.print("Choose a planet by number: ");
        planetChoice = input.nextInt(); 
        
        System.out.println("Enter your weight on earth (pounds): ");
        weightOnEarth = input.nextInt();
        input.nextLine(); // skips over getting input from planetChoice = input.nextLine(); 
        // if this input.nextLine(); is not placed before it
        
                
        switch(planetChoice){
            // weightOnOther = the weight on earth multiplied by the proportion
            //needed to calculate how much you weigh on another planet
            case 1:
                weightOnOther = weightOnEarth * 0.38;
                planet = "Mercury";
                break;
                //mercury
            
            case 2:
                weightOnOther = weightOnEarth *   0.91;
                planet = "Venus";
                break;
                //stop cascading calcaulations
                
            case 3:
                weightOnOther = weightOnEarth * 1;
                planet = "Earth";
                break;
                
            case 4:
                weightOnOther = weightOnEarth * 0.38;
                planet = "Mars";
                break;
                
            case 5:
                weightOnOther = weightOnEarth * 2.34;
                planet = "Jupiter";
                break;
            
            case 6:
                weightOnOther = weightOnEarth * 1.06;
                planet = "Saturn";
                break;
                
            case 7:
                weightOnOther = weightOnEarth * 0.92;
                planet = "Uranus";
                break;
                
            case 8:
                weightOnOther = weightOnEarth * 1.19;
                planet = "Neptune";
                break;
                
            case 9:
                weightOnOther = weightOnEarth * 0.06;
                planet = "Pluto";
                // Does not matter if it's not a planet. Tt is still something that a person would put in because they think it is.
        
        }
        
        
        System.out.print("You weigh " + fmt.format(weightOnOther) + " pounds on " + planet);
    
    
    }
}
