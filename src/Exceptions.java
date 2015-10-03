import java.util.Arrays;
public class Exceptions {
	public static void main(String[] args) {
		String input[] = {"მე", "მჯერავს", "საქართველოს", "გაბრწყინების"};
		String exceptions[] = {"ბრძოლობდა", "მჯერავს", "შეურაწყოფა", "შეურაცყოფა", "ნაყურები"};
		String fixes[] = {"იბრძოდა", "მჯერა", "შეურაცხყოფა", "შეურაცხყოფა", "ნანახი"};
		boolean isMistake = false;
		for(int i=0; i<exceptions.length; i++) {
			for(String c : input) {
				if(exceptions[i] == c) {
					isMistake = true;
					System.out.println(c + " Detected");
					System.out.println("Mistake fix: " + fixes[i]);
				}
			}
		}
		if(isMistake == false) System.out.println("No detections");
	}
}