public class fixQuantities {
	public static void main(String[] args) {
		String input[] = {"იქ", "ვიღაცეები", "დგანან"};
		String exceptions[] = {"ვიღაცეები", "რაღაცეები"};
		boolean isMistake = false;
		String toFix = null;
		for(int i=0; i<input.length; i++) {
				if(input[i] == exceptions[0] || input[i] == exceptions[1]) {
					isMistake = true;
					if(input[i] == "ვიღაცეები") toFix = "'ვიღაცები'";
					else if(input[i] == "რაღაცეები") toFix = "'რაღაცები'";
				}
				while(isMistake == true) {
					System.out.println(isMistake);
					break;
				}
				if(isMistake == true) {
					break;

				}
			}
			if(isMistake == false) System.out.println(isMistake);
			System.out.println("Mistake fix: " + toFix);
	}
}