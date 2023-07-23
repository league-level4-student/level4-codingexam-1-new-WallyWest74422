package scheduler;

public class Event {

	private Double time;
	private String description;

	Event(Double time, String description) {

		this.time = time;
		this.description = description;
	}

	public void returnEvent() {
		System.out.print(time);
		System.out.print(" - ");
		System.out.println(description);
		System.out.println(" ");

	}

	public Double getTime() {
		return time;
	}
}