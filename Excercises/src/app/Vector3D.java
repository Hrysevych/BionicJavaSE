package app;

public class Vector3D {
	/**
	 * first vector's number
	 */
	double x;
	/**
	 * second vector's number
	 */
	double y;
	/**
	 * third vector's number
	 */
	double z;

	/**
	 * Main constructor
	 */
	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Default constructor equals Vector3D(0, 0, 0);
	 */
	public Vector3D() {
		this(0, 0, 0);
	}

	/**
	 * method to add vector
	 * 
	 * @param v
	 *            - second vector
	 * @return resulting vector
	 */
	public Vector3D add(Vector3D v) {
		double ix = x + v.x;
		double iy = y + v.y;
		double iz = z + v.z;
		return new Vector3D(ix, iy, iz);
	}

	/**
	 * method to multiply vectors scalar
	 * 
	 * @param v
	 *            - second vector
	 * @return resulting vector
	 */
	public double scalarProduct(Vector3D v) {
		double ix = x * v.x;
		double iy = y * v.y;
		double iz = z * v.z;
		return ix + iy + iz;
	}

	/**
	 * method to multiply vectors
	 * 
	 * @param v
	 *            - second vector
	 * @return resulting vector
	 */
	public Vector3D vectorProduct(Vector3D v) {
		double ix = y * v.z - z * v.y;
		double iy = z * v.x - x * v.z;
		double iz = x * v.y - y * v.x;
		return new Vector3D(ix, iy, iz);
	}

	/**
	 * method to find vector's module
	 * 
	 * @return module value
	 */
	public double module() {
		return Math.sqrt(x * x + y * y + z * z);
	}

	/**
	 * method to return vector in readable form
	 */
	public String toString() {
		return "" + x + "; " + y + "; " + z;
	}

	/**
	 * method to check vectors equality
	 * 
	 * @param v
	 *            - second vector
	 * @return vectors equality
	 */
	public boolean equals(Vector3D v) {
		return ((x == v.x) && (y == v.y) && (z == v.z));
	}
}