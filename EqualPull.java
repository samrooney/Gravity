/**
* 
* Determines the distance at which the pulling force between two
* bodies is exactly equal.  
*
* Takes as input the mass of one body, the mass of the other, and
* the distance between the two bodies.
*
* @author <your name>
* @version <date of completion>
*/
import java.util.Scanner;

public class EqualPull {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      
         double Grav = 6.673e-11;
         
         double Moon = 5.98e24;
         
         double dist = 3.844e8;
         
         double mon = 7.3477e22;
         
         double Final = 0;
      
      Final = (Grav * Moon * mon)/(dist * dist);
      
      System.out.println("The distance form which there is equal gravitational force is ");
      System.out.println(Final + " meters from earth");
   
  }
  
}
  

