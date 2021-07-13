package com.ae3;

public class ForTest2 {

	public static void main(String[] args) {
		System.out.println("증감연산자");
		int num = 0;
		
		++num;
		System.out.println(num);
		
		num++;
		System.out.println(num);
		
		int check1 = ++num;
		System.out.println("num: " +num);
		System.out.println("check1 : " +check1);
		
		check1 = num++;
		System.out.println("num: " +num);
		System.out.println("check1 : " +check1);
		
		
		System.out.println(++num);
		System.out.println(num++);
		System.out.println(num);
	}

}
