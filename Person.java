
public abstract class Person {

	private String name;
	private String state;
	private int age;

	//constructor
	public Person(String name, String state, int age) {
		super();
		this.name = name;
		this.state = state;
		this.age = age;
	}

	//getter & setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", state=" + state + ", age=" + age + "]";
	}


	public void TimeSpentToGraduateCollege(){}

}
