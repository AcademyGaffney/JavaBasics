package com.academy.javabasics.session3;

public class APIStuff {
	public static void main(String[] args) {
		System.out.println((long)(Math.pow(2, 63) - 1));
		String s = "Now is the time for all good dogs to jump over the lazy fox.";
		
		System.out.println(s.charAt(8)); 
		System.out.println(s.substring(8,14)); 
		System.out.println(s.contains("al")); 
		System.out.println(s.indexOf('i')); 
		System.out.println(s.indexOf('i', 5)); 
		
		String s1 = 11 + "";
		
		int r = Integer.valueOf(s1) + 7;
	}
}
