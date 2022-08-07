package com.ictkerala.encapsulation;

import java.util.Scanner;

public class MainFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionalityprog obj = new Functionalityprog();
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked: ");
		
		int num = inp.nextInt();
		
		obj.setNumber(num);
		
		//System.out.println("The no. read from user is "+ obj.getNumber());
		
		obj.pos();
	}

}
