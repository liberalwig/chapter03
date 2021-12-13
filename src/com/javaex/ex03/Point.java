/*2021.12.2(목)오후 대면수업
멍해서 들어도 이해 안 했고
2021.12.12(일)17:21, 2021.12.13(월)10:04에 영상 복습(사실상 최초)*/

package com.javaex.ex03;

public class Point {

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
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override // x끼리 같고 y끼리 같고 둘은 동시에 충족해야 함
	public boolean equals(Object obj) {// object로 섞어썼기 때문에 obj.x하면 자식 가려져셔 모르니 obj를 강제캐스팅
		

		/*이건 새로 Point 속 p라고 써준 경우이고 밑은
		Point p = (Point) obj;
		if (this.x == p.x && this.y == p.y) {
		 */
		
		if (this.x == (Point)obj).x && this.y == ((Point)obj).y) {
			return true;

		} else {
			return false;
		}
	}

}

//자식클래스로 Point가 올 줄 몰랐기에 Object로 씀