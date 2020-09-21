package com.academygaffney.javabasics.session4;

import java.util.Scanner;

public class MethodPractice {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double input = 0;
		do {
			System.out.print("Enter a number (negative to end): ");
			input = Double.valueOf(kb.nextLine());
			if (input >= 0) {
				double negRoot = negativeSqrt(input);
				System.out.println("The negative square root of "
					+ input + " is " + negRoot + ".");
			}
		}while (input >= 0);
	}
//create the negativeSqrt method here
	
	public static double negativeSqrt(double in) {
		return -(Math.sqrt(in));
	}
}


