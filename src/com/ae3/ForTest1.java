package com.ae3;

import java.util.Scanner;

public class ForTest1 {
	
	public static void main(String[] args) {
		System.out.println("ForTest1");
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("반복할 횟수를 입력 >");
//		
//		int count = sc.nextInt();
//		int num = 0;
//		for(int i=0; i<count; i =i+1) {
//			//System.out.println("Hello "+i);
//			System.out.println("Hello " +num); 
//			num = num+1;
//			
//		}
		
		// 0-20 미만 짝수만을 출력
//		
//		for(int i=0; i<20; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
//		
		System.out.println("==========================");
		
		// 0-20 미만 짝수만을 출력 단, if문 사용 하지 않고 출력
		for(int i =0; i<20; i = i+2) {
			System.out.println(i);
		}
		
		
		
		
		
		System.out.println("ForTest1 Finish");
		
	}

}
