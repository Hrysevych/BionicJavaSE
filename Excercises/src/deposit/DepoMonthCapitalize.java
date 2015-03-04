package deposit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepoMonthCapitalize extends DepoBase {

	public DepoMonthCapitalize(double sum, double interestRate, int term,
			LocalDate startDate) {
		super(sum, interestRate, term, startDate);

	}

	public double interestTest() {

		return 0;
	}

	public double interest() {
		LocalDate monthStart = startDate;
		int monthTerm;
		double interest = 0;
		while (monthStart.isBefore(finishDate)) {
			if (monthStart.getMonth() == finishDate.getMonth())
				monthTerm = (int) monthStart.until(finishDate, ChronoUnit.DAYS);
			else
				monthTerm = monthStart.lengthOfMonth()
						- monthStart.getDayOfMonth() + 1;
			double monthInterest = getInterest(monthStart, monthTerm);
			interest += monthInterest;
			sum += monthInterest;
			monthStart = LocalDate.of(monthStart.getYear(),
					monthStart.getMonth(), 1);
			monthStart = monthStart.plusMonths(1);
		}
		return interest;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
