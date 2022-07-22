package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int playerScore = 0;
		// 2.  Ask the user a question 
		String a =JOptionPane.showInputDialog( "What goes up and down but can't move?");
		// 3.  Use an if statement to check if their answer is correct
		if (a .equalsIgnoreCase("stairs")||a.equalsIgnoreCase("staircase")||a.equalsIgnoreCase("staircases")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			playerScore += 2;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			playerScore -= 2;
		}
		
		// 4.  if the user's answer was correct, add one to their score 
		String b =JOptionPane.showInputDialog("what lives when it is fed, but dies if you give it a drink?");
		if (b.equalsIgnoreCase("Fire")||b.equalsIgnoreCase("Fires")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			playerScore += 3;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			playerScore -= 2;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String c =JOptionPane.showInputDialog("A rooster layed an egg on a barn roof. Did it roll off the roof?");
		if (c .equalsIgnoreCase("No")||c.equalsIgnoreCase("no")||c.equalsIgnoreCase("it didn't")||c.equalsIgnoreCase("It didn't")) {
			JOptionPane.showMessageDialog(null, "Correct. Roosters don't lay eggs.");
			playerScore += 3;
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			playerScore -= 1;
		}
		// 6.  After all the questions have been asked, print the user's score 
			String d =JOptionPane.showInputDialog("What starts with an e, ends with an e, but has only one letter?");
			if (d .equalsIgnoreCase("envelope")||d.equalsIgnoreCase("Envelope")||d.equalsIgnoreCase("An envelope")) {
				JOptionPane.showMessageDialog(null, "Correct.");
				playerScore += 2;
			}
			else {
				JOptionPane.showMessageDialog(null,"Wrong");
				playerScore -= 1;
			}
		//asdfghfdsdfghj
			String e =JOptionPane.showInputDialog("If a plane crashes on an island, where do they bury the survivors?");
			if (e .equalsIgnoreCase("They don't")||e.equalsIgnoreCase("They do not")||e.equalsIgnoreCase("they don't")) {
				JOptionPane.showMessageDialog(null, "Correct.");
				playerScore += 2;
			}
			else {
				JOptionPane.showMessageDialog(null,"Wrong");
				playerScore -= 1;
			}
		//gjbgyjbgjftyujbvf
		System.out.println("Your score is: " + playerScore + ".");
		JOptionPane.showMessageDialog(null, "Your score is: " + playerScore + ".");
	}
}
