package uk.co.quarklike.ddcampman.src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class DDWindow extends JFrame {
	private static final long serialVersionUID = -4056239297507207668L; // Generated serial ID to make Eclipse happy

	private DDPanel _top_panel; // Top panel object, action buttons
	private DDPanel _side_panel; // Side panel object, trees of objects
	private DDPanel _middle_panel; // Middle panel object, main view

	// Constructor
	public DDWindow() {
		// Create all three panels
		_top_panel = new DDPanel();
		_side_panel = new DDPanel();
		_middle_panel = new DDPanel();
	}

	public void init() {
		// Give this frame object a border layout (NESW)
		this.setLayout(new BorderLayout());

		// Add the three panels and temporarily colour them for identification
		this.add(_top_panel, BorderLayout.NORTH);
		_top_panel.setBackground(Color.RED);
		this.add(_side_panel, BorderLayout.WEST);
		_side_panel.setBackground(Color.GREEN);
		this.add(_middle_panel, BorderLayout.CENTER);
		_middle_panel.setBackground(Color.BLUE);
		
		_middle_panel.add(new DDTextBox(40));
		
		// Add an inline component listener to resize the three panels when the window is resized
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent component_event) {
				resize();
			}
		});

		// Give the window an old-style 800x600 resolution and resize the components
		this.setSize(800, 600);
		resize();

		// Compress the window down so the components fill it (probably not needed)
		this.pack();
		
		// Put the window in the centre of the screen
		this.setLocationRelativeTo(null);
		
		// Make the program exit once the window is closed
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Show the window
		this.setVisible(true);
	}

	private static final float _TOP_WIDTH = 0.2f; // Fraction of screen taken by top bar
	private static final float _SIDE_WIDTH = 0.2f; // Fraction of screen taken by side bar

	// Resize the panels based on _TOP_WIDTH and _SIDE_WIDTH
	private void resize() {
		int window_width = this.getWidth(); // The current width of the window
		int window_height = this.getHeight(); // The current height of the window

		// Resize all three panels using the setRealSize method in DDPanel
		_top_panel.setRealSize(window_width, (int) (window_height * _TOP_WIDTH));
		_side_panel.setRealSize((int) (window_width * _SIDE_WIDTH), (int) (window_height * (1 - _TOP_WIDTH)));
		_middle_panel.setRealSize((int) (window_width * (1 - _SIDE_WIDTH)), (int) (window_height * (1 - _TOP_WIDTH)));
	}
}
