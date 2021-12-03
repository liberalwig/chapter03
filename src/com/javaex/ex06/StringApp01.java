//2021.12.3(금)10:46수업, 

package com.javaex.ex06;

public class StringApp01 {
	public static void main(String[] args) {
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); //각 주소를 비교하는 과정=>결과: 올려진 메모리 위치가 다르므로 당연히 false
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		
		
		
	}
}
