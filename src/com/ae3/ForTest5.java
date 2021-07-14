package com.ae3;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		System.out.println("ForTest5");
		//과목수 입력받기, 과목 수 만큼 점수 입력 받기 
		//총점, 평균 계산 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		//count = 과목수
		System.out.println("과목수를 입력하세요: ");
		int count = sc.nextInt();
		
		//total = 총점, avg = 평균
		int total =0;
		double avg = 0;
		// score = 과목 점수
		int score = 0;
		for(int i = 1; i<count+1; i++) {
			System.out.println( i +"번 과목 점수를 입력하세요: ");
			score = sc.nextInt();
			total = total + score;
			avg = total/count;
		}
			System.out.println("총점은 : " +total);	
			System.out.println("평균은 : "+avg);
		
		
		System.out.println("ForTest5 finish");
	}

}
