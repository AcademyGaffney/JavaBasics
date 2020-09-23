package com.academygaffney.javabasics.session5;

import com.academygaffney.javabasics.session5.geometry.Point;
import com.academygaffney.javabasics.session5.geometry.Segment;

public class GeometryRunner {

	public static void main(String[] args) {
		Point p = new Point();
		
		System.out.println(p.toString());
		p.setPoint(3,  4);
		System.out.println(p);
		System.out.println(p.getDistance());
		p.moveX(-6);
		System.out.println(p);
		System.out.println(p.getDistance());
		
		Point p1 = null;
		
		System.out.println(p.equals(p1));
		
		Segment s = new Segment();
		System.out.println(s);
		
		s.getA().movePoint(5,  2);
		
		System.out.println(s);
	}

}
