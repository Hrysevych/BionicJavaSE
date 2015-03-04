package app;

public class E314 {

	final static int n = 1000;

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		System.out.println(time1);
		generateString(n);
		long time2 = System.nanoTime();
		long generateStringTimer = time2 - time1;
		System.out.println(generateStringTimer);
		time1 = System.nanoTime();
		System.out.println(time1);
		generateStringBuilder(n);
		time2 = System.nanoTime();
		long generateStringBuilderTimer = time2 - time1;
		System.out.println(generateStringBuilderTimer);
		double factor = (double) generateStringTimer
				/ generateStringBuilderTimer;
		System.out.println(factor);

	}

	public static String generateString(int n) {
		String ret = "1";
		for (int i = 2; i <= n; i++) {
			ret += " " + i;
		}
		return ret;
	}

	public static StringBuilder generateStringBuilder(int n) {
		StringBuilder ret = new StringBuilder("1");
		for (int i = 2; i <= n; i++) {
			ret.append(" ");
			ret.append(i);
		}
		return ret;
	}

}
