package src;
public class Runner {
	public static void main(String[] args) {
		String[] input = {"მჯერავს", "რომ", "მაგარი", "სერვისი", "არის"};
		Gegram gram = new Parse(input);
		System.out.println(gram.parseBarbarism());
		System.out.println(gram.parseGrammar());
	}
}