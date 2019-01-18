import java.util.Scanner;
import java.text.*; // for the decimal format
import java.io.*; // for input output

public class NameAgeTriangle {

	
	
	
	

	public static void main(String[] args) {
		
		String b = null;
		String repeatName;
		int a = 0;
		int doubleAge = 0;
		int teenAdult = 0;
		int triangle = 0;
		
		//choose a number
		Scanner inNumber = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 4: ");
		int number = inNumber.nextInt();
		
		
		switch(number){
		case 1:
			repeatName = name(b);
			break;
			
		case 2:
			doubleAge = age(a);
			System.out.print("\nYour doubled age is: " + doubleAge);
			break;
			
		case 3:
			teenAdult = ageAdult(a);
			break;
			
		case 4:
			triangle = triangleStar(a);
			break;		
		}	
		
		inNumber.close();	
	}
	
	
	static String name(String name1) {
		//1.	Get the user’s first name and echo it back out 20 times.
		Scanner inName = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = inName.nextLine();
		inName.close();
		for(int i=0; i<20; i++){
			System.out.println(firstName);
		}
		return firstName;
	}
	
	static int age(int age1) {
		//2.	Get the Store user’s age and double it and display the age and the doubled age.
		Scanner inAge = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age1 = inAge.nextInt();
		System.out.print("Your age is: " + age1);
		inAge.close();
	    int retVal; //return value
	    retVal = age1 * 2;
	    return retVal;
	  }
	
	static int ageAdult(int age2) {
		//3.	 Using the age from #2 output one of the following statements
		//		a.	Since you are XX years old, you are a teenager
		//		b.	Since you are YY years old, you are NOT a teenager
		String mature = null;
		Scanner inAge2 = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age2 = inAge2.nextInt();
		if(age2 < 18 && age2 > 12){
			mature = "you are a teenager";
		} else {
			mature = "you are NOT a teenager";
		}
		System.out.print("Since you are: " + age2 + " years old, " + mature);
		inAge2.close();
	    return age2;
	  }
	
	static int triangleStar(int star) {
		//4.	Get a single integer between 3 and 50 (inclusively) from the user.  
		//Create a triangle of X’s with the integer inputted rows.  
		//The triangle needs to be displayed on the screen and in a text document named triangle.txt.
		
		Scanner inStar = null;
		PrintWriter pw = null;
		try{
			inStar = new Scanner(System.in);
			pw = new PrintWriter("triangle.txt");
			System.out.print("Enter a number between 3 and 50: ");
			star = inStar.nextInt();
			while(star > 0){
				for(int i=0; i<star; i++){
					System.out.print("*");
					pw.print("*");
				}
				System.out.print("\n");
				pw.print("\n");
				star--;
			}	
	    } catch(Exception ex) {
		      System.out.println(ex.getMessage());
		      
		    }finally {
		      pw.close(); //close
		      inStar.close();
		    }	
		
		
	    // create print writer class
	    //File out
/*
		PrintWriter pw = null; // define pw outside try/catch so finally can read it
	    try {
		    pw = new PrintWriter("triangle.txt"); //pass file name, need try/catch
		    
		    while(star > 0){
				for(int i=0; i<star; i++){
					pw.print("*");
				}
				pw.print("\n");
				star--;
			}	
		    
	    } catch(Exception ex) {
	      System.out.println(ex.getMessage());
	      
	    }finally {
	      pw.close(); //close
	    }*/	
	    
	    return star;
	  }
}
