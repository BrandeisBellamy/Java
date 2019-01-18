import java.util.*;

public class Main {

	public static void main(String[] args) {
	    
		System.out.println("Please enter number of names: at least 3");
	    Scanner inTimes = new Scanner(System.in);
	    int time = inTimes.nextInt(); 
	    int count = time;
	    //inTimes.close();
	    
	    while(count>0) {
	    	
	    	System.out.println("Please enter first name");
	    	Scanner inFirst = new Scanner(System.in);
		    String firstName = inFirst.nextLine();
		    
		    System.out.println("Please enter middle name");
		    Scanner inMiddle = new Scanner(System.in);
		    String middleName = inMiddle.nextLine();
		    
		    System.out.println("Please enter last name");
		    Scanner inLast = new Scanner(System.in);
		    String lastName = inLast.nextLine(); 
		    //inName.close();
		    
		    Name name = new Name(firstName, middleName, lastName);
		    
		    
		    System.out.println("Please enter gender: M or F");
		    Scanner inGender = new Scanner(System.in);
		    String gender = inGender.nextLine();
		    
		    System.out.println("Please enter age: between 1 and 120");
		    Scanner inAge = new Scanner(System.in);
		    int age = inAge.nextInt();
		    
		    System.out.println("Please enter salary: greater than 0");
		    Scanner inSalary = new Scanner(System.in);
		    double salary = inSalary.nextDouble();
		    //inPerson.close();
		    
		    Person p1 = new Person(name, gender, age, salary);
		    
		    System.out.println("Name is " + p1);

		    count--;
		    System.out.println(" ");
		    
		    
	    }

	    
	    
	    
	    
	    
	}

}
