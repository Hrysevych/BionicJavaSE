package deposit;

import java.time.LocalDate;

public abstract class DepoBase {

	double sum;
	double interestRate;
	int term;
	LocalDate startDate;
	LocalDate finishDate;

	public DepoBase(double sum, double interestRate, int term,
			LocalDate startDate) {
		this.sum = sum;
		this.interestRate = interestRate;
		this.term = term;
		this.startDate = startDate;
		this.finishDate = startDate.plusDays(term);
	}

	abstract public double getInterestRate();

	public double getInterest(LocalDate startDate, int term) {
		double intSum;
		intSum = term * interestPerDay(startDate);
		return intSum;
	}

	public double interestPerDay(LocalDate date) {
		return (this.sum * (getInterestRate() / 100) * 1 / (date.isLeapYear() ? 366.
				: 365.));

	}

	abstract public double interest();
}
