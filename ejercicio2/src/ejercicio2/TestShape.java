package ejercicio2;

public class TestShape {

	public static void main (String [] arg){
		
		Shape c1 = new Shape();
		
		System.out.println("A Shape with color of "+ c1.getColor () + "and "+ c1.getFilled ());
		
		
		Shape c2 = new Shape("red");
		
	    System.out.println("A Shape with color of " + c2.getColor () + "and " + c2.getFilled ());
	    
	    
	    Shape c3= new Shape();
	    c3.setColor ("blue");
	    c3.setFilled (false);
	    
	    System.out.println ("A Shape with color of "+ c3.getColor () + "and " + c3.getFilled ());
		
	    Shape c4 = new Shape();
	    System.out.println(c4.toString());
	}
	
	
}
