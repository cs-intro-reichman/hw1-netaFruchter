// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.Scanner;

public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random()*lim);
		int num2 = (int)(Math.random()*lim);
		int num3 = (int)(Math.random()*lim);

		System.out.println(num1 + " " + num2 + " " + num3);

		int max_num = Math.max(num1, Math.max(num2,num3));
		int min_num = Math.min(num1, Math.min(num2,num3));
		int middle_num = num1 + num2 + num3 - min_num - max_num;

		System.out.println(min_num + " " + middle_num + " " + max_num);
	}
}
