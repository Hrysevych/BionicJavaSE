package app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDepo {

	ArrayList<DepoBase> depos = new ArrayList<DepoBase>();

	public void init() {
		depos.add(new SimpleDepo(2500, 18, 61, LocalDate.of(2013, 9, 8)));
		depos.add(new DepoMonthCapitalize(10000, 21, 181, LocalDate.of(2012, 2,
				1)));
		depos.add(new SimpleDepo(5500, 15.3, 30, LocalDate.of(2013, 11, 12)));
		depos.add(new BarrierDepo(43000, 19.56, 370, LocalDate.of(2011, 12, 18)));
		depos.add(new DepoMonthCapitalize(12000, 16, 91, LocalDate.of(2013, 07,
				12)));


		ArrayList<DepoBase> list = depos;
		double sum = list.stream().mapToDouble(DepoBase::getSum)
				.reduce(0, (a, b) -> a + b);
		System.out.println("General sum = " + sum);


	}

	public ArrayList<DepoBase> getList() {
		return depos;
	}

	public double getPrincipal() {
		double sum = 0;
		for (int i = 0; i < depos.size(); i++) {
			sum += depos.get(i).sum;
		}

		return sum;
	}

	public void remove() {
		for (Iterator<DepoBase> iterator = depos.iterator(); iterator.hasNext();) {
			if (iterator.next().sum < 10000)
				iterator.remove();
		}
	}

}
