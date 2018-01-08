package com.java.project1;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money =0;
		
		
		while(true) {
		System.out.println("----------------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("----------------------");
		
		System.out.println("선택");
		int i = scan.nextInt();
		
		switch(i) {
		
		case 1:
			System.out.println("금액 입력:");
			int deposit = scan.nextInt();
			scan.nextLine();
		    money += deposit;
		
		case 2:
			System.out.println("출금할 금액 입력:");
			int withdraw = scan.nextInt();
			scan.nextLine();
			 money -= withdraw;
			 
		case 3:
			System.out.println("잔고 조회");
		    System.out.println(money);
		    break;
		
		case 4: 
			System.out.println("종료");
		
			default:System.out.println("다시 입력해주세요");	
		}
		}
	}

}
