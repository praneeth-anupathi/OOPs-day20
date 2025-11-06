package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class Ticket {
	int ticket;
	int totalcost;
	
	public Ticket(int ticket) {
		super();
		// TODO Auto-generated constructor stub
		this.ticket=ticket;
	}
	public int totalcost() {
		return ticket*500;
	}
	public void display() {
		System.out.println("total cost is: "+totalcost());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=sc.nextInt();
		if(count<0) {
			System.out.println("ticket count should be positive");
			return;
		}
		Ticket tb=new Ticket(count);
		tb.display();
		
	}

}
