package com.javaex.ex03;

public class Point{

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반

	@Override
	public boolean equals(Point obj) {
		Point p = (Point)obj;
		//a.x == b.x && this.y == b.y
		if(this.x ==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}
		
	} 
	
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
}