package ejercicio2;

public class Circle {           // save as "Circle.java"
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   private String color;
	   
	   // 1st constructor, which sets both radius and color to default
	   public Circle() {
	     this.radius = 1.0;
	      this.color = "red";
	   }
	   
	   // 2nd constructor with given radius, but color default
	   public Circle(double r) {
	      this.radius = r;
	      this.color = "red";
	   }
	   // tercer constructor
	   public Circle (double r, String c) {
		   
	      this.radius = r;
	      this.color = c;
	   
	   }
	   
	   // A public method for retrieving the radius
	   public double getRadius() {
	     return radius; 
	   }
	   
	   // A public method for computing the area of circle
	   public double getArea() {
	      return radius*radius*Math.PI;
	      
	      
	   }
	   public String getColor() {
		   
	      return color;
	   }
	   
	// Setter for instance variable radius
	   public void setRadius(double r) {
	      this.radius = r;
	   }
	    
	   // Setter for instance variable color
	   public void setColor(String c) { 
		   
		   this.color = c;
	   }
	   // Method toString
	   public String toString() {
		   return "Circle: radius=" + radius + " color=" + color;
		}
	   
	}