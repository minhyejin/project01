package com.java.project1;

public class Problem3 {

	public static void main(String[] args) {
int i,j,dan=1;
		
		for(i=2; i<10; i++) {
			for(j=2; j<10; j++) {System.out.print(i+"*"+j+"="+dan+" ");
				dan = i*j;
			}System.out.println(" "+i+"*"+j+"="+dan);
		}
	}

}
