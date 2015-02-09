package ejercicio12;

public class TestBook {
	
	public static void main (String[] Arg){
		
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);
		
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println(aBook);
}
}