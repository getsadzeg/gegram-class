import java.util.Arrays;
public class Barbarismes {
	public static void main(String[] args) {
		String input[] = {"რონის", "პიცას", "ძალიან", "კარგი", "სერვისი", "აქვს"};
		String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა", 
		"კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო"};
		String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი", 
		"სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა"};
		boolean isMistake = false;
		 for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i] == c) {
					isMistake = true;
					System.out.println(c + " Detected");
					System.out.println("Mistake fix: " + matchers[i]);
				}
			}
		}
		if(isMistake == false) System.out.println("No detections");
	}
}