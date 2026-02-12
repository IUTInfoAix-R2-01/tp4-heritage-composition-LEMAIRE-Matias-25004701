package tp4Jva;

public class Main {
	public static void main(String[] args) {
	//Circle();
	Person();
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
}

