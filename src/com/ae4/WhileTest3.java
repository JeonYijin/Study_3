package com.ae4;

public class WhileTest3 {

	public static void main(String[] args) {
		
		for(int i =0; i< 10; i++) {
			if(i%2 !=0) {
				//홀수
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
