package com.ae2;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("TEST4");
		//10대 유무 판별
		//나이가 10보다 크고, 20 미만
		//나이를 입력
		//10대면 청소년 출력하고 종료
		//아니면 그냥 종료
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
/*		if(age<20) {
			if(age>=10) {
				System.out.println("청소년");
			}
			
		}
*/		
		if(age>=10 && age<20) {
			System.out.println("청소년");
		}
		
		System.out.println("TEST4 FINISH");
	}

}
