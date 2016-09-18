package bools;
/**
 * 
 * @seanm project started on 9/7/16. Finished 9/8/16 
 * 
 */
import java.util.Scanner; import javax.swing.JOptionPane; //imports
		//--------------------------BEGIN PROGRAM--------------------------------------------------------//
public class justForFun 
	{public static void main(String args[]){
		int number;
		double velocity;
		double Distance;
		double Time;
		//--------------------------Start Decision Making-----------------------------------------------//
		Scanner ekeys = new Scanner(System.in);
		System.out.print("What are you trying to calculate?\npress:\n3 "
				+ "for Velocity(m/s):\n2 for Distance(m):\n1 for Time(sec):\n");
		number = ekeys.nextInt();
		//--------------------------Begin SWITCH--------------------------------------------------------//
		switch(number){
		//--------------------------Solving For TIME----------------------------------------------------//
		case 1: 
																				//makes a new scanner for(users input) called 'ekey' to hold Users VELOCITY input.
			Scanner ekey = new Scanner(System.in);
			System.out.print("\n\nPlease enter a velcoity in m/s:\n");
			velocity = ekey.nextDouble();
																				//end of 'ekey' for scanner, change scanner variable to 'ekeyp' to hold Users DISTANCE Input.
	
			Scanner ekeyp = new Scanner(System.in);
			System.out.print("Please enter the distance in Meters:\n");
			Distance = ekeyp.nextDouble();
																				//end of 'ekeyp' scanner. next solving for TIME.
			//calculates for time, and prints the time in seconds.
			Time = Distance/velocity;
			System.out.print("Time equals: " + Time + " Seconds");
		break;
		//--------------------------Solving For DISTANCE------------------------------------------------//
		case 2: //distance:
																				//makes a new scanner for(users input) called 'key' to hold Users VELOCITY input
			Scanner key = new Scanner(System.in);
			System.out.print("\n\nPlease enter the velocity in m/s:\n");
			velocity = key.nextDouble();
			
																				//end of 'key' for scanner, change scanner variable to 'keyp' to hold Users TIME Input.
			System.out.print("Please enter the time in Seconds:\n");
			Scanner keyp = new Scanner(System.in);
			Time = keyp.nextDouble();
			
																				//end of 'keyp' scanner. next solving for DISTANCE.
			Distance = velocity*Time;
			System.out.print("Distance euqals: "+ Distance + " meters");
		break;
		//--------------------------Solving For VELOCITY-------------------------------------------------//
		case 3: //Velocity:
																				//makes a new scanner for(users input) called 'ke' to hold Users TIME input
			Scanner ke = new Scanner(System.in);
			System.out.print("\n\nPlease enter the time in Seconds:\n");
			Time = ke.nextDouble();
			
																				//end of 'ke' for scanner, change scanner variable to 'k' to hold Users DISTANCE Input.
			Scanner k = new Scanner(System.in);
			System.out.print("Please enter the distance in Meters:\n");
			Distance = k.nextDouble();
			
																				//end of 'k' scanner. next solving for Velocity.
			velocity = Distance/Time;
			System.out.print("Velocity equals: "+ velocity+" m/s");
		break;
		//--------------------------IF-CASE 1,2, or 3 is not given---------------------------------------//
		default:
			JOptionPane.showMessageDialog(null, "\n\nPlease enter something, I, a Computer,"
						+ " can actually understand - Restart the program. -.");	
		//--------------------------END PROGRAM----------------------------------------------------------//
			
		
		
			}
		}
	}