package com.ae2;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		System.out.println("TEST3 START");
		//쇼핑몰의 총 주문금액 입력
		//주문금액이 30000원 이하면 배송비 3000 추가 30000 이상이면 배송비 무료
		
		//총 주문 금액 출력 ex) 주문금액: 25000 -> 28000 출력
		//ex) 주문금액이 35000 -> 35000 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문금액을 입력하세요: ");
		//총 주문금액
		int total = sc.nextInt();
		
		if(total <= 30000) {
			//배송비 3000 추가하는 코드
			total = total+3000;
			//System.out.println(total  + 3000);
		}
			System.out.println("총 금액 : " + total);
		
		
		
		System.out.println("TEST3 FINISH");
	}

}
