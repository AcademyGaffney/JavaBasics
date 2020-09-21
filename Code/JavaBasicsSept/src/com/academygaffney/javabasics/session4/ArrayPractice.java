package com.academygaffney.javabasics.session4;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("How many values will you enter? ");
		int values = Integer.valueOf(kb.nextLine());
		
		int [] valArray = new int[values];
		
		for(int i = 0; i < valArray.length; i++) {
			System.out.print("Value " + (i + 1) + ": ");
			valArray[i] = Integer.valueOf(kb.nextLine());
		}
		
		int maxValue = valArray[0];
		for(int val  : valArray) {
			if (val > maxValue)
				maxValue = val;
		}
		
		System.out.println("The largest value you entered was " + maxValue);

	}

}
