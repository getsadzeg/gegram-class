package gegram;
import gegram.lib.*;

public class Runner {
	public static void main(String[] args) {
		String[] input = {"ამ", "სერვისმა", "შემიკლა"};
		Gegram gram = new Parse(input);
		System.out.println(gram.parseBarbarism());
		//System.out.println(gram.parseGrammar());
	}
}