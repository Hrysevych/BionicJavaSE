package app;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class DepoMonthCapitalizeTest {

	@Test
	public void test() {
		DepoMonthCapitalize depo = new DepoMonthCapitalize(1000, 15, 20,
				LocalDate.of(2013, 9, 8));
		assertEquals(8.22, depo.interest(), 1e-2);
	}

	@Test
	public void test1() {
		DepoMonthCapitalize depo = new DepoMonthCapitalize(1000, 15, 30,
				LocalDate.of(2013, 9, 8));
		assertEquals(12.36, depo.interest(), 1e-2);
	}

	@Test
	public void test2() {
		DepoMonthCapitalize depo = new DepoMonthCapitalize(1000, 15, 180,
				LocalDate.of(2014, 5, 1));
		assertEquals(76.32, depo.interest(), 1e-2);
	}

}
