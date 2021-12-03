//2021.12.3(금)13:40수업,04.Wrapper Class

package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(s);
		System.out.println(b);

		int num01 = 10;
		int num02 = 7;
		int intResult = num01 + num02;
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Interger(7;)
		Integer result = i01 + i02; //주소+주소의 꼴이므로 앞 자료형을 고민하게 된다
		System.out.println(result);
		
		Integer i03 = 99; 		//99라는 건 new Integer(99)를 의미함
		Integer i04 = new Integer(100);
		int num99 = i04;
		
		System.out.println("===================================");
		
		//문자열을=>int로
		/*
		Integer i05 = 10;
		int r01 = i05.parseInt("12345");
		System.out.println(r01);
		*/
		
		int r01  Integer.parseInt("12345");
		System.out.println(r01);
		
		System.out.println("====================================");
		
		/*
		//int열을=>문자열로
		String a = "안녕하세요";
		String snum = a.valueOf(555);
		System.out.println(snum);
		*/
		
		String snum = String.valueOf(555);
		System.out.println(snum);
		
		System.out.println("안녕" + 1234);
	}

}
