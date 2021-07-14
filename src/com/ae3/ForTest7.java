package com.ae3;

public class ForTest7 {
	public static void main(String[] args) {
		System.out.println("ForTest7");
		
		//이중 for - for문 안의 for
		//구구단
		
//		for(int dan=2; dan<10; dan++) {
//			System.out.println(dan+"단");
//			for(int num =1; num<10; num++) {
//				System.out.println(dan+" * "+num + " = "+dan*num);
//			}
//			System.out.println("======================");
//		}
		
		
		int gugu=0;
		for(int i=2; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				gugu = i*j;
				System.out.print(i+"*"+j +"= "+ gugu +" ");
			}
			System.out.println("\n======================");
		}
		
		
		
		
		System.out.println("ForTest7 finish");
	}

}
