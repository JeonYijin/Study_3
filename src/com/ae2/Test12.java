package com.ae2;

public class Test12 {

	public static void main(String[] args) {
		System.out.println("TEST12");
		
		int num =15;
		switch(num) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 4");
			break;
		default:
			System.out.println("그외 나머지");
			break; //맨 아래는 break를 쓰지 않아도 ㄱㅊ
			//default를 중간에 넣어도 가능 정수식과 일치하는 case를 찾기 때문
		
		}
		
		System.out.println("TEST12 FINISH");
	}

}
