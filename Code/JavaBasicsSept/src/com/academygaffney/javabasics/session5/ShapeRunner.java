package com.academy.javabasics.session5.geometry;

public class ShapeRunner {
	public static void main(String [] args) {
		
		Square s = new Square(5);
		
		s.setWidth(3);
		System.out.println(s.getSide());
		System.out.println(s.getWidth());
		System.out.println(s.getLength());
		
		Rectangle r = new Rectangle(3, 6);
		
		Rectangle [] rArr = new Rectangle[5];
		
		rArr[0] = new Rectangle(4, 5);
		rArr[1] = new Rectangle(1, 4);
		rArr[2] = new Square(4);
		rArr[3] = new Square(2);
		rArr[4] = new Rectangle(8, 2);
		
		for(Rectangle rec : rArr) {
			System.out.println(rec.getWidth());
		}
		System.out.println();
		for(Rectangle rec : rArr) {
			rec.setLength(rec.getLength() +2);
		}
		System.out.println();
		for(Rectangle rec : rArr) {
			System.out.println(rec.getWidth());
		}
		
		for(Rectangle rec : rArr) {
			if (rec instanceof Square) {
				((Square) rec).setSide(9);
			}
		}
		
		for(Rectangle rec : rArr) {
			System.out.println(rec.getWidth());
		}
	}
}
