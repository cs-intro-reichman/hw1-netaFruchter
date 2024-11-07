// Computes the future value of a saving investment.

import java.util.Scanner;

public class FVCalc {
	public static void main(String[] args) {
		int currentvalue =  Integer.parseInt(args[0]);
		double rate =  Double.parseDouble(args[1]);
		int years =  Integer.parseInt(args[2]);

		int futureValue = (int)(currentvalue * Math.pow(1 + rate/100, years));
		
		System.out.println("After " + years + " years, $" + currentvalue + " saved at " + rate + "% will yield $" + futureValue);
	}
}