//2021.12.3(금)11:47수업,

package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		St
		ring b = ",efg ";
		
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		//concat() : 붙여줌 
		a = a.concat(b);
		System.out.println(a);
		
		//trim(): 앞뒤 공백을 없애줌(중간공백은 유의미할 수 있으니 관여 안 함)
		a = a.trim();
		System.out.println("--" + a + "--");
		
		//replace(): 특정 부분을 입력값으로 대체함. 예를 들어 유저가 전화번호 중간에 -를 입력한 걸 정리하고 싶을 때 ("-","")로
		a = a.replace("ab", "최승은");
		System.out.println(a);
		
		//split(): 제시하는 특이점을 기준으로 나눠줌
		String[] sArray = a.split(",");
		for(int i =0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
				
		String str = "Heloo JAVA!";
				
		String r01 = str.substring(3);
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3,8);//바로 위와 상황을 비교하면 메소드오버로딩(파라미터 늘림)한 결과. 후자에 쓴 문자열 <전>까지 출력!
		System.out.println(r03);
	}

}

