package src;

public abstract class Gegram {
	protected String[] input;
	public Gegram() {

	}
	public Gegram(String[] input) {
		this.input = input;
	}
        public abstract String returnMatcher();
        public abstract int returnIndex(String[] data);
	    public abstract String parseBarbarism();
        public abstract String parseGrammar();
        public abstract boolean endConsonant(String data);
        public abstract boolean isVowel(String data);
        public abstract String formFirst(String data);
        public abstract String formSecond(String data);
        public abstract String formThird(String data);
        public abstract String formFourth(String data);
        public abstract String formFifth(String data);
        public abstract String formSixth(String data);
        public abstract String formSeventh(String data);
}