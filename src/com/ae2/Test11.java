package com.ae2;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		System.out.println("Test11");
		
		//국어, 영어, 수학 입력받기
		//총점, 평균 계산
		//평균이 90점 이상이면 A, 80점 이상 B, 70점 이상 C, 60점 이상 D
		//그외 나머지는 F 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수: ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		if(avg>= 90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		System.out.println("Test11 finish");
	}

}
