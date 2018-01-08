package com.java.project1;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
	
		int array[]= new int[5];
		 for(int i=1; i<5; i++) {
			array [i] = scan.nextInt();
		 }
			 
			int  max= array[0];//최대값 배열 0번째로 리턴 
			
			for(int j=1; j<array.length; j++) {
				if(array.length>max) {
					max = array[j];
				}
				
					
			}
				System.out.println("최대값은:"+max);
		

	}

}
