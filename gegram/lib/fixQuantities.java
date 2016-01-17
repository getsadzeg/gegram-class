package gegram.lib;

public class fixQuantities {
	public static void main(String[] args) {
		String input[] = {"იქ", "ბევრები", "არიან"};
		String mistakes[] = {"ვიღაცეები", "რაღაცეები", "ხალხები", "ბევრები", "ცოტები"};
		String fixes[] = {"ვიღაცები", "რაღაცები", "ხალხი", "ბევრი", "ცოტა"};
		boolean isMistake = false;
		for(int i=0; i<mistakes.length; i++) {
				for(String c : input) {
					if(mistakes[i] == c) {
						isMistake = true;
						System.out.println(c + " Detected");
						System.out.println("Mistake fix: " + fixes[i]);
					}
				}
			}
			if(isMistake == false) System.out.println("No detections");
	}
}