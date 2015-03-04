package app;

import java.time.*;
import java.util.Calendar;

public class E332 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 2);
		getNextBankDay(c);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getTime());

	}

	public static LocalDate getNextBankDayTime(LocalDate date) {
		switch (date.getDayOfWeek()) {
		case FRIDAY:
			return (date.plusDays(3));
		case SATURDAY:
			return (date.plusDays(2));
		default:
			return (date.plusDays(1));
		}
	}

	public static Calendar getNextBankDay(Calendar c) {
		switch (c.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.FRIDAY:
			c.add(Calendar.DAY_OF_YEAR, 3);
			return c;
		case Calendar.SATURDAY:
			c.add(Calendar.DAY_OF_YEAR, 2);
			return c;
		default:
			c.add(Calendar.DAY_OF_YEAR, 1);
			return c;
		}

	}

}
