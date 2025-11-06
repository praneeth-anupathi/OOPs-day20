package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class TechFestAttendees {
    
    private static int totalAttendees = 0;  
    private int eventAttendees = 0;         
    
   
    public static void updateTotalAttendees(int add) {
        if (add < 0) {
            System.out.println("Invalid attendee count!");
            return;
        }
        if (totalAttendees + add <= 300) {
            totalAttendees += add;
        }
    }
    
    
    public void updateEventAttendees(int add) {
        if (add < 0) {
            System.out.println("Invalid attendee count!");
            return;
        }
        if (eventAttendees + add <= 300) {
            eventAttendees += add;
        }
    }
    
    
    public void display() {
        System.out.println(totalAttendees + " " + eventAttendees);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int staticAttendees = sc.nextInt();
        int instanceAttendees = sc.nextInt();
        TechFestAttendees event = new TechFestAttendees();
        TechFestAttendees.updateTotalAttendees(staticAttendees);
        event.updateEventAttendees(instanceAttendees);
        event.display();
        sc.close();
    }
}

