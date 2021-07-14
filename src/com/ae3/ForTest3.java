package com.ae3;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		System.out.println("ForTest3");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요: ");
		int time = sc.nextInt();
		
		//종료 시간 입력받기
		//ex) 12초 0초, 1초...12초 종료 단, 60이라는 상수는 변경 불가능
		
		for(int sec = 0; sec <60; sec++) {
			if(sec>time) {
				break;
			}else {
			System.out.println(sec + "초");
			}
		}
/*
 * 		for(int sec = 0; sec < 60; sec++){
 * 			System.out.println(sec + "초");
 * 			if(sec == time){
 * 				sec = 60; or sec = 59;
 * 			}
 * 		}		
 */
		
		System.out.println("ForTest3 finish");
	}

}
