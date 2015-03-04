package app;

public class E361 {

	public static void main(String[] args) {
		int sum = 0;

		for (String str : args) {
			try {
				sum += Integer.valueOf(str);
			} catch (NumberFormatException e) {
				System.out.println("Exception in input - " + e.getMessage());
			}
		}
		System.out.println("Sum of correct arguments = " + sum);
	}

}
