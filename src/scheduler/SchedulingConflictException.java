package scheduler;

import javax.swing.JOptionPane;

public class SchedulingConflictException extends Exception {
	public void criticalError() {
		JOptionPane.showMessageDialog(null, "Critical Error!");
	}

//	public void printStackTrace() {
//
//	}
}
