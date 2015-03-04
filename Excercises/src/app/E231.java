package app;

public class E231 {

	static double[] data = { 10.5, 10.8, 11.2, 10.9, 10.4, 10.6, 10.9, 11.0,
			10.3, 10.8, 10.6, 11.3, 10.5, 10.7, 10.8, 10.9, 10.8, 10.7, 10.9,
			11.0 };

	public static void main(String[] args) {
		System.out.println(m());
		System.out.println(D());
		System.out.println(sigma());
	}

	public static double m() {
		double sum = 0;
		for (double d : data) {
			sum += d;
		}
		return (sum / data.length);
	}

	public static double D() {
		double sum = 0;
		double m = m();
		for (double d : data) {
			sum += (d - m) * (d - m);
		}
		return (sum / (data.length - 1));
	}

	public static double sigma() {
		return Math.sqrt(D() / data.length);
	}

}
