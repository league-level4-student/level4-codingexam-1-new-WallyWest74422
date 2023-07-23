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
public class Scheduler extends Day {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		boolean active = true;
		System.out.println(
				"Welcome to your online schedule! Enter the text shortcuts 's', 'm', 't', 'w', 'th', 'f' and 'sa' to modify a day of the week.");
		System.out.println(
				"After selecting a day, use the console commands 'a', 'r', and 'v' to either add an event, remove an event, or view the daily schedule.");
		Sunday s = new Sunday();
		Monday m = new Monday();
		do {
			String input = scam.next();
			if (input.equals("s")) {
				String modification = scam.next();
				if (modification.equals("a")) {
					s.addEvent();
					// System.out.println("Adding event.");
				} else if (modification.equals("r")) {
					s.removeEvent();
					// System.out.println("Removing event.");
				} else if (modification.equals("v")) {
					s.viewDay();
					// System.out.println("Viewing event.");
				}
			}
			if (input.equals("m")) {
				String modification = scam.next();
				if (modification.equals("a")) {
					m.addEvent();
				} else if (modification.equals("r")) {
					m.removeEvent();
				} else if (modification.equals("v")) {
					m.viewDay();
				}
			}
		} while (active == true);

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
