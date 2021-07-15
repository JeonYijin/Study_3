package com.ae5;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		
		//11, 20, 32 -> 하나의 변수
		
		int []nums = new int[3];
		//System.out.println(nums);
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);		
		
		System.out.println("배열의 크기 " + nums.length);
		
		//3.12, 2.3, 4.123, 5.0 배열 선언하고 데이터 대임
		double [] nums2 = new double[4];
		nums2[0]= 3.12;
		nums2[1] = 2.3;
		nums2[2] = 4.123;
		nums2[3] = 5.0;
				
		
		//문자열을 담을 배열 3칸 생성
		//모두 출력 (넣지말고)
		
		String []st = new String[3];
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		
		//스캐너를 담을 배열 2칸 짜리 생성
		//모두 출력
		
		Scanner []sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
		
		
		
		
	}

}
