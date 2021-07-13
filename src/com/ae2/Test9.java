package com.ae2;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("TEST9");
		boolean check = true;
		
		check = !check;
		
		if(!check) {
			System.out.println("Test");
			
		}
		
		System.out.println(check);
		
		int age = 30;
		//조건식 ? true일 때 실행: flase일 때 실행
		String result = age > 20 ? "성년" : "미성년";
		System.out.println("result66: "+result);
		
		
		
		System.out.println("TEST9 finish");
	}

}
