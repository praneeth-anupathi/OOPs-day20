package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class MarksCalci {
	String name;
	int[] marks;
	
	public void setdetails(String name, int[] marks){
		
		this.name=name;
		this.marks=marks;
	}
	
	public int total() {
		int sum=0;
		for(int mark:marks)
			 sum+=mark;
		return sum;
	}
	
	public double calavg() {
		
		return (double) total()/marks.length;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("total: "+total());
		System.out.println("average: "+calavg());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MarksCalci s1=new MarksCalci();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter size");
		int n=sc.nextInt();
		int[] marks=new int[n];
		System.out.println("enter marks");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		s1.setdetails(name,marks);
		s1.display();

	}

}
