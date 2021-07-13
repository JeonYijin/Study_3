package com.ae2;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("Test13");
		
		//요금 조회 1번, 상품 가입은 2, 고장 신고 3번, 상담원 연결 0번
		//잘못 누름 다시 선택
		Scanner sc = new Scanner(System.in);
		System.out.println("요금조회는 1번");
		System.out.println("상품가입은 2번");
		System.out.println("고장신고는 3번");
		System.out.println("상담원 연결은 0번");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("요금조회");
			break;
		case 2:
			System.out.println("상품가입");
			break;
		case 3:
			System.out.println("고장신고");
			break;
		case 0:
			System.out.println("상담원연결");
			break;
		default:
			System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
		}
		
		System.out.println(num);
		
		
		
		
		
		
		System.out.println("\nTest13 finish");
		
	}

}
