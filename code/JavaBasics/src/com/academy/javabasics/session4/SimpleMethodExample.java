package com.academy.javabasics.session4;

public class SimpleMethodExample {
	public static void main(String [] args) {
		int num = 1;        
		while (num <= 10) {
			int doubled = doubler(num);
			System.out.println(num + " x 2 = " + doubled);
			num = num + 1;        
		}

	}
	
	public static int doubler(int in) {
		int doubled = in * 2;
		return doubled;
	}
}
