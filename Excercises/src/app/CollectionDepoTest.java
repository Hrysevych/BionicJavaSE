package app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CollectionDepoTest {

	@Test
	public void test() {
		CollectionDepo collectionDepo = new CollectionDepo();
		collectionDepo.init();
		collectionDepo.remove();
		assertEquals(65000, collectionDepo.getPrincipal(), 1e-2);
		}

}
