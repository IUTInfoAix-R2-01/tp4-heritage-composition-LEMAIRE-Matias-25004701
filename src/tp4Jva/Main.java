package tp4Jva;

public class Main {
	public static void main(String[] args) {
	//Circle();
	//Person();
	Point();
}
static void Circle () {
	  // Declare and allocate a new instance of cylinder
     //   with default color, radius, and height
     Cylinder c1 = new Cylinder();
     System.out.println("Cylinder:"
           + " radius=" + c1.getRadius()
           + " height=" + c1.getHeight()
           + " base area=" + c1.getArea()
           + " volume=" + c1.getVolume());
  
     // Declare and allocate a new instance of cylinder
     //   specifying height, with default color and radius
     Cylinder c2 = new Cylinder(10.0);
     System.out.println("Cylinder:"
           + " radius=" + c2.getRadius()
           + " height=" + c2.getHeight()
           + " base area=" + c2.getArea()
           + " volume=" + c2.getVolume());
  
     // Declare and allocate a new instance of cylinder
     //   specifying radius and height, with default color
     Cylinder c3 = new Cylinder(2.0, 10.0);
     System.out.println("Cylinder:"
           + " radius=" + c3.getRadius()
           + " height=" + c3.getHeight()
           + " base area=" + c3.getArea()
           + " volume=" + c3.getVolume());
     System.out.println(c3);
}
static void Person () {
	Person person = new Person("Ali", "uhedfhu");
	Student student = new Student("Matias","icjscscs","Java",2, 250 );
	Staff staff =new Staff ("Matteo", "odscjdsssss","Mendes", 3500);
	
	System.out.println(person);
	System.out.println(student);
	System.out.println(staff);
	
}
static void Point() {
	 Point2D point2D = new Point2D (2.5f, 3.5f);
	 Point3D point3D = new Point3D (1.5f,2.3f, 1.9f);
	 
	 System.out.println(point2D);
	 System.out.println(point3D);
}
}

