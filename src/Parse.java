package src;
import java.util.Arrays;
public class Parse extends Gegram {
	protected boolean isMistake = false;
	protected String mistake = "";
	protected String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა", 
		"კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო", "ხარაშო",
		"იზვინი", "პაკა", "სასტავი", "ვოდკა", "პივა", "კრიშა", "უჟასი", "რემონტი", "მარშტრუტკა", "მარშუტკა", "სემიჩკა", "დუში", "ზმეიკა", "კრუგი",
		"სოსკა", "მაიკა", "პაკრიშკა", "ზაჟიგალკა", "პაჩკა"};
	protected String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი", 
		"სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "მოცელვა", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა", "კარგი",
	    "ბოდიში", "ნახვამდის", "შემადგენლობა", "არაყი", "ლუდი", "სახურავი", "საშინელება", "შეკეთება", "მიკროავტობუსი", "მიკროავტობუსი", "მზესუმზირა", "შხაპი", "ელვაშესაკრავი", "წრე",
	    "საწოვარა", "პერანგი", "საბურავი", "სანთებელა" , "შეკვრა"};
	protected String marks[] = {"მა", "ს", "ის", "ით", "ად", "ო"};
	public Parse() {

	}
	public Parse(String[] input) {
		super(input);
	}
	@Override
	public void parseBarbarism(boolean correctOrNot) {
		for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i] == c) {
					isMistake = true;
					mistake = c;
					System.out.println(c + " Detected");
					if(correctOrNot == true) System.out.println("Mistake fix: " + matchers[i]);
				}
				
				
			}
		}
		if(isMistake == false) System.out.println("No detections");
	}
}