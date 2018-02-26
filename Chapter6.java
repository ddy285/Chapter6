package csc201;
import java.util.Scanner;
/*
 * (Count the letters in a string) Write a method that counts the number of letters in
 *  a string using the following header:
 *  public static int countLetters(String s)
 *  Write a test program that prompts the user to enter a string and displays the number
 *  of letters in the string.
 */
public class Chapter6 {

	public static int countLetters(String s) {
		int lettersNum = 0 ;
		
		for(int i =0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i)))
				lettersNum++;
		}
		return lettersNum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of letters: ");
		String letters = input.nextLine();
		
		System.out.println("Number of letter in the string is: " + countLetters(letters));
		
	}
	
}
