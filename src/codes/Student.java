package codes;

public class Student {
	
	private int age;
	private String firstName;
	private String lastName;
	private int average;
	private boolean female;
	private int aThreshold;
	private int bThreshold;
	private int cThreshold;
	private int dThreshold;
	
	//constructor -> auto runs when you create an object. cannot be called
		// constructors can be overloaded, like methods -> multiples can exists so long as there are differing parameters
	public Student(String firstName, int age) {
		this.age = age;
		this.firstName = firstName;
		lastName = "Doe";
		average = 65;
		female = true;
		aThreshold = (int)(Math.random()*30+10);
		bThreshold = 50-aThreshold;
		cThreshold = (int)(Math.random()*30+10);
		dThreshold = 50-cThreshold;
	}
	
	public Student() {
		age = 15;
		firstName = "Jane";
		lastName = "Doe";
		average = 65;
		female = true;
		aThreshold = (int)(Math.random()*30+10);
		bThreshold = 50-aThreshold;
		cThreshold = (int)(Math.random()*30+10);
		dThreshold = 50-cThreshold;
	}
	
	// accessor aka GETTER
	public int getAge() {
		
		return age;
	}
	
	// modifier aka SETTER
	public void setAge(int age) {
		if(age <=140 && age >= 0 && age >= this.age)
			this.age = age; // this. refers to class
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public boolean isFemale() {
		return female;
	}

	public void setFemale(boolean female) {
		this.female = female;
	}
	
	public char makeAGuess() {		
		char chance = (char)(Math.random()*(100));
		
		if(chance < aThreshold)
			return 'a';
		else if (chance < bThreshold+aThreshold)
			return 'b';
		else if (chance < 50+cThreshold)
			return 'c';
		else
			return 'd';
	}

}
