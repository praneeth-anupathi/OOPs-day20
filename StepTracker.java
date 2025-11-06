package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class StepTracker {
	int steps;
	
	

	public StepTracker(int steps) {
		super();
		// TODO Auto-generated constructor stub
		this.steps=steps;
	}
	public void show() {
		if(steps<5000) {
			System.out.println("keep walking");
		}else if(steps<10000) {
			System.out.println("good job");
		}else if(steps>=10000) {
			System.out.println("excellent");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StepTracker p1=new StepTracker(sc.nextInt());
		p1.show();

	}

}
