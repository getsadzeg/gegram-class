package src;
public class Parse extends Gegram {
	int index = 0;
	int matcherindex = 0;
	protected boolean isMistake = false;
	protected String Parsed = "";
	protected String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა",
		"კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო", "ხარაშო",
		"იზვინი", "პაკა", "სასტავი", "ვოდკა", "პივა", "კრიშა", "უჟასი", "რემონტი", "მარშტრუტკა", "მარშუტკა", "სემიჩკა", "დუში", "ზმეიკა", "კრუგი",
		"სოსკა", "მაიკა", "პაკრიშკა", "ზაჟიგალკა", "პაჩკა"};
	protected String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი", 
		"სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "მოცელვა", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა", "კარგი",
	    "ბოდიში", "ნახვამდის", "შემადგენლობა", "არაყი", "ლუდი", "სახურავი", "საშინელება", "შეკეთება", "მიკროავტობუსი", "მიკროავტობუსი", "მზესუმზირა", "შხაპი", "ელვაშესაკრავი", "წრე",
	    "საწოვარა", "პერანგი", "საბურავი", "სანთებელა" , "შეკვრა"};
	protected String mistakeData[] = {"ბრძოლობდა", "მჯერავს", "შეურაწყოფა", "შეურაცყოფა", "ნაყურები"};
	protected String fixesData[] = {"იბრძოდა", "მჯერა", "შეურაცხყოფა", "შეურაცხყოფა", "ნანახი"};
	public Parse() {

	}
	public Parse(String[] input) {
		super(input);
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
        public String formFirst(String data) {
            if(endConsonant(data)) return data + "ი";
            return data;
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
		   if(isVowel(data)) return data;
		   if(endConsonant(data)) return data;
		   return data.substring(0, data.length()-1);
	   }
	  @Override
	   public int returnIndex(String[] data) {
		   for(int i=0; i<data.length; i++) {
			   for(int j=0; j<barbarismes.length; j++) {
				   if(data[i].equals(barbarismes[j])) {
					   index = i;
					   matcherindex = j;
				   }
			   }
		   }
		   return index;
	   }
	 @Override
	 public String returnMatcher() {
		 return matchers[matcherindex];
	 }
	@Override
	public String parseBarbarism() {
		for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i].equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
                                        Parsed = matchers[i];

				}
				if(formSecond(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSecond(matchers[i]);
				}
				if(formThird(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formThird(matchers[i]);
				}
				if(formFourth(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formFourth(matchers[i]);
				}
				if(formFifth(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formFifth(matchers[i]);
				}
				if(formSixth(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSixth(matchers[i]);
				}
				System.out.println(formSeventh(barbarismes[i]));
				if(formSeventh(barbarismes[i]).equals(c)) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
					Parsed = formSeventh(matchers[i]);
				}
				
			}
		}
		if(isMistake == false) return "no mistake";
                return Parsed;
	}
	@Override
	public String parseGrammar() {
		for(int i=0; i<mistakeData.length; i++) {
			for(String c : input) {
				if(mistakeData[i] == c) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word:");
					Parsed = fixesData[i];
				}
			}
		}
		if(isMistake == false) return "";
                return Parsed;
	}
}