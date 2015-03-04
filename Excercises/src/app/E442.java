package app;

import java.time.LocalDate;



public class E442 {

	
	public static void main(String[] args) {
		
		Deposit [] depo = {
				new SimpleDepo(1000, 15, 20, LocalDate.of(2013, 9, 8)),
				new SimpleDepo(2500, 18, 20, LocalDate.of(2013, 9, 8)),
				new BarrierDepo(15000, 11.5, 40, LocalDate.of(2013, 9, 8)),
				new BarrierDepo(5000, 14, 80, LocalDate.of(2013, 9, 8)),
				new DepoMonthCapitalize(2000, 16.5, 180, LocalDate.of(2013, 9, 8)),
				new DepoMonthCapitalize(40000, 12.1, 91, LocalDate.of(2013, 9, 8))
		};
		double sum = 0;
		for (Deposit depoBase : depo) {
			sum += depoBase.interest();
		}
		System.out.println(sum);
	}

}
