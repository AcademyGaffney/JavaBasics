package com.academy.javabasics.session5.geometry;

public class Segment {
	private Point a;
	private Point b; 	
	
	public Segment(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
}
