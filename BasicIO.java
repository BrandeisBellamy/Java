import java.text.DecimalFormat;
import java.util.*; 
public class BasicIO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.in means read from the keyboard
		
		System.out.println("Enter first number: \n");
		int firstNumber = in.nextInt();
		
		System.out.println("Enter second number: \n");
		int secondNumber = in.nextInt();
		
		System.out.println("Enter third number: \n");
		int thirdNumber = in.nextInt();
		
		int sum = firstNumber + secondNumber + thirdNumber;
		
		float average = (float) sum / (float) 3;
		
		System.out.println("The three numbers are :" + firstNumber + " " + secondNumber + " " + thirdNumber);

		System.out.println("The sum of the numbers is: " + sum);
		
		System.out.println("The average of the numbers is:  " + average);
		
		

	}

}
