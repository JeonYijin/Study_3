package com.ae4;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2");
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		// 1. 로그인 - id, pw입력받기, 로그인 판단 맞으면 종료 틀리면 다시 처음으로 
		// 2. 종료 먼저 입력받기
		int iid =0; 
		int ppw=0;
		boolean flag = true;
		while(flag) {
			System.out.println("1. 로그인 2. 종료");
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("ID: ");
				iid = sc.nextInt();
				System.out.println("PW: ");
				ppw = sc.nextInt();
				if(iid==id && ppw ==pw) {
					System.out.println("로그인 성공");
					flag = !flag;
				}
				
			}else {
				flag = !flag;
			}
			
			//로그인 성공, 로그인 안됐거나 로그인이 성공했으면 게임을 시작
			//최초레벨 1, 만렙 15 모든 몬스터의 경험치는 동일
			//최초 골드 = 0; 레벨 5 달성했을 때 1000골드 지급
			//레벨 10을 달성시 2000골드 15 달성 3000골드
			//모든 몬스터의 경험치는 동일 
			//레벨 1-> 2 : 3마리 잡기 몬스터 1마리 사냥 잡은 만큼 출력 이후 레벨업 출력 
			//레벨 2-> 3 : 6마리 잡기
			//레벨 3-> 4 : 9마리 4->5 12 5-> 6 15마리 14 ->15 : 42
			//15되면 종료 최종 레벨 출력과 골드 출력 후 종료
			
			int level = 1;
			int gold = 0;
			int monster = 0;
			// 레벨업 시 지급되는 골드
			int add = 1000;
			
			if(iid==id && ppw==pw) {
				for(level = 1; level<15; level++) {
					for(int i =0; i< level*3; i++) {
						
						monster ++;
						System.out.println(monster+"마리를 잡았습니다.");
					} 
						//monster = 0; 여기 있었는데 왜 초기화는 맨 마지막에??
					
					if(monster%3 ==0) {
						//level을 업그레이드 한 상태로 출력하기 위해++
						level++;
						System.out.println(level+"레벨 업");
					
						if(level%5 ==0) {
							gold = gold + add;
							System.out.println(add +"골드를 지급합니다.");
							add = add+1000;
						}
						monster = 0;
						//다시 for문으로 돌아갔을 때 수가 달라지지 않게하기 위해
						level = level-1;
						
					}
				}	
				System.out.println("최종레벨: " + level+ " 골드: " + gold);
				System.out.println("게임을 종료합니다.");
				break;

			//해결하고 싶은 점 1. add라는 변수 없이 gold만을 가지고 증가시키기
			//2. monster의 초기화, level을 찍을 때의 문제점 +1을 안할 수 있는 방법
			//3. 불필요한 level의 증감
			
		}
		
		
		
		
		System.out.println("WhileTest2 finish");
	}

	}
}
