package app;

import static org.junit.Assert.*;

import java.time.LocalDate;
import org.junit.Test;

public class SimpleDepoTest {

	@Test
	public void test() {
		SimpleDepo depo = new SimpleDepo(1000, 15, 20, LocalDate.of(2012, 9, 8));
		assertEquals(8.2, depo.interest(), 0);
	}
	@Test
	public void test1() {
		SimpleDepo depo = new SimpleDepo(1000, 15, 180, LocalDate.of(2012, 9, 8));
		assertEquals(73.84, depo.interest(), 0);
	}
	@Test
	public void test2() {
		SimpleDepo depo = new SimpleDepo(1000, 15, 20, LocalDate.of(2014, 9, 8));
		assertEquals(8.22, depo.interest(), 0);
	}
	@Test
	public void test3() {
		SimpleDepo depo = new SimpleDepo(1000, 15, 180, LocalDate.of(2014, 9, 8));
		assertEquals(73.97, depo.interest(), 0);
	}
}
