package src;
public abstract class Gegram {
	protected String[] input;
	public Gegram() {

	}
	public Gegram(String[] input) {
		this.input = input;
	}
	public abstract void parseBarbarism(boolean correctOrNot);
}