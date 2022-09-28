
/**
 * Write a description of class Taxes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Taxes
{
    public static void main(String args[]){
    double income;
    double tax = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your annual income");
    income = input.nextDouble();
    
    if (income <= 50000){
        tax = income * 0.01;        
    }else if (income > 50000 && income <=75000){
        tax = income * 0.02;
    }else if (income > 75000 && income <=100000){
        tax = income * 0.03;
    }else if (income > 100000 && income <=250000){
        tax = income * 0.04;
    }else if (income > 250000 && income <=500000){
        tax = income * 0.05;
    }else if (income > 500000){
        tax = income * 0.06;
    }
    
    System.out.printf("You have to pay $%.2f", tax);
    
    
    
    }
}
