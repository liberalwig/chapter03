//2021.12.3(금)11:47수업,

package com.javaex.ex05;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		//concat() : 붙여줌 
		a = a.concat(b);
		System.out.println(a);
		
		//trim(): 앞뒤 공백을 없애줌(중간공백은 유의미할 수 있으니 관여 안 함)
		a = a.trim();
		System.out.println("--" + a + "--");
		
		//replace(): 특정 부분을 입력값으로 대체함
		a = a.replace("ab", "최승은");
		System.out.println(a);
		
		//split(): 제시하는 특이점을 기준으로 나눠줌
		String[] sArray = a.split(",");
		for(int i =0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
				
	}

}

