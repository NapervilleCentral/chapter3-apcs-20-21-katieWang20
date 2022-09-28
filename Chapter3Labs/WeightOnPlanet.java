
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
        String planetChoice;
        
        
        System.out.println("Enter your weight on earth (pounds): ");
        weightOnEarth = input.nextInt();
        input.nextLine(); // skips over getting input from planetChoice = input.nextLine(); 
        // if this input.nextLine(); is not placed before it
        
        System.out.print("Name a planet: ");
        planetChoice = input.nextLine(); 
        
        switch(planetChoice){
            // weightOnOther = the weight on earth multiplied by the proportion
            //needed to calculate how much you weigh on another planet
            case "Mercury":
                weightOnOther = weightOnEarth * 0.38;
                break;
            
            case "Venus":
                weightOnOther = weightOnEarth *   0.91;
                break;
                //stop cascading calcaulations
                
            case "Earth":
                weightOnOther = weightOnEarth * 1;
                break;
                
            case "Mars":
                weightOnOther = weightOnEarth * 0.38;
                break;
                
            case "Jupiter":
                weightOnOther = weightOnEarth * 2.34;
                break;
            
            case "Saturn:":
                weightOnOther = weightOnEarth * 1.06;
                break;
                
            case "Uranus":
                weightOnOther = weightOnEarth * 0.92;
                break;
                
            case "Neptune":
                weightOnOther = weightOnEarth * 1.19;
                break;
                
            case "Pluto":
                weightOnOther = weightOnEarth * 0.06;
                // I don't care if Pluto is not a planet, it is still something that a person would put in because they think it is.
        
        }
        
        
        System.out.print("You weigh " + fmt.format(weightOnOther) + " pounds on " + planetChoice);
    
    
    }
}
