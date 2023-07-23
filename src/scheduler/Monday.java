package scheduler;

import java.util.Scanner;

public class Monday extends Day{

	LinkedList<Event> daily = new LinkedList<Event>();
	Scanner scammer = new Scanner(System.in);
	@Override
	public void viewDay() {
		// TODO Auto-generated method stub
		Node<Event> current = daily.getHead();
		while(current.getNext()!=null) {
		current.getValue().returnEvent();
		current = current.getNext();
		}
		daily.getTail().getValue().returnEvent();

	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter a time for your new event");
		Double time = scammer.nextDouble();
		System.out.println("Great! Next please enter a short description for your new event");
		String description = scammer.nextLine();
		daily.add(new Event(time, description));
	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		
	};
}
