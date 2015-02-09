package ejercicio2;

public class Circlee extends Shape {

	//An instance variable radius (double).
	private double radius;
	
	//Three constructors as shown. The no-arg constructor initializes the radius to 1.0.
	
	public Circlee (){
		super ();
		this.radius= 1.0;
	}
	
	public Circlee (double radius){
		super ();
		this.radius = radius;
	}

	public Circlee (double radius, String color, boolean filled)
	{
		super (color);
		this.radius = radius;
	}
	
	//Getter and setter for the instance variable radius.
	
	public double getRadius(){
		return radius;
		
	}
	
	public void setRadius (double r){
	this.radius=r;	
	}
	
	//Methods getArea() and getPerimeter()
	
	public double getArea(){
		return  radius*radius*Math.PI;
	}
	
	public double getPerimeter(){
		return  radius*2*Math.PI;
	}
	
	//Override the toString() method inherited, to return "A Circle with radius=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
	
	@Override
	public String toString() {      // in Cylinder class
	   return "A Circle with radius= " + radius + " which is a subclass of  " + super.toString();  // use Circle's toString()
	         
	}
}


