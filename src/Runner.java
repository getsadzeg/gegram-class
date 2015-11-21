package src;
public class Runner {
	public static void main(String[] args) {
		String[] input = {"მაგარი", "ნასკი"};
		Gegram gram = new Gegram(input);
		gram.parse(true);
	}
}