package uk.co.quarklike.ddcampman.src;

public class Main {
	private DDWindow _window;

	public Main() {
		_window = new DDWindow();
		_window.init();
	}

	public static final void main(String[] args) {
		new Main();
	}
}
