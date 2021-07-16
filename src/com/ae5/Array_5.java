package com.ae5;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		
		//1. 정보출력  2. 정보추가 3. 정보삭제 4. 종료 출력
		// 숫자 하나 입력받아서 4중 하나 프린트가 나오고 다시 입력받기 종료 누를때까지 반복
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int [] ar = {10,20,30};
		while(flag) {
			System.out.println("1.정보출력");
			System.out.println("2.정보추가");
			System.out.println("3.정보삭제");
			System.out.println("4.검색삭제");
			System.out.println("5.종료");
			System.out.println("번호를 입력하세요>>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				if(ar.length>0) {
					for(int i =0; i<ar.length; i++) {
						System.out.println(ar[i]);
					}
				}else {
					System.out.println("data가 없다");
				}
				
				break;
				
			case 2:
				
				int []ar2 = new int[ar.length+1];
				
				System.out.println("새로운 값을 입력하세요>>");
				int value = sc.nextInt();
				
				
				for(int i =0; i< ar.length; i++) {
					ar2[i] = ar[i];
				}
				//
//				System.out.println("새로운 값을 입력하세요>>");
//				int value = sc.nextInt();
				
				ar2[ar.length] = value;
				ar = ar2;
				break;
				
			case 3:
				System.out.println("정보삭제");
				
				
				if(ar.length==0) {
					System.out.println("더이상 삭제할 데이터가 없음");
					continue;
				}
				
				int [] ar3 = new int [ar.length-1];
				for(int i=0; i<ar3.length; i++) {
					ar3[i] = ar[i];
				} 	ar = ar3;
				
				break;
			case 4:
				//배열의 크기가 0이면 할 필요x
				if(ar.length==0) {
					System.out.println("더이상 삭제할 데이터가 없음");
					continue;
				}
				
				System.out.println("삭제할 인덱스 번호를 입력하세요>>");
				int dnum = sc.nextInt(); //삭제할 인덱스 번호
				
				//배열에 없는 인덱스일 경우
				if(dnum >=ar.length || dnum <0) {
					System.out.println("범위를 벗어났습니다.");
					continue;
				}
				
				int [] ar4 = new int[ar.length-1];
				int j = 0; //ar4[i]대신 넣을 변수
				for(int i =0; i<ar.length; i++) {//끝까지 돌아야 하기 때문에 ar.length
					if(i==dnum) {
						continue;
					}//순서가 다르기 때문에 같은 i로 설정 불가능 다른 변수 설정
					ar4[j] = ar[i];
					j++;
				}ar = ar4;
				break;
				
			default :
				System.out.println("종료");
				flag = !flag;
			}
		}
		
		
		
		
		
		
		
	}

}
