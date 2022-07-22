package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attack =JOptionPane.showInputDialog("Do you want to attack with a yell or kick?");
		// 9. If they typed in "yell":
		if(attack .equals("yell")) {
			int z = new Random().nextInt(11);
			dragonDamage = z;
			dragonHealth -= z;
		} 
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if(attack .equals("kick")) {
			int y = new Random().nextInt(26);
			dragonDamage = y;
			dragonHealth -= y;
			//-- Find a random number between 0 and 25 and store it in dragonDamage
		}
			//-- Subtract that number from the dragon's health variable
		
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
			
				int w = new Random().nextInt(17);
			
				playerDamage = w;
				playerHealth -= w;
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
				if(playerHealth <= 0) {
					JOptionPane.showMessageDialog(null, "you lost");
			//-- Tell the user that they lost
				}
		
		// 14. Else if the dragon's health is less than or equal to 0
						
				else if(dragonHealth <= 0) {
							JOptionPane.showMessageDialog(null, "You win! The dragon died! Now you are rich.");
			//-- Tell the user that the dragon is dead and they took a ton of gold!
						}
	   //  15.  Else
				else {
					JOptionPane.showMessageDialog(null,"Dragon Health is: "+ dragonHealth + "\nPlayer Health is: " + playerHealth 
					+"\n You dealt " + dragonDamage	+ " damage to the dragon"
					+"\n The dragon dealt " + playerDamage + " damage to you."							
							);
				}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
				if(attack .equals("kill")) {
					dragonDamage = 999999999;
					dragonHealth -= 999999999;
					JOptionPane.showMessageDialog(null,"You win! The dragon died! Now you are rich.");
		}
	}


	

	
}
}