package app;

/**
 * Represents complex number
 */

public class Complex {
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	/**
	 * factor of natural part
	 */
	private double real;
	/**
	 * factor of imaginary part
	 */
	private double imaginary;

	/**
	 * Main constructor a - factor of natural part; b - factor of imaginary part
	 */
	public Complex(double a, double b) {
		this.real = a;
		this.imaginary = b;
	}

	public Complex(Complex c) {
		this(c.real, c.imaginary);
	}

	public Complex(double d) {
		this(d, 0);
	}

	/**
	 * Default constructor a - factor of natural part - sets to 0; b - factor of
	 * imaginary part - sets to 0
	 */
	public Complex() {
		this(0, 0);
	}

	/**
	 * Method for adding two Complex numbers, answer is of Complex class
	 */
	public static Complex add(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real + c2.real;
		c.imaginary = c1.imaginary + c2.imaginary;
		return c;
	}

	public Complex add(Complex c) {
		return Complex.add(this, c);
	}

	public Complex multiply(Complex c) {
		return Complex.multiply(this, c);
	}

	/**
	 * Method for multiplying two Complex numbers, answer is of Complex class
	 */
	public static Complex multiply(Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = (c1.real * c2.real - c1.imaginary * c2.imaginary);
		c.imaginary = (c1.real * c2.imaginary + c2.real * c1.imaginary);
		return c;
	}

	/**
	 * Method for getting absolute value of Complex number, answer is of Complex
	 * class
	 */
	public double getModule() {
		return Math.sqrt(this.real * this.real + this.imaginary
				* this.imaginary);
	}

	/**
	 * Method for formatting Complex number for output in String
	 */
	public String toString() {
		return real + " + i * " + imaginary;
	}

}
