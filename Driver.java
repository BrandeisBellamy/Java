
public class Driver {

	public static void main(String[] args) {
		//Person per1 = new Person("Bob", "Florida", 21);

		Student stud1 = new Student("Bob", "Florida", 21, "Chemistry", "Freshman");
		System.out.println(stud1);
		stud1.TimeSpentToGraduateCollege();

		System.out.println("\n");

		System.out.println("Polymorphism");
		stud1.ClassNumber();
		stud1.ClassesTaken();
		stud1.ClassesNeededToFinish();

		System.out.println("\n");

		Person pers1;
		pers1 = stud1;
		pers1.TimeSpentToGraduateCollege();

		System.out.println("\n");

		IMovable iMo;
		iMo = stud1;
		iMo.ClassNumber();
		iMo.ClassesTaken();
		iMo.ClassesNeededToFinish();

	}

}
