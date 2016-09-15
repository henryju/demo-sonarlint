package quizz;

import static java.util.Calendar.DAY_OF_MONTH;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@SuppressWarnings("squid:S106")
public class Quizz09 {

	private Quizz09() {
	}

	private static void sayMerryChristmas(Calendar c) {
		if (c.get(DAY_OF_MONTH) == 25 && c.get(Calendar.MONTH) == 12) {
			System.out.println("Merry Christmas!");
		}
	}

	public static void main(String[] args) throws ParseException {
		sayMerryChristmas(new GregorianCalendar(2014, 12, 25));

		Calendar c2 = Calendar.getInstance();
		c2.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2014"));
		sayMerryChristmas(c2);
	}
}
