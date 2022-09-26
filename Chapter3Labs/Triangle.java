
/**
 * Katie Wang
 * 9/24/22
 * 
 * Triangle class
 * This program lets the user choose if they want to use side lengths or angles to figure out what the triangle is
 * The triangle is either determined as right, isosceles, or equilateral
 */
import java.util.Scanner;

public class Triangle
{
  public static void main(String args[]){
      
      Scanner input = new Scanner(System.in);
      
      int sideA;
      int sideB;
      int sideC;
      
      int angleA;
      int angleB;
      int angleC;
      
      int choice;
      
      double rightTriangleHyp = 0;
      
      System.out.print("Do you want to use 1. side lengths or 2. angles?" );
      choice = input.nextInt();
      input.nextLine();
      
      System.out.println();
      
      if (choice == 1){
          System.out.print("Enter the first side length: ");
          sideA = input.nextInt();
          
          System.out.print("Enter the second side length: ");
          sideB = input.nextInt();
          
          System.out.print("Enter the third side length: ");
          sideC = input.nextInt();
          
          System.out.println();
          
          //compares the side lengths, then square the lengths of the smaller sides and and add them (the longest side is the hypotenuse)
          //then square root the equation to get the hypotenuse which may or may not have a decimal values
          if (sideA < sideC && sideB < sideC){
              rightTriangleHyp = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
          }else if (sideA < sideB && sideC < sideB){
              rightTriangleHyp = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2));
              
          }else if (sideB < sideA && sideC < sideA){
              rightTriangleHyp = Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2));
            
          }
          
            
          int intHyp = (int) rightTriangleHyp;
          //converts rightTriangleTest to integer to use to compare. 
          
          
          
          if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA){ // Two sides added together HAVE to be greater than or equal to the other side. 
              System.out.println("Error, this triangle is not possible. ");  
          
          }else if (sideA == sideB & sideA == sideC){
              System.out.println("The triangle is equalateral");
        
          
    
          }else if (sideA == sideB && sideA !=sideC || sideA == sideC && sideA != sideB || sideB == sideC && sideB !=sideA) {
              System.out.println("The triangle is iscosoliese");
              // can't spell
          }else if (intHyp == rightTriangleHyp){
              // if the square root of the two sides squared has decimals (that are not 0), then rightTriangleHyp would keep it while intHyp would still be a whole intiger number
              //so it would not be a right triangle.
              //But if rightTriangleHyp is a whole number (decimal values are 0), then both would equal the same value, and then it would be a right triangle. 
            
              System.out.println("The triangle is right!");
             
          }else{
            
              System.out.println("Your triangle is boring.");
            
          }
              
          
          
      }else if (choice == 2){
          System.out.print("Enter the first angle: ");
          angleA = input.nextInt();
          
          System.out.print("Enter the second angle: ");
          angleB = input.nextInt();
          
          System.out.print("Enter the third angle:");
          angleC = input.nextInt();
          
          System.out.println();
          
          // if the three angles do not add up to 180, then it can not be a triangle. if one of the sides is 0 degrees, it can not be a triangle. 
          // it is not possiblew for a triangle to have 0 degreess.
          if (angleA + angleB + angleC != 180 || angleA == 0 || angleB == 0 || angleC == 0){
              System.out.println("The total angles do not equal 180. This triangle is not possible.");
          
          }else if (angleA == 90 || angleB == 90 || angleC == 90){ // if any of the angles are 90 degrees, then it is automatically a right triangle 
            System.out.println("This triangle is right!");
            
          }else if (angleA == angleB && angleA == angleC){ // if the first angle equals the second and the third angle, then the triangle is equilateral
              System.out.println("The triangle is equilateral");
              
          }else if (angleA == angleB && angleA !=angleC || angleA == angleC && angleA != angleB || angleB == angleC && angleB != angleA){ 
              //if one angle equals another angle but not the last angle, then the triangle is iscosoles.
              System.out.println("The triangle is iscosoles");
              
          }else{
              //if the triangle meets neither of those criteria
              System.out.println("Your triangle is boring.");
          }
          
          
      }else{
        System.out.println("Not a valid choice");
        
      }
      
      
    
    
    
    
    
    
    }
}
