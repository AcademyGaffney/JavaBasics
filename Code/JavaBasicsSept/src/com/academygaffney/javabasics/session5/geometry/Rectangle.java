package com.academygaffney.javabasics.session5.geometry;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = width = 1;
	}
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	

}
