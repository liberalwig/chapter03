//2021.12.3(금)10:46수업,

package com.javaex.ex06;

public class StringApp01 {
	public static void main(String[] args) {
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); //각 주소를 비교하는 과정=>결과: 올려진 메모리 위치가 다르므로 당연히 false
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("==================================");
		
		String str03 = "hello";
		String str04 = "hello";
		
		System.out.println(str03 == str04); //즉, 모든 글자를 위치 포함 하나하나 비교하는 것이 아니라 우선 hashcode부터 비교해서 같으면 같게 간주
		str03 = "hello!!!!!!!!";
		
		System.out.println(str03);
		System.out.println(str04);
		
		/*부모쪽에는 없고 String에만 있는 메소드를 알아보자
		concat()
		trim()
		replace()
		split()
		substring()
		*/
	}
}
