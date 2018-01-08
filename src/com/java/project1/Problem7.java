package com.java.project1;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임");
		
		int i =0;
		int answer = (int)(Math.random()*100+1);
		int count =0;
		
		do{
			count++;
			System.out.println("숫자를 입력하세요");
			i= scan.nextInt();
			if(i<answer) 
				System.out.println("크게");
			else if(i>answer) 
			System.out.println("작게");
			
			else 
			 System.out.println("정답입니다.");
			System.out.println("시도한 횟수는"+count+"번입니다.");
			break;

		}while(true);{
			System.out.println("다시 도전하시겠습니까?\t"+"y/n");
			
		}


	}

}
