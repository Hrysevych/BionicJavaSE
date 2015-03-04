package app;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepoMonthCapitalize extends DepoBase implements Deposit {

	public DepoMonthCapitalize(double sum, double interestRate, int term,
			LocalDate startDate) {
		super(sum, interestRate, term, startDate);

	}

	public double interestTest() {

		return 0;
	}

	public double interest() {
		double tempSum = sum;
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
		sum = tempSum;
		return Math.round(interest * 100) / 100.;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public double interestPerDay(LocalDate date) {
		return (this.sum * (getInterestRate() / 100) * 1 / (date.isLeapYear() ? 366.
				: 365.));
	}

	@Override
	public double getInterest(LocalDate startDate, int term) {
		double intSum;
		intSum = term * interestPerDay(startDate);
		return intSum;
	}

}
