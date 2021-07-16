package com.ae5;

public class Array_6 {

	public static void main(String[] args) {
		
		int [] ar = {3,5,1,7,4};
		
		//정렬
		//1. 높은것에서부터 낮은순 :내림차순 desc 2. 낮은것에서부터 높은순 :오름차순 asc 
		int idx = 0;
		
		for(idx=0; idx<ar.length-1; idx++) {
			for(int i=idx+1; i<ar.length; i++) {
				if(ar[idx] < ar[i]) {
					int tmp = ar[i]; //바꾸기 전 임시저장하기
					ar[i]= ar[idx];  
					ar[idx] = tmp;
				
				}
			}
		}
		
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
	}

}
