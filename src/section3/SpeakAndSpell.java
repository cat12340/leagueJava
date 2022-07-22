package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {
	
	/***********  SOUND ***************
	 * This recipe requires a computer that can play sounds. 
	 * If you cannot play sound on this computer, skip this recipe.
	 * If you are not sure, ask your teacher 
	 * *****************/

	
	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell: Pneumonoultramicroscopicsilicovolcanoconiosis");
		// 2. Catch the user's answer in a String
		String a =JOptionPane.showInputDialog("How do you spell that word?");
		// 3. If the user spelled the word correctly, speak "correct"
		if(a .equals ("Pneumonoultramicroscopicsilicovolcanoconiosis")) {
		 speak("correct. you are the best speller on Mars.");
	
			
		}
		else {
			speak("You are wrong. You have been hacked.");
		}
		
		// 4. Otherwise say "wrong"
		speak("What is Aleph Null?");
		String wasd = JOptionPane.showInputDialog("What is Aleph Null");

		// 5. repeat the process for other words
		if(wasd .equals("The smallest infinity")) {
		speak("That is correct.");}
		else {
		speak("Incorrect. Go search Google for answer.");
		}
		
		//asdfghdxsdfghjfdsdfghjhgfdsdfghjhgfdfghj	
		if(wasd .equals("infinity")) {
			
			speak("That is correct.");
		}
		else {
			speak("Incorrect. Go search Google for answer.");
		}
	}

	static void speak(String words) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


