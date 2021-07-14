package com.ae3;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		System.out.println("ForTest6");
		
		Scanner sc = new Scanner(System.in);
		
		//회원 가입시 입력한 id 
		int id = 1234;
		//회원 가입시 입력한 pw
		int pw = 5678;
		
		boolean flag = false;
		//id 입력받기 , pw입력받기, 같은지 안같은지 비교, 맞으면 종료 틀리면 다시 입력받기
		//1. 최대 5번 로그인 시도 넘어가면 종료
		String result = "로그인 성공";
		
		for(int i=0; i<5; i++) {
			System.out.println("아이디를 입력하세요: ");
			int iid = sc.nextInt();
			System.out.println("비밀번호를 입력하세요: ");
			int ppw = sc.nextInt();
			
			if(iid == id && ppw == pw) {
				//result = "로그인 성공";
				flag = !flag;
				break;//조건식 false로 만들기 i = 5;
			}
			
			System.out.println(i+1+"로그인 실패");
			//result = "로그인 실패 은행을 방문하세요.";
		}//for 끝
		
		//for 종료 조건 로그인 성공과 5번 다 실패했을 때
		//flag가 true면 로그인 성공
		if(flag) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 은행 방문하세요");
		}
		
		//System.out.println(result);
		
		System.out.println("ForTest6 finish");
	}

}
