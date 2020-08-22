package date_and_time;
import java.time.LocalDate;
//import java.time.LocalDateTime;

public class AddWeek {

	public static void main(String[] args) {
		LocalDate weekLater = LocalDate.now().plusWeeks(1);
		System.out.println(weekLater);

	}

}
