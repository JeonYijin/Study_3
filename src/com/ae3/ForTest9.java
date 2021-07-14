package com.ae3;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9");
		
		Scanner sc = new Scanner(System.in);
		
		// 탄창 3개 한 탄창에 30발 단발모드: 1발 점사모드: 3발씩
		// 1번 단발 2번 점사 출력 하고 1 또는 2 입력받기
		// 1 - 탕 (출력) 한탄창은 단발모드로 쏨 30번
		// 2 - 타타탕 10번 
		for(int tan=0; tan<3; tan++) {
			System.out.println("1번 단발 2번 점사 선택 >>");
			int tang = sc.nextInt();
			String sound = "탕";
			//int count = 30;
			int num = 1;
			if(tang!=1) {
				sound = "타타탕";
				//count = 10;
				num = 3;
			}
			for(int i=0; i<30; i=i+num) {
				System.out.println(sound);
			}
			
			
			
			
//			if(tang == 1) {
//				for(int i = 0; i<30; i++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int j=0; j<10; j++) {
//					System.out.println("타타탕");
//				}
//					
//			}
		}
		
		
		
		System.out.println("ForTest9 finish");
	}

}
