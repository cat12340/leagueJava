package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// Create a new Robot
	Robot a = new Robot();
	Robot b = new Robot();
	Robot c = new Robot();
	Robot d = new Robot();
	void go() {

		// Make the robot move quickly (setSpeed)
		a.setSpeed(80);
		b.setSpeed(70);
		c.setSpeed(60);
		d.setSpeed(50);
		// Set the robot's pen width to 5  
		a.setPenWidth(5);
		b.setPenWidth(5);
		c.setPenWidth(5);
		d.setPenWidth(5);
		// Put the robot's pen down
		a.penDown();
		b.penDown();
		c.penDown();
		d.penDown();
		// This numberOfSquares variable will track how many squares the robot has drawn
		// It's set to zero here, because the robot hasn't drawn any squares yet.
		int squaresDrawn = 0;

		// LOOP: Start a while loop to repeat the following code until 4 squares have been drawn:
		while(squaresDrawn < 4) {


			// PEN COLOR.     Set the pen color to random       setRandomPenColor()
			a.setRandomPenColor();
			b.setRandomPenColor();
			c.setRandomPenColor();
			d.setRandomPenColor();
			// DRAW A SQUARE. Call the drawSquare() method.  Have you put some code in it?
			drawSquare();
			// TURN.          Turn the robot 90 degrees to the right
			a.turn(90);
			b.turn(90);
			c.turn(90);
			d.turn(90);
			// INCREASE COUNT. Add one to the number of squares drawn
			squaresDrawn += 1;
			// End the loop here
		}
		a.hide();
		b.hide();
		c.hide();
		d.hide();
	}

	void drawSquare() {
		System.out.println("Yay! you called the drawSquare() method!");

		/*  Put code here to draw one square - don't forget to use a loop! */
		for(int i = 0;i < 4;i++);
		a.move(90);

		b.move(80);

		c.move(70);

		d.move(60);


	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
