package deposit;

import java.time.LocalDate;

public class SimpleDepo extends DepoBase{

	
	public SimpleDepo(double sum, double interestRate, int term,
			LocalDate startDate) {
		super(sum, interestRate, term, startDate);

	}

	public double interest() {
		double sum;
		if (!(startDate.getYear() == finishDate.getYear())) {
			int startTerm = (startDate.isLeapYear() ? 366 : 365)
					- startDate.getDayOfYear();
			double startSum = getInterest(startDate, startTerm);
			int finishTerm = finishDate.getDayOfYear();
			double finishSum = getInterest(
					LocalDate.of(finishDate.getYear(), 1, 1), finishTerm);
			sum = startSum + finishSum;
		} else {
			sum = getInterest(startDate, term);
		}
		return (Math.round(sum * 100)) / 100.;
	}

	public double getInterestRate() {
		return interestRate;
	}


}
