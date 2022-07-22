package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int x = new Random().nextInt(4);
	// 3. Print out this variable
	System.out.println(x);
	// 4. Get the user to enter something that they think is awesome
	String wasd = JOptionPane.showInputDialog("What do you think is awesome???????????????????????????????????????????????????????????????????????????????????");
	// 5. If the random number is 0
    if(x ==(0)) {
	
    JOptionPane.showMessageDialog(null, "That is awesome!");
    }
	// 6. If the random number is 1
    if(x ==(1)) {
    	
        JOptionPane.showMessageDialog(null, "That is OK.");
        }
	// -- tell the user whatever they entered is OK.

	// 7. If the random number is 2
    if(x ==(2)) {
    	
        JOptionPane.showMessageDialog(null, "That is boring.");
        }
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
    if(x ==(3)) {
    	
        JOptionPane.showMessageDialog(null, "I do not know what that is.");
        }
	// -- write your own answer
	}
}


