// Prints a given number using a hundreds, tens, and units notation.

import java.util.Scanner;

public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		System.out.println(num/100 + " hundreds, " + num%100/10 + " tens, and " + num%10 + " ones.");
	}
}
