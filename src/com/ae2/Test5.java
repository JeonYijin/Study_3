package com.ae2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("TEST5");
		
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 ID
		int id = 1234;
		//회원가입시 입력한 pw
		int pw = 5678;
		
		//입력할 id
		int yid=0;
		//입력할 pw
		int ypw = 0;
		
		System.out.println("아이디를 입력하세요: ");
		
		//ID 입력 후 저장
		//id = sc.nextInt();
		
		yid = sc.nextInt();
		
		System.out.println("비밀번호를 입력하세요: ");
		
		//PW 입력 후 저장
		//pw = sc.nextInt();
		
		ypw = sc.nextInt();
		
		//로그인이 성공하면 - 로그인 성공 출력, 실패하면 종료
		
		if(id == yid && pw == ypw) {
			System.out.println("로그인 성공");
		}
		
		System.out.println("TEST5 FINISH");
	}

}
