package tp4Jva;

public class Point3D extends Point2D{
	private float z;
	
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z =z;
	}
	public Point3D() {
		z =0.0f;
	}
	public float getz() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	public void setXYZ(float x, float y, float z) {
		setX(x);
		setY(y);
		this.z=z;
	}
	public float[] getXYZ() {
		 float[] result = new float[3];  // construct an array of 2 elements
	       result[0] = getX();
	       result[1] = getY();
	       result[2] = z;
	       return result;  // return the array
	}
	public String toString() {
		return "[" + super.toString() + "," + z + "]";
	}
}
