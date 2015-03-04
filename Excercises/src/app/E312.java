package app;

public class E312 {

	public static void main(String[] args) {
		if (args.length > 0)
			for (int i = 0; i < args.length; i += 2)
				System.out.print(args[i] + " ");
		else
			System.out.println("No args!");
	}
}
