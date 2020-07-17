package com.academy.javabasics.session5.geometry;

public class Square extends Rectangle{

	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		setLength(side);
		setWidth(side);
	}
	
}
