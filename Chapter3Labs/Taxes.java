
/**
 * Write a description of class Taxes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Thanks to my dad for teaching me about taxes
 * Though I will probably forget
 * 
 */

import java.util.Scanner;

public class Taxes
{
    public static void main(String args[]){
    double income;
    double tax = 0;
    double previousTaxed = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your annual income");
    income = input.nextDouble();
    
    if (income <= 50000){
        tax = income * 0.01;        
    }else if (income > 50000 && income <=75000){
        tax = (income - 50000) * 0.02 + (50000 * 0.01);
        // calculates tax. Subtracts from previous limit to get remaining number. Tax that range and add it to the (remaining number * rate of the current range).  
        
    }else if (income > 75000 && income <=100000){
        tax = (income - 75000) * 0.03 + (50000 * 0.01) + (75000 - 50000)*0.02;
        //                               this taxes first range   this taxes second range. Those ranges are within the income
        
    }else if (income > 100000 && income <=250000){
        tax = (income - 100000) * 0.04 + (50000 * 0.01) + (75000 - 50000)*0.02 + (100000 - 75000) * 0.03;
    }else if (income > 250000 && income <=500000){
        tax = (income - 250000) * 0.05 + (50000 * 0.01) + (75000 - 50000)*0.02 + (100000 - 75000) * 0.03 + (250000 - 100000) * 0.04;
    }else if (income > 500000){
        tax = (income - 500000) * 0.06 + (50000 * 0.01) + (75000 - 50000)*0.02 + (100000 - 75000) * 0.03 + (250000 - 100000) * 0.04 + (500000 - 250000) * 0.05;
    }
    
    System.out.printf("You have to pay $%.2f", tax);
    
    
    
    }
}
