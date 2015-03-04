package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class DictionaryTest {

	@Test
	public void test0() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("��������", dictionary.getTranslation("Save"));
	}

	@Test
	public void test1() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("��������", dictionary.getTranslation("Remove"));
	}

	@Test
	public void test2() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("�i��i����", dictionary.getTranslation("Cancel"));
	}

	@Test
	public void test3() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("��������", dictionary.getTranslation("Create"));
	}

	@Test
	public void test4() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("null", dictionary.getTranslation("OK"));
	}

	@Test
	public void test5() {
		Dictionary dictionary = new Dictionary();
		dictionary.initFromFile();
		assertEquals("asdf", dictionary.getTranslation("asdf"));
	}

}
