package com.ictkerala.encapsulation;

public class Functionalityprog {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void pos(){
		
		if(number>0) {
			System.out.println("Number is positive");
		}
		else if(number<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is zero");
		}
	}
}
