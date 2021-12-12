//2021.12.2(목)오후 대면수업 멍해서 들어도 이해 안 했고 2021.12.12(일)15:40에 영상 복습(사실상 최초)

package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 9);

		Point p04 = p02; // p02와 p04는 같은 주소를 갖고 있는 상황

		// 부모 Object의 getClass() 상속받아 쓰는 중
		System.out.println("getClass()");
		System.out.println(p00.getClass());// Point의 부모인 Objecct에서 getClass()쓰는 것임
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("====================");// 위 세 행은 p00,p01,p02가 어느 클래스에 속했는질 보여주는 과정

		// 부모 Object의 hashCode() 상속받아 쓰는 중
		System.out.println("#hashCode()");// 자식한테 없는 건데 부모Object에 있으니 쓸 수 있는 거야
		System.out.println(p01.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("====================");

		// 재정의: 부모 Object의 toString() 쓰는 게 아니라 자식클래스에 있는 이클립스가 만들어준 toString()올려준 걸 씀
		System.out.println("#toString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("====================");

		//
		System.out.println("#equals()");
		System.out.println(p00.equals(p02));
		System.out.println(p00.equals(p01));// 주소는 다르더라도 속 내용이 같으니 true가 나오고 싶기에 주소를 바꿔볼 계획이라 Ex03으로
		System.out.println(p00 == p01); // (주소가)같니? =>True.
		System.out.println(p02 == p04);
		System.out.println("====================");

	}
}

/*
 * 기본자료형8개를 제외한 모든 타입은 주소를 달고 있는데 ==은 기본자료형이든 아니든 스택에 들어있는 자료 내용(기본자료형 아니라면
 * 주소겠지)이 같은지를 비교하는 것이다. 따라가지 말고 스택 영역만 비교.
 * 
 */