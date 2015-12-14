package src;
import java.util.Arrays;
public class Parse extends Gegram {
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
	protected String marks[] = {"მა", "ს", "ის", "ით", "ად", "ო"};
	protected String mistakeData[] = {"ბრძოლობდა", "მჯერავს", "შეურაწყოფა", "შეურაცყოფა", "ნაყურები"};
	protected String fixesData[] = {"იბრძოდა", "მჯერა", "შეურაცხყოფა", "შეურაცხყოფა", "ნანახი"};
	public Parse() {

	}
	public Parse(String[] input) {
		super(input);
	}
        @Override
        public boolean isConsonant(String data) {
            switch(data.charAt(data.length()-1)) {
                case 'ა': 
                case 'ე':
                case 'ო':
                case 'უ':
                return false;
            }
            return true;
        }
        @Override
        public String formFirst(String data) {
            if(isConsonant(data)) return data + "ი";
            return data;
        }
	@Override
	public String parseBarbarism() {
		for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i] == c) {
					isMistake = true;
					System.out.println(c + " Detected. Parsed word");
                                        Parsed = matchers[i];
                                        
				}
				
				
			}
		}
		if(isMistake == false) return "";
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