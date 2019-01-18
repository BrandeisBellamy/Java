
public class Person {

	  private Name name; // composite relationship
	  private String gender;
	  private int age;
	  private double salary;
	  
	//generate constructor from Fields
	public Person(Name name, String gender, int age, double salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	//getter and setter
	public String getName() {
	    return name.getFirstName() + " " +
	            name.getMiddleName() + " " +
	            name.getLastName();
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	  
	//toString 
	  @Override
	  public String toString() {
	    return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + "]";
	  } 
}
