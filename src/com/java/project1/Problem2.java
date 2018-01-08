//7이면 1 22 333 4444 55555 666666 7777777이렇게 출력하시오 
package com.java.project1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int i = scan.nextInt();
		scan.nextLine();
		
		for(int j =1; j<=i; j++) {
			
			for(int k=0; k<j; k++)
				System.out.print(j);
		
			
			System.out.println();
		}
		
		

	}

}
