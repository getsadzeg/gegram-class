public class fixQuantities {
	public static void main(String[] args) {
		String input[] = {"იქ", "ვიღაცეები", "დგანან"};
		String exceptions[] = {"ვიღაცეები", "რაღაცეები"};
		boolean isMistake = false;
		boolean isLoop = false;
		for(int i=0; i<input.length; i++) {
				if(input[i] == exceptions[0] || input[i] == exceptions[1]) isMistake = true;
				while(isMistake == true) {
					System.out.println(isMistake);
					break;
				}
				if(isMistake == true) break;
			}
			if(isMistake == false) System.out.println(isMistake);
	}
}