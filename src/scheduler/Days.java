package scheduler;
public enum Days{

	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	public static void main(String[] args) {
		Days[] enums = new Days[Days.values().length];
		enums[0] = SUNDAY;
		enums[1] = MONDAY;
		enums[2] = TUESDAY;
		enums[3] = WEDNESDAY;
		enums[4] = THURSDAY;
		enums[5] = FRIDAY;
		enums[6] = SATURDAY;
		

	}
	
	LinkedList<Event> ll = new LinkedList<Event>();

}