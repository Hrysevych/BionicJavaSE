package app;

import java.time.LocalDate;
import java.util.Comparator;


public abstract class DepoBase implements Comparable<DepoBase>{

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

	abstract public double interest();

	public int compareTo(DepoBase depoBase) {
		if ((this.interest() > depoBase.interest())) {
			return 1;
		} else if ((this.interest() < depoBase.interest())) {
			return -1;
		}
		return 0;
	}
	
	public double getSum() {
		return sum;
	}

	public static class ComparatorSum implements Comparator<DepoBase>{
		/**
		 * 
		 * @param depoBase1 - first object
		 * @param depoBase2 - 
		 * @return
		 */
		public int compare(DepoBase depoBase1,DepoBase depoBase2) {
			if (depoBase1.sum > depoBase2.sum) return 1;
			if (depoBase1.sum < depoBase2.sum) return -1;
			return 0;
		}
	}
}
