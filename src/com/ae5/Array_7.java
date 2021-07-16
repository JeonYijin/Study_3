package com.ae5;

import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
		
		//한 학생의 정보는 이름, 번호, 국어, 영어, 수학, 총점, 평균으로 이루어져 있다
		//이름은 이름끼리 국어는 국어끼리 묶어서 배열
		//학생 3명
		String [] names = new String [3];
		names[0] = "iu";
		names[1] = "uiu";
		names[2] = "uiui";
		
		
		int [] nums = new int[3];
		nums[0]= 5;
		nums[1] = 29;
		nums[2] = 2;
		
		//이름과 번호를 출력 번호 순서대로 출력 오름차순으로
		
		for(int idx = 0; idx<nums.length-1; idx++) {
			for(int i =idx+1; i< nums.length; i++) {
				if(nums[idx]>nums[i]) {
					int tmp = nums[i];
					nums[i] = nums[idx];
					nums[idx] = tmp;
					//이름 자리 바꾸기
					String t = names[i];
					names[i] = names[idx];
					names[idx] = t;
				}
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println("이름은: " + names[i] +" 번호는: " + nums[i]);
		}
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
	}

}
