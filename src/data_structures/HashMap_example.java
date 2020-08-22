package data_structures;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_example {

	public static void main(String[] args) {
		HashMap<String,String> hmap = new HashMap<String,String>();
		
		//Adding elements to hmap
		hmap.put("012554433", "Chaitanya");
		hmap.put("002554433", "Rahul");
		hmap.put("007554433", "Singh");
		
		//Get value based on key
		String var = hmap.get("007554433");
		System.out.println("Person with ID 007554433 is: " + var); //will print Rahul to console
		
		//Remove values based on key
		hmap.remove("007554433"); //will remove key,value pair from map Rahul to console
		
		Set<?> set = hmap.entrySet();
		Iterator<?> iterator = set.iterator();
		while(iterator.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
		}

	}

}
