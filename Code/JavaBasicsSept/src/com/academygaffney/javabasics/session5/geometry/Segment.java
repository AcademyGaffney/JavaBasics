package com.academygaffney.javabasics.session5.geometry;

public class Segment {
	private Point a;
	private Point b;
	
	
	
	public Segment() {
		this.a = new Point();
		this.b = new Point(1, 0);
	}
	public Segment(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	public Point getA() {
		return new Point(a);
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
	
	public String toString() {
		return a.toString() + "--" + b.toString();
	}
	
}
