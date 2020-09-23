package com.academy.javabasics.session5.geometry;

public class Square extends Rectangle{

	public Square() {
		super(1, 1);
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
}
