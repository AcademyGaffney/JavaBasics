package com.academy.javabasics.session4;

public class MethodPractice {

	public static void main(String[] args) {
		//create a Scanner object here
		double input = 0;
		do {
			System.out.print("Enter a number (negative to end): ");
			input = //get the input from Scanner
			if (input >= 0) {
				double negRoot = negativeSqrt(input);
				System.out.println("The negative square root of " 
					+ input + " is " + negRoot + ".");
			}
		}while (input >= 0);
	}
	
	//create the negativeSqrt method here
	//accept a double parameter and return a double
	//that's just the negation of the normal Math.sqrt method.
}
