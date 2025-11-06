package com.codegnan.OOPsBasic;

import java.util.Scanner;

public class TechFestAttendees {
    
    private static int totalAttendees = 0;  // Shared among all events
    private int eventAttendees = 0;         // Specific to each event
    
    // Static method to update total attendees
    public static void updateTotalAttendees(int add) {
        if (add < 0) {
            System.out.println("Invalid attendee count!");
            return;
        }
        if (totalAttendees + add <= 300) {
            totalAttendees += add;
        }
    }
    
    // Non-static method to update attendees for a particular event
    public void updateEventAttendees(int add) {
        if (add < 0) {
            System.out.println("Invalid attendee count!");
            return;
        }
        if (eventAttendees + add <= 300) {
            eventAttendees += add;
        }
    }
    
    // Method to display results
    public void display() {
        System.out.println(totalAttendees + " " + eventAttendees);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int staticAttendees = sc.nextInt();
        int instanceAttendees = sc.nextInt();
        
        TechFestAttendees event = new TechFestAttendees();
        
        // Update static total
        TechFestAttendees.updateTotalAttendees(staticAttendees);
        
        // Update event attendees
        event.updateEventAttendees(instanceAttendees);
        
        event.display();
        
        sc.close();
    }
}

