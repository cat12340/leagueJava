package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String abracadabra=JOptionPane.showInputDialog("Do you know how to write code?" );
		// 2. If they say "yes", tell them they will rule the world.
		if(abracadabra .equals("yes")) {
			JOptionPane.showMessageDialog(null,"you will rule the world");
		}
		else {
			JOptionPane.showMessageDialog(null,"You have been hacked. Hahahahahahahahahahahahahahahahahahahahahahahahahahhahahahahahahahaaahaahahhahahahahahahahahahhahahahaha");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

