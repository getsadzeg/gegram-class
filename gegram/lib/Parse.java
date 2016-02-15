package gegram.lib;
import java.util.*;
import java.util.Map.Entry;
public class Parse extends Gegram {
	int index = 0;
	int matcherindex = 0;
	protected boolean isMistake = false;
	protected String Parsed = "";
	public Parse() {
            
	}
	public Parse(String[] input) {
	super(input);
        Data.dataInitialize();
        Data.grammarInitialize();
	}
        @Override
        public boolean endConsonant(String data) {
            switch(data.charAt(data.length()-1)) {
                case 'ა': 
                case 'ე':
		case 'ი':
                case 'ო':
                case 'უ':
                return false;
            }
            return true;
        }
	   @Override
	   public boolean isVowel(String data) {
	   	   if (data.length() < 5) return true;
		   switch(data.charAt(data.length()-1)) {
			   case 'ა':
			   case 'ე':
			   case 'ო':
			   case 'უ':
		           return true;
		   }
		   return false;

	   }
	    @Override
		public String formSecond(String data) {
			if(isVowel(data)) {
				return data + 'მ';
			}
			if(endConsonant(data)) return data + "მა";
			return data.substring(0, data.length()-1) + "მა";
		}
	   @Override
	   public String formThird(String data) {
		   if(isVowel(data)) return data + 'ს';
		   if(endConsonant(data)) return data + 'ს';
		   return data.substring(0, data.length()-1) + 'ს';
	   }
	   @Override
	   public String formFourth(String data) {
		   if(isVowel(data)) return data + "სი";
		   if(endConsonant(data)) return data + "ის";
		   return data.substring(0, data.length()-1) + "ის";
	   }
	   @Override
	   public String formFifth(String data) {
		   if(isVowel(data)) return data + "თი";
		   if(endConsonant(data)) return data + "ით";
		   return data.substring(0, data.length()-1) + "ით";
	   }
	   @Override
	   public String formSixth(String data) {
		   if(isVowel(data)) return data + 'დ';
		   if(endConsonant(data)) return data + "ად";
		   return data.substring(0, data.length()-1) + "ად";
	   }
	   @Override
	   public String formSeventh(String data) {
	   	   String newstring;
		   if(isVowel(data)) return data + 'ვ';
		   return data.substring(0, data.length()-1) + "ო";
	   }
	  /*@Override
	   public int returnIndex(String[] data) {
		   for(int i=0; i<data.length; i++) {
			   for(int j=0; j<Arrays.barbarismes.length; j++) {
				   if(data[i].equals(Arrays.barbarismes[j])) {
					   index = i;
					   matcherindex = j;
				   }
			   }
		   }
		   return index;
	   }
	 @Override
	 public String returnMatcher() { 
		 return Arrays[matcherindex]; 
	 }*/
	@Override
	public String parseBarbarism() {
                Iterator entries = Data.data.entrySet().iterator();
		        while(entries.hasNext()) {
                           Entry thisentry = (Entry)entries.next();
			   for(String c : input) {
                           String key = (String) thisentry.getKey();
                           String value = (String) thisentry.getValue();
				if(key.equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
                                         Parsed = value;
				}
				if(formSecond(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSecond(value);
				}
				if(formThird(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formThird(value);
				}
				if(formFourth(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formFourth(value);
				}
				if(formFifth(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formFifth(value);
				}
				if(formSixth(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSixth(value);
				}
				if(formSeventh(key).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSeventh(value);
				}
				
			}
		}
                
		if(!isMistake) return "no mistake";
                return Parsed;
	}
	@Override
	public String parseGrammar() {
        Iterator gramm = Data.grammarData.entrySet().iterator();
		while(gramm.hasNext())
			for(String c : input) {
                        Entry thisentry = (Entry)gramm.next();
                        String key = (String) thisentry.getKey();
                        String value = (String) thisentry.getValue();
				if(key.equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word:");
					Parsed = value;
				}
			}
                if(!isMistake) return "no mistake";
                return Parsed;
		}
		
	}
