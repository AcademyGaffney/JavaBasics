package com.academy.javabasics.session5.geometry;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this(0,0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public void movePoint(int x, int y) {
		this.x += x;
		this.y += y;
	}
	public void moveX(int x) {
		this.x += x;
	}
	public void moveY(int y) {
		this.y += y;
	}
	public String toString() {return "(" + x + "," + y + ")";}
	public boolean equals(Point p) {return true;}
	public double getDegrees() {
		if (x < 0)
			return Math.toDegrees(Math.atan2(x, y)) + 360;
		else
			return Math.toDegrees(Math.atan2(x, y));
	}
	public double getDistance() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
}
