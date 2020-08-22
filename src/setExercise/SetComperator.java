package setExercise;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetComperator {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(67);
		set1.add(90);
		set1.add(32);
		set1.add(20);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(2);
		set2.add(61);
		set2.add(90);
		set2.add(33);
		set2.add(24);
		set2.add(11);

		Iterator<Integer> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			int i =iter1.next();
			if(set2.contains(i)) {
				System.out.println(i);
			}
		}
		
	}

}
