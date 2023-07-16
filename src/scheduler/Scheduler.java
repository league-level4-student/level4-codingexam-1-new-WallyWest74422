package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler extends Day{

    public static void main(String[] args) {
    	Scanner scam = new Scanner(System.in);
    	boolean active = true;
    	System.out.println("Welcome to your online schedule! Enter the text shortcuts 's', 't', 'w', 'th', 'f' and 'sa' to decide which day to modify.");
    	System.out.println(" After you have selected a day, use the console commands 'a', 'r', and 'v' to either add an event, remove an event, or view the daily schedule.");
    	do {
        	String input = scam.next();

    	Sunday s = new Sunday();
    	Monday m = new Monday();
    	if(input.equals("s")) {
    		if(scam.next().equals("a")) {
    			s.addEvent();
    		} else if(scam.next().equals("r")) {
    			s.removeEvent();
    		} else if(scam.next().equals("v")) {
    			s.viewDay();
    		}
    	}
    	}while(active ==true);
    		
    	


    }


	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewDay() {
		// TODO Auto-generated method stub
		
	}
}
