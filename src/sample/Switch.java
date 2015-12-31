package sample;

/**
 * @author Andrey Semenyuk
 */

public class Switch {

	private boolean state;

	public Switch() {
	}

	public Switch(boolean state) {
		this.state = state;
	}

	public boolean getState() {
		return state;
	}

	@Override
	public String toString() {
		if (state) {
			return "Включён";
		}
		return "Выключен";
	}
}
