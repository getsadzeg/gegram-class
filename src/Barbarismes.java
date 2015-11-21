import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Barbarismes {
	public static void main(String[] args) {
		String input[] = {"რონის", "პიცას", "ძალიან", "კარგი", "სერვისი", "აქვს"};
		String barbarismes[] = {"ნასკი", "სერვისი", "პროსტა", "პროსტო", "შკაფი", "გარდერობი", "ბრატ", "ბრაკი", "შნუროკი", "ნაუშნიკი", "ნაოშნიკი", "კაროჩე", "კარტა", 
		"კუხნა", "პოლი", "სპიჩკა", "ვაფშე", "რაკოვინა", "ლუსტრა", "შლაგბაუმი", "კარტოშკა", "პადვალი", "პატკატი", "ტუშონკა", "გრეჩიხა", "სუპი", "ვსო", "ვსიო", "ხარაშო",
		"იზვინი", "პაკა", "სასტავი", "ვოდკა", "პივა", "კრიშა", "უჟასი", "რემონტი", "მარშტრუტკა", "მარშუტკა", "სემიჩკა", "დუში", "ზმეიკა", "კრუგი",
		"სოსკა", "მაიკა", "პაკრიშკა", "ზაჟიგალკა", "პაჩკა"};
		String matchers[] = {"წინდა", "მომსახურება", "უბრალოდ", "უბრალოდ", "კარადა", "კარადა", "ძმაო", "ხარვეზიანი", "თასმა", "ყურსასმენი", "ყურსასმენი", "მოკლედ", "ბარათი", 
		"სამზარეულო", "იატაკი", "ასანთი", "საერთოდ", "ნიჟარა", "ნათურა", "", "კარტოფილი", "სარდაფი", "მოცელვა", "", "წიწიბურა", "წვნიანი", "მორჩა", "მორჩა", "კარგი",
	    "ბოდიში", "ნახვამდის", "შემადგენლობა", "არაყი", "ლუდი", "სახურავი", "საშინელება", "შეკეთება", "მიკროავტობუსი", "მიკროავტობუსი", "მზესუმზირა", "შხაპი", "ელვაშესაკრავი", "წრე",
	    "საწოვარა", "პერანგი", "საბურავი", "სანთებელა" , "შეკვრა"};
	    String marks[] = {"მა", "ს", "ის", "ით", "ად", "ო"};
	    String secondmarks[] = {"მ", "ს", "ის", "ით", "ად", ""};
		boolean isMistake = false;
		String[] arr;
		String mistake = "";
		 for(int i=0; i<barbarismes.length; i++) {
			for(String c : input) {
				if(barbarismes[i] == c) {
					isMistake = true;
					mistake = c;
					System.out.println(c + " Detected");
					System.out.println("Mistake fix: " + matchers[i]);
				}
				//word = barbarismes[i];
				
			}
		}
		if(isMistake == false) System.out.println("No detections");
		arr = mistake.split("");
				//System.out.println(arr[arr.length-1]);
				/*for(int i=0; i<arr.length; i++) {
					System.out.println(arr[i]);
				}*/
				for(int i=0; i<barbarismes.length; i++) {
				for(int j=0; j<marks.length; j++) {
				if(arr[arr.length-1].equals("ი")) {
				     ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
				     list.remove(arr.length-1);
				     list.add(marks[j]);
				     for(String s : list) {
				     	for(String c: input) {
				     	//System.out.println(s);
				     	if(s == c) System.out.println(true);
				     }
				 }
				     //arr = list.toArray(new String[0]);
				}
			}
		}
			//System.out.println(Arrays.toString(arr));
	}
}