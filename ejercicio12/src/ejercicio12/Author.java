package ejercicio12;

public class Author {
	
	private String name;
	private String email;
	private char gender;   
	
	public Author(String n, String 	e, char g) {
	      this.name = n;
	      this.email = e;
	      this.gender = g;
	   }
	
	public String getName() {
	     return name; 
	   }
	
	
	public String getEmail() {
	     return email; 
	   }
	
	public char getGender() {
	     return gender; 
	   }
	
	public void setEmail(String e) {
	      this.email = e;
	   }
	
	public String toString() {
		   return name + " (" + gender + ") " + " at " + email;
		}
}

