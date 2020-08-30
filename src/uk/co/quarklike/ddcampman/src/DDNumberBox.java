package uk.co.quarklike.ddcampman.src;

import java.text.NumberFormat;

import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class DDNumberBox extends JFormattedTextField {
	private static final long serialVersionUID = 5284209506896830624L; // All hail the Eclipse gods

	public DDNumberBox(int columns) {
		super();
		this.setColumns(columns);
		NumberFormat nf = NumberFormat.getIntegerInstance();
		nf.setGroupingUsed(true);
		this.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter(nf)));
	}

}
