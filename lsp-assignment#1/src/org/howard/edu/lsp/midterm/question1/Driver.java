package org.howard.edu.lsp.midterm.question1;

/**
 * {@summary Driver class for the SecurityOps class}
 * @author Abhishek Khanal
 *
 */
public class Driver {
	/**
	 * {@summary main method to check the implementation of the SecurityOps class }
	 */
	public static void main(String[] args) {
		String example_string = "I love CSCI363";
		
		System.out.println("Unencrypted string is: ");
		System.out.println(example_string);
		System.out.println("Encrypted string is: ");
		System.out.println(SecurityOps.encrypt(example_string));
		
		
		System.out.println("_____________________________________");
		
		String example_string2 = "I live in Washington DC";
		System.out.println("Unencrypted string is: ");
		System.out.println(example_string2);
		System.out.println("Encrypted string is: ");
		System.out.println(SecurityOps.encrypt(example_string2));
		
		
		System.out.println("_____________________________________");

	}
}
