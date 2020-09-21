package com.academygaffney.javabasics.session4;

public class BasicArrays {
	public static double average(double [] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

	public static double average2(double [] arr) {
		double sum = 0;
		for(double element : arr) {
			sum += element;
		}
		return sum / arr.length;
	}
	
	public static void main(String [] args) {
		
	}

}
