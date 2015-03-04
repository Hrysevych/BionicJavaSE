package app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class E331 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy",Locale.GERMAN);
		System.out.println("NOW " + format.format(calendar.getTime()));
		calendar.add(Calendar.WEEK_OF_YEAR, 6);
		System.out.println("IN 6 WEEKS " + format.format(calendar.getTime()));
		calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -4);
		System.out.println("BEFORE 4 MONTHS "
				+ format.format(calendar.getTime()));
		calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 45);
		System.out.println("IN 45 DAYS " + format.format(calendar.getTime()));
		
	}

}
