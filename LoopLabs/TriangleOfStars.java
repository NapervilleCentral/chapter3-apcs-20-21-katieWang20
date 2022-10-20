
/**
 * Write a description of class TriangleOfStars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TriangleOfStars
{
    public static void main(String[] args){
    
        String star = "*";
    
        int numOfStars = 10;
    /*
        for (int x = 1; x <=10; x++){
            
            System.out.println(star);
            star = star + "*";
    
    
        }
        */
        for (int x = 1; x <=10; x++){
            for (int y = 1; y <=x; y++){
                System.out.print(star);
            
            } 
            System.out.println();
        }
        System.out.println("");
        for (int x = 1; x <=10; x++){
            for (int y = 10; y>=x; y--){
                System.out.print(star);
                
            }
            System.out.println("");
        
        }
        System.out.println();
        
        for (int x = 1; x <=10; x++){
            
            System.out.printf("%" + x + "s","");
            for (int y = 10; y>=x; y--){
                System.out.print(star);
                
            }
            
            System.out.println("");
        
        }
        System.out.println();
        
        for (int x = 1; x <=5; x ++){
            // for adding spaces to center the triangles to make adiamond shpe
            for (int y = x; y < 5; y ++ ){
                System.out.print(" ");
            
            }
            
            for (int z = 1; z < x * 2; z++){
                System.out.print(star);
                
            
            }
            System.out.println();
        }
        
        for (int x = 5; x >= 1; x --){
            
            for (int y = x; y < 5; y++){
                System.out.print(" ");
            }
            
            for (int z = 1; z < x * 2; z++){
                System.out.print(star);
            }
            System.out.println();    
            
        }
        
        
    
    }
}
