/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the earth.  The distance is read as input
* from the user.
*
* @author <Sam Rooney>
* @version <date of completion>
*/

import java.util.Scanner;

public class EarthGravity {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double Gravv = 6.673e-11;
      double Mass = 5.98e24;
      double GRAVACC = 0.0;
      double distCenter   = 0.0;
      
      System.out.println("What is your distance from the center of the earth?");
      distCenter = scnr.nextDouble();
      
      GRAVACC = (Gravv*Mass)/(distCenter*distCenter);
      System.out.print("The gravity is: ");
      System.out.println(GRAVACC);
   }
}
  
  

