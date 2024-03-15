package org.howard.edu.lsp.midterm.question1;

/**
 * 
 * @author Abhishek Khanal
 *
 */
public class SecurityOps {
	/**
	 * {@summary a function to encrypt the input string}
	 * @param name string that takes in the input text
	 */
	public static String encrypt(String text) {
        String filteredtext = text.replaceAll("[^a-zA-Z0-9]", "");

        
        StringBuilder encryptedText = new StringBuilder();

        // Append even-indexed characters
        for (int i = 0; i < filteredtext.length(); i += 2) {
        	encryptedText.append(filteredtext.charAt(i));
        }
        

        // Append odd-indexed characters
        for (int i = 1; i < filteredtext.length(); i += 2) {
        	encryptedText.append(filteredtext.charAt(i));
        }

        return encryptedText.toString();
	}
}
