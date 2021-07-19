package com.ae5;

import java.util.Scanner;

public class Array_Answer {

		public static void main(String[] args) {

			//1번 로그인 성공하면 메인메뉴가
			//1.로그아웃 2. 회원탈퇴 3. 종료로 뜨기
			
			int [] ids = {1234, 4567, 4356, 1298};
			int [] pws = {7845, 1478, 2325, 6145};
			
			Scanner sc = new Scanner(System.in);
			
			boolean flag = true;
			while(flag) {
				System.out.println("1.로그인");
				System.out.println("2.회원가입");
				System.out.println("3.종료");
				System.out.println("번호선택 >>");
				//입력한 번호 num
				int num = sc.nextInt();
				boolean check = false;
				//로그인을 시도한다면
				if(num==1) {
					//아이디와 비밀번호 입력받기
					System.out.println("아이디를 입력>>");
					int id = sc.nextInt();
					System.out.println("비밀번호를 입력");
					int pw = sc.nextInt();
					
					//입력한 id와 pw 일치하는지 확인
					for(int i=0; i<ids.length; i++) {
						if(id == ids[i] && pw==pws[i]) {
							System.out.println("로그인 성공");
							check = true;
							break;
						}
					}
					if(check==false) {
						System.out.println("로그인실패");
					}else {
						System.out.println("1.로그아웃 2.회원탈퇴 3.종료");
						int num2 = sc.nextInt();
						while(flag) {
							switch(num2) {
							case 1:
								System.out.println("1.로그아웃");
								flag = !flag;
								break;
							case 2:
								System.out.println("2.회원탈퇴"); //회원이 몇번 인덱스인지, 그걸 비교해서 제거 하기
								int iids[] = new int[ids.length-1];
								int j =0;
								//int k = ids.indexOf(id);
								for(int i =0; i<ids.length; i++) {
									if(id==ids[i]) {
									}
								}
								
								
								break;
							default :
								System.out.println("종료");
								flag = false;
							}
						}
					}
					
				}else if(num ==2) {
					//새로운 id를 담을 배열 만들기
					int [] nids = new int[ids.length+1];
					
					System.out.println("아이디를 설정하세요>>");
					int nid = sc.nextInt();
					//id를 새로 만들어서 원래 배열에 담기
					for(int i =0; i<ids.length; i++) {
						if(nid == ids[i]) {
							System.out.println("중복된 아이디입니다.");
							check = true;
							break;
						}
					}	//아이디가 중복일때 회원가입 실패하고 처음으로 돌아가기
					if(check==true) {
						System.out.println("회원가입실패");
						continue;
					}else {//중복아니면 배열에 담기
						for(int i=0; i<ids.length; i++) {
							nids[i] = ids[i];
						}
							nids[ids.length] = nid;
							ids = nids;
					}
						
					//새로운 pw를 담을 배열 만들기
					int[] npws = new int[pws.length+1];
					
					System.out.println("비밀번호를 설정하세요>>");
					int npw = sc.nextInt();
					//pw를 새로 만들어서 원래 배열에 담기
					for(int i=0; i<pws.length; i++) {
							npws[i] = pws[i];
					} 	npws[pws.length] = npw;
						pws = npws;

				}else {
					System.out.println("종료합니다.");
					flag = false;
				}
				
				
			}

			
			
			
			
			
			
			
			
			
			
			
	}

}
