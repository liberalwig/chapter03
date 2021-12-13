/*2021.12.2(목)오후 대면수업
멍해서 들어도 이해 안 했고 2021.12.12(일)17:21, 2021.12.13(월)10:04에 영상 복습(사실상 최초)
: Object의 toString*/

package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(100, 139);

		Point d = c;

		System.out.println(a == b);
		System.out.println(d == c);

		System.out.println("=======================");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));

	}

}