package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class Eligibility {
	double attendence;
	
	public Eligibility(double attendence) {
		super();
		this.attendence=attendence;
	}
	
	public void check() {
		if(attendence>70) {
			System.out.println("eligible"); 
		}else
			System.out.println("not eligible");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Eligibility per = new Eligibility(sc.nextDouble());
		per.check();
		
	}

}
