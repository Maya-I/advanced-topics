package date_and_time;
import java.util.Calendar;
import java.util.Date;

public class PuzzleGame {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		c.setTime(new Date());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); //Prints month (start counting at 0).
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); 
	}

}
