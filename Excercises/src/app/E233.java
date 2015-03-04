package app;

import java.util.Arrays;

public class E233 {

	final static int x = 1;
	static double[] row = new double[1000];
	

	public static void main(String[] args) {
		fillArray();
		System.out.println(sumArray());
//		double myRes = sum();
		double sysRes = Math.exp(x);
//		System.out.println("x value is " + x);
//		System.out.println("sum result is " + myRes);
		System.out.println("Math.exp(x) result is " + sysRes);
		System.out.println("Difference is " + Math.abs(sumArray() - sysRes));
	}

	public static double sum() {
		double sum = 1;
		int n = 1;
		while (!(rowMember(n) == 0)) {
			sum += rowMember(n);
			n++;
		}
		System.out.println("Number of iterations is " + n);
		return sum;
	}

	public static double rowMember(int n) {
		if (n == 1) {
			return x;
		}
		return rowMember(n - 1) * x / n;
	}
	
	public static void fillArray() {
		int n=1;
		while (!(rowMember(n) == 0)) {
			row[n-1] = rowMember(n);
			n++;
		}
//		for(; n<=row.length; n++)
//			row[n-1] = 0;
	}
	
	public static double sumArray() {
		Arrays.sort(row);
		double sum=1;
		for(double d:row) {
			sum+=d;
		}
		return sum;
	} 
}
