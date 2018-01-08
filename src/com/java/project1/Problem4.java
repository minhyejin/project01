package com.java.project1;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		int num=0;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			
			
			for(int j=1; j<=10; j++) {
				
				System.out.print(num+j  +" ");
			}
		System.out.println();
		//num이 늘어난다 1씩 
		num++;
		
		}


	}

}
