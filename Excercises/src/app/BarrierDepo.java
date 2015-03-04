package app;

import java.time.LocalDate;

public class BarrierDepo extends DepoBase implements Deposit{

	public BarrierDepo(double sum, double interestRate, int term,
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
	
	@Override
	public double getInterestRate(){
		if (sum > 100000)
			return interestRate +2;
		else if (sum > 50000)
			return interestRate +1;
		return interestRate;
	}
	
	public double interestPerDay(LocalDate date) {
		return (this.sum * (getInterestRate() / 100) * 1 / (date.isLeapYear() ? 366.
				: 365.));
	}
	
	public double getInterest(LocalDate startDate, int term) {
		double intSum;
		intSum = term * interestPerDay(startDate);
		return intSum;
	}

}
