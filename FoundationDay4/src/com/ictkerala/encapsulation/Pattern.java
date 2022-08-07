package com.ictkerala.encapsulation;

import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		
		int row = inp.nextInt();
		
		int i,j,k;
		
		for(i=0;i<row;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
