package com.academy.javabasics.session4;

import java.util.Scanner;

public class SimpleScannerExample {
	
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = kb.nextLine();
		System.out.println("Hello, " + name + ".");
	}
}
