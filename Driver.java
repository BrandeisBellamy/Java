
public class Driver {

	public static void main(String[] args) {
		Automobile myAuto1 = new Automobile("Ford", "Orlando", "Florida");
		System.out.println(myAuto1);

		Automobile myAuto2 = new Automobile("Toyota", "Houston", "Texas");
		System.out.println(myAuto2);

		Automobile myAuto3 = new Automobile("Lexus", "New York", "New York");
		System.out.println(myAuto3);

		RaceCar myCar1 = new RaceCar("Lincoln", "Las Vegas", "Nevada", "Navigator", 2019, "Red");
		System.out.println(myCar1);

		RaceCar myCar2 = new RaceCar("Ford", "Los Angeles", "California", "Focus", 2017, "White");
		System.out.println(myCar2);

		RaceCar myCar3 = new RaceCar("Ford", "Lordstown", "Ohio", "Fiesta", 2015, "Purple");
		System.out.println(myCar3);
	}

}
