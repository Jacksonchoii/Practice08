package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성하세요
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
