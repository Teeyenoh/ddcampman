package uk.co.quarklike.ddcampman.src;

import java.awt.Dimension;

import javax.swing.JPanel;

public class DDPanel extends JPanel {
	private static final long serialVersionUID = 6975763037784173270L; // Generated serial number to make Eclipse happy

	// Custom method to set minimum, preferred and maximum size of a panel easily
	// (might move to DDComponent later)
	public void setRealSize(int width, int height) {
		Dimension d = new Dimension(width, height);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setMaximumSize(d);
	}
}
