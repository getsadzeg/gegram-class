package src;
import java.util.Arrays;
public class Gegram {
	private String[] input;
	private boolean isMistake = false;
	private String mistake = "";
	private String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა", 
		"კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო", "ხარაშო",
		"იზვინი", "პაკა", "სასტავი", "ვოდკა", "პივა", "კრიშა", "უჟასი", "რემონტი", "მარშტრუტკა", "მარშუტკა", "სემიჩკა", "დუში", "ზმეიკა", "კრუგი",
		"სოსკა", "მაიკა", "პაკრიშკა", "ზაჟიგალკა", "პაჩკა"};
	private String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი", 
		"სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "მოცელვა", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა", "კარგი",
	    "ბოდიში", "ნახვამდის", "შემადგენლობა", "არაყი", "ლუდი", "სახურავი", "საშინელება", "შეკეთება", "მიკროავტობუსი", "მიკროავტობუსი", "მზესუმზირა", "შხაპი", "ელვაშესაკრავი", "წრე",
	    "საწოვარა", "პერანგი", "საბურავი", "სანთებელა" , "შეკვრა"};
	private String marks[] = {"მა", "ს", "ის", "ით", "ად", "ო"};
	public Gegram() {

	}
	public Gegram(String[] input) {
		this.input = input;
	}
	public void parse(boolean correctOrNot) {
		for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i] == c) {
					isMistake = true;
					mistake = c;
					System.out.println(c + " Detected");
					if(correctOrNot == true) System.out.println("Mistake fix: " + matchers[i]);
				}
				//word = barbarismes[i];
				
			}
		}
		if(isMistake == false) System.out.println("No detections");
	}
}