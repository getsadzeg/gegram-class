import java.util.Arrays;
public class Exceptions {
	public static void main(String[] args) {
		String input[] = {"მე", "მჯერავს", "სიყვარული"};
		String exceptions[] = {"ბრძოლობდა", "მჯერავს", "შეურაწყოფა", "შეურაცყოფა"};
		boolean isMistake = false;
		for(int i=0; i<input.length; i++) {
			for(String c : exceptions) {
				if(input[i] == c) {
					isMistake = true;
					System.out.println(c + "Detected");
				}
			}
		}
		if(isMistake == false) System.out.println("No detections");
	}

}