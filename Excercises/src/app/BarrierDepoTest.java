package app;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class BarrierDepoTest {

	@Test
	public void test() {
		BarrierDepo depo = new BarrierDepo(1000, 15, 20, LocalDate.of(2012, 9, 8));
		assertEquals(8.2, depo.interest(), 0);
	}
	@Test
	public void test1() {
		BarrierDepo depo = new BarrierDepo(60000, 15, 30, LocalDate.of(2012, 9, 8));
		assertEquals(786.89, depo.interest(), 0);
	}
	@Test
	public void test2() {
		BarrierDepo depo = new BarrierDepo(60000, 15, 30, LocalDate.of(2014, 2, 8));
		assertEquals(789.04, depo.interest(), 0);
	}
	@Test
	public void test3() {
		BarrierDepo depo = new BarrierDepo(100001, 15, 180, LocalDate.of(2014, 5, 12));
		assertEquals(8383.65, depo.interest(), 0);
	}

}
