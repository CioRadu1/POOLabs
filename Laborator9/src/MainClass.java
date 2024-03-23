import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap; 
public class MainClass {

	public static void main(String[] args) {
		
		List <String> cars = new ArrayList<String>(); 
		cars.add("Dacia");
		cars.add("Renault");
		cars.add("Vanilie");
		ListIterator carsIt = cars.listIterator();
		for(String e : cars) {
			if(e.equals("Dacia")) {
				e = "Ford";
			}
		}
		System.out.println(cars);
		
		while(carsIt.hasNext()) {
			if(carsIt.next().equals("Dacia")) { 
				carsIt.set("Ford");
			}
		}

		for(int i = 0; i < cars.size();i++) {
			if(cars.get(i).equals("Vanilie")) {
				cars.set(i, "Mazda");
			}
		}
		System.out.println(cars);
		
		
		String[] chat = {"Buna", "Bine", "ce", "mai","faci"}; 
		Map <String, Integer> map = new TreeMap<String, Integer>();  
		
		for(int i = 0; i < chat.length; i++) {
			if(map.containsKey(chat[i])) {
				int l = map.get(chat[i]);
				map.put(chat[i], l + 1);
				
			}
			else {
				map.put(chat[i], 1);
			}
		}
		
		/*
		 * for(Map.Entry<String, Integer> entry : map.entrySet()) {
		 * 
		 * System.out.println(entry.getKey() + " " + entry.getValue()); }
		 */
		System.out.println(map);
		
		
	}

}
