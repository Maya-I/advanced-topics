package data_structures;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map_excercise {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(13, "Gorilla");
		hmap.put(57, "Elephant");
		hmap.put(60, "Horse");
		hmap.put(28, "Panda");
		hmap.put(63, "Jaguar");
		Set<Integer> set = hmap.keySet();
		
		int i = 0;
		Iterator<Integer> iter= set.iterator();
		while(iter.hasNext()) {
			int j = iter.next();
			if(j > i) {
				i=j;
			}
	
		}
		System.out.println("("+ i + ", " + hmap.get(i) + ")");

	}

}
