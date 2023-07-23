package scheduler;

import java.util.Scanner;

public class Sunday extends Day {

	LinkedList<Event> daily = new LinkedList<Event>();
	Scanner scammer = new Scanner(System.in);

	@Override
	public void viewDay() {
		Node<Event> current = daily.getHead();
		// TODO Auto-generated method stub
		if (daily.size() == 0) {
			System.out.println("There is currently nothing scheduled for today.");
		} else if (daily.size() == 1) {
			current.getValue().returnEvent();
		} else {
			while (current.getNext() != null) {
				current.getValue().returnEvent();
				current = current.getNext();
			}
			Node<Event> end = daily.getTail();
			end.getValue().returnEvent();
		}
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub

		System.out.println("Please enter a time for your new event");
		Double time = scammer.nextDouble();
		System.out.println("Wonderful! Next please enter a short description for your new event");
		scammer.nextLine();
		String description = scammer.nextLine();
		Event event = new Event(time, description);
		
		if (daily.size() == 0) { //For size = 0
			daily.add(new Event(time, description));
		} else if(daily.size()==1){
			
		}
			Node<Event> current = daily.getHead().getNext();
			Node<Event> prev = current.getPrev();
			if (daily.getHead().getValue().getTime() > time) {
				daily.add(event);
				Node<Event> first = new Node<Event>(event);
				daily.getHead().setPrev(first);
				first.setNext(daily.getHead());
				daily.setHead(first);
			}
			while (current.getNext() != null) {
				if (current.getValue().getTime() > time) {
					daily.add(event);
					Node<Event> pos = new Node<Event>(event);
					prev.setNext(pos);
					pos.setNext(current);
					current.setPrev(pos);
					pos.setNext(current);

				}
				current = current.getNext();
				prev = current.getPrev();
			}
			Node<Event> end = daily.getTail();
			Node<Event> penultimate = end.getPrev();
			if (end.getValue().getTime() > time) {
				daily.add(event);
				Node<Event> pos = new Node<Event>(event);
				penultimate.setNext(pos);
				pos.setNext(end);
				end.setPrev(pos);
				pos.setNext(end);
			} else if (end.getValue().getTime() < time) {
				daily.add(event);
				Node<Event> last = new Node<Event>(event);
				last.setPrev(daily.getTail());
				daily.getTail().setNext(last);
				daily.setTail(last);
			}

		}

	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of the event that you want to delete.");
		int order = scammer.nextInt();
		daily.remove(order - 1);
	};
}
