package com.ae3;

import java.util.Scanner;

public class ForTest8 {

	public static void main(String[] args) {
		System.out.println("ForTest8");
		
		Scanner sc = new Scanner(System.in);

		
		//분초 출력 0분0초 나오고 0분 1초 ~ 0분 59초되면 1분 카운트
		//분, 초 입력받기 입력한 분,초까지 찍고 종료
		System.out.println("분을 입력하세요: ");
		int min =sc.nextInt();
		System.out.println("초를 입력하세요: ");
		int secd = sc.nextInt();
		
		boolean flag = false;
		
		for(int bun =0; bun<60; bun++) {
			for(int sec=0; sec<60; sec++) {
				System.out.println(bun+"분"+sec+"초");
				if(sec == secd && bun == min) {
					//sec = 60; bun = 60; 
					flag =  true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		
		
		
		
		
		
		System.out.println("ForTest8 finish");
	}

}
