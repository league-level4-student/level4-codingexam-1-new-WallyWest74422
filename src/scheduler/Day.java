package scheduler;

import java.util.Scanner;

public abstract class Day {
LinkedList<Event> daily;
Scanner scammer = new Scanner(System.in);
public abstract void viewDay();
public abstract void addEvent();
public abstract void removeEvent();
}
