package app;

import java.time.LocalDate;

public interface Deposit {
	public double interest();

	public double getInterestRate();
	public double interestPerDay(LocalDate date);
	
	public double getInterest(LocalDate startDate, int term);
}
