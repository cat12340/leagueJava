package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it -->");
		// Get the user to enter an adjective
		String a =JOptionPane.showInputDialog("Please enter an adjective or else.");
		// Get the user to enter a type of liquid
		String b =JOptionPane.showInputDialog("Please enter a liquid or else.");
		// Get the user to enter a body part
		String c =JOptionPane.showInputDialog("Please enter a body part or else.");
		// Get the user to enter a verb
		String d =JOptionPane.showInputDialog("Please enter a verb or else.");
		// Get the user to enter a place
		String e =JOptionPane.showInputDialog("Please enter a place or else.");
		// Fit the user's words into this sentence, and save it in a String:
		String f ="Piranhas are more "+a+" during the day, so cross the river at night. Piranhas are attracted to fresh "+b+" and will most likely take a \nbite out of your "+c+" if you "+d+". Whatever you do, if you have an open wound, try to find another way to get back \nto the "+e+". Good luck!";
		JOptionPane.showMessageDialog(null,f);
		// Make a pop-up for the final story. You can use \n to go to the next line
		
		
	}

	
	
		
	
}

