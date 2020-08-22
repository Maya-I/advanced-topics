package date_and_time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class NewYork {
	
	public static void main(String[] args) {
		Date today = new Date();	
		SimpleDateFormat ny = new SimpleDateFormat("dd/MM/yyy HH:mm:ss:SS");
		ny.setTimeZone(TimeZone.getTimeZone("EST"));
		System.out.println(ny.format(today));
		
		}
}
