package gegram.lib;
import java.util.HashMap;
public class Data {
	public static String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა",
	                                            "კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო", "ხარაშო",
	                                            "იზვინი", "პაკა", "სასტავი", "ვოდკა", "პივა", "კრიშა", "უჟასი", "რემონტი", "მარშტრუტკა", "მარშუტკა", "სემიჩკა", "დუში", "ზმეიკა", "კრუგი",
	                                            "სოსკა", "მაიკა", "პაკრიშკა", "ზაჟიგალკა", "პაჩკა", "ოკ"
	                                           };
	public static String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი",
	                                         "სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "მოცელვა", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა", "კარგი",
	                                         "ბოდიში", "ნახვამდის", "შემადგენლობა", "არაყი", "ლუდი", "სახურავი", "საშინელება", "შეკეთება", "მიკროავტობუსი", "მიკროავტობუსი", "მზესუმზირა", "შხაპი", "ელვაშესაკრავი", "წრე",
	                                         "საწოვარა", "პერანგი", "საბურავი", "სანთებელა" , "შეკვრა", "კარგი"
	                                        };
	public static String mistakeData[] = {"ბრძოლობდა", "მჯერავს", "შეურაწყოფა", "შეურაცყოფა", "ნაყურები"};
	public static String fixesData[] = {"იბრძოდა", "მჯერა", "შეურაცხყოფა", "შეურაცხყოფა", "ნანახი"};
	public final static HashMap data = new HashMap<String, String>();
	public final static HashMap grammarData = new HashMap<String, String>();
	public static void dataInitialize() {
		for (int i = 0; i < barbarismes.length; i++) {
			data.put(barbarismes[i], matchers[i]);
		}
		barbarismes = null;
		matchers = null;
	}
	public static void grammarInitialize() {
		for (int i = 0; i < mistakeData.length; i++) {
			grammarData.put(mistakeData[i], fixesData[i]);
		}
		mistakeData = null;
		fixesData = null;
	}
	public static boolean getBoolean() {
		return barbarismes.length == matchers.length;
	}
}