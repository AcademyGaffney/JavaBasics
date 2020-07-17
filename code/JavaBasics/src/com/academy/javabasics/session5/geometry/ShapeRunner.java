package com.academy.javabasics.session5.geometry;

public class ShapeRunner {
	public static void main(String [] args) {
		
		Square s = new Square(5);
		
		Rectangle r = new Rectangle(3, 6);
		
		Rectangle [] rArr = new Rectangle[5];
		
		rArr[0] = new Rectangle(4, 5);
		rArr[1] = new Rectangle(1, 4);
		rArr[2] = new Square(4);
		rArr[3] = new Square(2);
		rArr[4] = new Rectangle(8, 2);
	}
}
