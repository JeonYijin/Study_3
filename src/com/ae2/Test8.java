package com.ae2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("TEST8");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		//합격 기준
		//평균이 60점 이상
		//과목당 40점 이상
		
/*		if(avg>=60) {
			if(kor>=40) {
				if(eng>=40) {
					if(math>=40) {
						System.out.println("합격");
					}else {
						System.out.println("불합격");
					}
				}else {
					System.out.println("불합격");
				}
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
*/		
/*		if(kor>=40) {
			if(eng>=40) {
				if(math>=40) {
					if(avg>=60) {
						System.out.println("합격");
					}
				}
			}
		}else {
			System.out.println("불합격");
		}
*/
/*		if(kor>=40 && eng>=40 && math>=40) {
			if(avg>=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
*/		
		if((kor>=40 && eng>=40 && math>=40)&& avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
//		if(avg>=60) {
//			if(kor>=40 && eng>=40 && math>=40) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
	
//----------------------1차 코드--------------
//		if(avg>=60) {
//			if(kor>40) {
//				if(eng>40) {
//					if(math>40) {
//						System.out.println("합격");
//					}else {
//						System.out.println("수학 불합격");
//					}
//				}else {
//					System.out.println("영어 불합격");
//				}
//			}else {
//				System.out.println("국어 불합격");
//			}
//		}else {
//			System.out.println("평균 불합격");
//		}
//----------------------2차 코드----------------
//		if(avg>=60) {
//			if(kor>40 && eng>40 && math>40) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}

		
		
		
		
		System.out.println("TEST8 FINISH");
		
		
	}

}
