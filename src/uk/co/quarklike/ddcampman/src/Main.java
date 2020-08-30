package uk.co.quarklike.ddcampman.src;

public class Main {
	private static final String _PROGRAM_NAME = "D&D Campaign Manager";
	private static final int _VERSION_MAJOR = 0;
	private static final int _VERSION_MINOR = 1;
	private static final int _VERSION_REVISION = 0;
	private static final int _BUILD_NUMBER = 4;
	private static final String _RELEASE_TYPE = "alpha";
	private static final String _WINDOW_NAME = _PROGRAM_NAME + " v" + _VERSION_MAJOR + "." + _VERSION_MINOR + "." + _VERSION_REVISION + "-b" + _BUILD_NUMBER + "-" + _RELEASE_TYPE;
	
	private DDWindow _window;

	public Main() {
		_window = new DDWindow(_WINDOW_NAME);
		_window.init();
	}

	public static final void main(String[] args) {
		new Main();
	}
}
