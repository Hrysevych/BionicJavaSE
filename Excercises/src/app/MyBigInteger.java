package app;

import java.math.BigInteger;

public class MyBigInteger {

	public static void main(String[] args) {
		for (int i = 1; i <= 25; i++) {
			System.out.println("i = " + i);
			System.out.println("long factorial 		- " + factorialLong(i));
			System.out.println("BigInteger factorial 	- " + factorialBigInteger(i));
			
		}
	}

	public static long factorialLong(int n) {
		long ret = 1;
		for (int i = 2; i <= n; i++) {
			ret *= i;
		}
		return ret;
	}
	
	public static BigInteger factorialBigInteger(int n) {
		BigInteger ret = BigInteger.valueOf(1);
		for (int i=2; i<=n; i++)
			ret = ret.multiply(BigInteger.valueOf(i));
		return ret;
	}
}
