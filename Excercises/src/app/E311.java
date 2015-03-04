package app;

public class E311 {

	public static void main(String[] args) {
		String myName = "Hrysevych Roman Yuoriyovuch";
		String[] nameArray = myName.split(" ");
		System.out.println(nameArray[0] + " " +nameArray[1].charAt(0) + "." +
				nameArray[2].charAt(0) + ".");

	}

}
