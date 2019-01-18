
public class Student extends Person implements IMovable {

	 private String major;
	 private String level;


	 //constructor
	public Student(String name, String state, int age, String major, String level) {
		super(name, state, age);
		this.major = major;
		this.level = level;
	}


	//getters & setters
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}


	//toString
	@Override
	public String toString() {
		return super.toString() +" Student [major=" + major + ", level=" + level + "]";
	}


	//Interface IMovable
	@Override
	public void ClassNumber() {
		System.out.println("Student is in class number COP 2800C");
	}
	@Override
	public void ClassesTaken() {
		System.out.println("Student has take six classes");
	}
	@Override
	public void ClassesNeededToFinish() {
		System.out.println("Student needs 12 classes to finish");
	}

	//from abstract method
	public void TimeSpentToGraduateCollege(){
		 System.out.println("Student has taken WAY too much time to gratuate college");
	}
}
