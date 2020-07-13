package com.academy.javabasics.session4;
import java.util.Scanner;

public class GuessingGameExample {
	
	public static void main(String [] args) {
		Scanner kb = new Scanner(System.in);
		int target = (int)(Math.random() *100 +1);
		int guess = 0;
		do {
			System.out.print("Enter a guess 1-100: ");
			guess = Integer.valueOf(kb.nextLine());
			if (guess > target) System.out.println("Too High");
			if (guess < target) System.out.println("Too Low");
		}while(guess != target);
		System.out.println("You got it!");
	}
}
