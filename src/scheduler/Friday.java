package scheduler;

import java.util.Scanner;

public class Friday extends Day {

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
		} else if (daily.size() > 1) {
			while (current.getNext() != null) {
				current.getValue().returnEvent();
				current = current.getNext();
			}
			current.getValue().returnEvent();

		}
	}

	@Override
	public void addEvent() throws SchedulingConflictException {
		// TODO Auto-generated method stub
		System.out.println("Please enter a time for your new event");
		Double time = scammer.nextDouble();
		System.out.println("Wonderful! Next please enter a short description for your new event");
		scammer.nextLine();
		String description = scammer.nextLine();
		Event event = new Event(time, description);

		if (daily.size() == 0) { // For size = 0
			daily.add(new Event(time, description));

		} else if (daily.size() >= 1) {
			Node<Event> current = daily.getHead();
			Node<Event> next = current.getNext();
			while (current.getNext() != null) {
				if (current.getValue().getTime().equals(time)) {
					System.out.println("ERROR: Time slot is already taken!");
					throw new SchedulingConflictException();
				}
				current = current.getNext();
				next = current.getNext();
			}
			current = daily.getHead();
			next = current.getNext();
			if (daily.getHead().getValue().getTime() > time) {
				Node<Event> first = new Node<Event>(event);
				daily.getHead().setPrev(first);
				first.setNext(daily.getHead());
				daily.setHead(first);
			} else if (daily.size() == 1 && daily.getHead().getValue().getTime() < time) {
				daily.add(event);
			} else {
				while (current.getNext() != null) {
					if (current.getValue().getTime() < time && next.getValue().getTime() > time) {
						Node<Event> pos = new Node<Event>(event);
						current.setNext(pos);
						pos.setNext(next);
						next.setPrev(pos);

					}
					current = current.getNext();
					next = current.getNext();
				}

				Node<Event> end = daily.getTail();
				if (daily.getTail() != null) {
					if (end.getValue().getTime() < time) {
						Node<Event> last = new Node<Event>(event);
						last.setPrev(daily.getTail());
						daily.getTail().setNext(last);
						daily.setTail(last);
					}
				}

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