
public class Dog extends Animal {
	
	private String name;
	private String breed;
	private int dob;
	
	//constructor
	public Dog(int weight, int height, String name, String breed, int dob) {
		super(weight, height);
		this.name = name;
		this.breed = breed;
		this.dob = dob;
	}

	//getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}

	//to string
	@Override
	public String toString() {
		return "Dog [name= " + name + ", breed= " + breed + ", dob= " + dob + " years old]";
	}

}
