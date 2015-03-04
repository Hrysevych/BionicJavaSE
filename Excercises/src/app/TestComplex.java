package app;

public class TestComplex {
	public static void main(String[] args) {
		Complex test1 = new Complex();
		test1.setReal(3);
		test1.setImaginary(4);
		if (test1.getModule() == 5.0) {
			System.out.println("test passed");
		} else
			System.out.println("test failed");
	}
}
