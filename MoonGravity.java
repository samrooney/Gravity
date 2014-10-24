/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the moon.  The distance is read as input
* from the user.
*
* @author <your name>
* @version <date of completion>
*/


import java.util.Scanner;

public class MoonGravity {
   public static void main (String [] args){
      Scanner scnr = new Scanner(System.in);
      double Grav = 1.11e-11;
      double Moon = 7.3477e22;
      double accelGrav = 0.0;
      double distFromCenter   = 0.0;
      
      System.out.println("What is your distance from the center of the moon?");
      distFromCenter = scnr.nextDouble();
      
      accelGrav = (Grav*Moon)/(distFromCenter*distFromCenter);
      System.out.print("accelGravity: ");
      System.out.println(accelGrav);
   }
}
 