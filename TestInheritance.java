
public class TestInheritance {

	public static void main(String[] args) {
		
		Animal myPet = new Animal(100, 60);
		System.out.println(myPet);
		
		Dog myDog = new Dog(25, 45, "Roger", "Pit Bull", 7);
		System.out.println(myDog);
		
		Cat myCat = new Cat(15, 10, "Sammy", 9); 
		System.out.println(myCat);

		Bird myBird = new Bird(2, 5, 15, true); 
		System.out.println(myBird);

	}

}
