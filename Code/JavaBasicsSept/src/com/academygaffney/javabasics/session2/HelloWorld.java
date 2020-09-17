package com.academygaffney.javabasics.session2;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		double a = 3.14;
		double b = 4;
		double c = 7.14;
		
		System.out.println(c == a+b);
		System.out.println((byte)128);
		System.out.println((byte)1152);
		System.out.println((int)43.9);
		System.out.println((int)1.352e200);
		System.out.println((char)43);
		System.out.println((char)65579);
		
		String h = "Hello World";
		System.out.println(h.charAt(8));
		System.out.println(h.compareToIgnoreCase("hail"));
		
		String a1 = String.valueOf(1);
		String a2 = "" + 1;
	}

}
