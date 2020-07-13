package com.academy.javabasics.session3;

public class LoopAnswers {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("sum = " + sum);
		
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			if (sum % 2 == 0)
				sum += i;
		}
		System.out.println("sum = " + sum);
		
		sum = 0;
		for(int i = 1; i <= 10; i +=2) {
			if (i % 2 == 1) {
				i++;
			}
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		int i = 1;
		sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
		
		i = 1;
		sum = 0;
		while (i <= 10) {
			if (i % 2 == 0)
				sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
		

	}

}
