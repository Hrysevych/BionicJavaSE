package app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class E442{
	static Deposit[] depo = {
			new SimpleDepo(1000, 15, 20, LocalDate.of(2013, 9, 8)),
			new SimpleDepo(2500, 18, 20, LocalDate.of(2013, 9, 8)),
			new BarrierDepo(15000, 11.5, 40, LocalDate.of(2013, 9, 8)),
			new BarrierDepo(5000, 14, 80, LocalDate.of(2013, 9, 8)),
			new DepoMonthCapitalize(2000, 16.5, 180, LocalDate.of(2013, 9, 8)),
			new DepoMonthCapitalize(40000, 12.1, 91, LocalDate.of(2013, 9, 8)) };

	public static void main(String[] args) {
		saveDepo();
		double sum = 0;
		for (Deposit depoBase : depo) {
			sum += depoBase.interest();
		}
		System.out.println(sum);
	}

	static void saveDepo() {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("deposits.dat"));) {

			for (Deposit depoBase : depo) {
				out.writeObject(depoBase);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
