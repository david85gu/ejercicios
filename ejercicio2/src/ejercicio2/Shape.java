package ejercicio2;

public class Shape {

	private String color;
	private boolean filled;
	
	//Two constructors: a no-arg (no-argument) constructor that initializes the color to "green" and filled to true,
	//and a constructor that initializes the color and filled to the given values.
	
	public Shape (){
		this.color = "green";
		this.filled = true;
	}
	
	public Shape (String color){
		this.color = color;
		this.filled = true;
	}
	//Getter and setter for all the instance variables. By convention, the getter for a boolean variable xxx is called isXXX() (instead of getXxx() for all the other types).

public String getColor (){
	return color;
}

public boolean getFilled (){
	return filled;
}

public void setColor (String c){
	this.color = c;
}

public void setFilled (boolean f){
	this.filled = f;
}

//A toString() method that returns "A Shape with color of xxx and filled/Not filled"

public String toString(){
	return "A Shape with color of " + color + "and" + filled;
}


}



