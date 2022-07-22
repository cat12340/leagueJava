package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, maybe draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {
	public static void main(String[] args) {
		
		//  Create a new Robot
		Robot x = new Robot();
		//  Put the robot's pen down
		x.penDown();
		//  SPEED. Make the robot go at maximum speed (100)
		x.setSpeed(100);
		//  COLOR. Set the pen to a color that you like for the shape
		x.setPenColor(00,001,254);
		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape will have.
		//  				(Hint: its called PentagonCrazy)
		int sidesNum = 5;
		//  TURN ANGLE. Make another int variable for the angle the robot must turn. 
		//  			Hint: Divide 360 by the number of sides the shape has to get the angle.
		int turnAngle = 72;
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.
		int count = 0;
		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
		while (count < 999999999) {
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
		x.move(count);
				//  TURN.  Turn the robot the amount in your angle variable + 1
		x.turn(turnAngle + 1);
				//  INCREASE COUNT. Increase the loop count by 1
		count += 1;
		//  End the while loop here
		}
		//  Now hide the robot so you can see the pattern it has drawn.
		x.hide();
		//  Run the program. 
		//  Check the pattern against the picture in the recipe. If it matches, you are done!
	

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	}
}
