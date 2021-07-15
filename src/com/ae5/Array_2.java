package com.ae5;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("과목의 수를 입력하세요: ");
		int a = sc.nextInt();
		
		int [] nums = new int[a];
		//각 인덱스번호에 숫자 입력
		for(int i = 0; i< nums.length; i++) {
			System.out.println(i+1+"번 점수 입력");
			nums[i] = sc.nextInt();
			
		}
		
		
		//index 0으로 시작, 1씩 증가
		//for문과 함께 쓰기 위함
		int total = 0;
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
			total = total+nums[i];
		}
		double avg = total/(double)nums.length;
		//총점과 평균 출력
		
		System.out.println(total);
		System.out.println(avg);
		
		
		
		
	}

}
