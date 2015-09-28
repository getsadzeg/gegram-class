public class endingFix {
	public static void main(String []args) {
		String input[] = {"დღეს", "წიგნი", "არ", "წამიკითხია"};
		boolean isMistake = false;
		String lastWord;
		String fixedWord;
		char lastChar;
		char beforeLast;
		for(int i=0; i<input.length; i++) {
			lastWord = input[input.length-1];
			System.out.println(lastWord);
			lastChar = lastWord.charAt(lastWord.length()-1);
			beforeLast = lastWord.charAt(lastWord.length()-2);
			if(lastChar == 'ა' && beforeLast == 'ი') isMistake = true;
			System.out.println(isMistake);
			break;
			//if(lastWord.charAt(lastWord.length()-1) == 'ა' && lastWord.charAt(lastWord.length()-2) == 'ი') isMistake == true;
		}
	}
}