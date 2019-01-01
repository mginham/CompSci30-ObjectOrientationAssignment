package codes;

public class Main {

	public static void main(String[] args) {
		//Student Albert -> gives a name
		// new Student(); -> creates the object
		Student albert = new Student("Alberto", 62);
		
		//albert.setAge(17);
		
		System.out.println(albert.getFirstName());
		System.out.println(albert.getAge());
		
		System.out.println(albert.makeAGuess());
		
		Book.title();
	}

}
