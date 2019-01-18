import java.text.DecimalFormat;
import java.util.*; 
public class Beer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.in means read from the keyboard
		System.out.print("On average, how many beers will you consume each day?\n");
		float beerNumber = in.nextFloat();
		
		System.out.print("On average, how much will you pay for each can of beer?\n");
		float cost = in.nextFloat();
		float beerYear = beerNumber* 365;
		float multiply = beerYear	 * cost;
		float calories = beerYear * 150;
		float pounds = beerYear * 15;
		
		DecimalFormat df = new DecimalFormat("#.##"); // two decimal places
		
		System.out.println("That is approximately " + df.format(beerYear) + " beers in one year.\n");

		System.out.println("In one year, you will consume approximately " + df.format(calories) + " calories from beer alone.\n");
		
		System.out.println("Without diet or exercise to counter these calories, you can expect to gain " + df.format(pounds)  + " pounds from drinking that much beer this year.\n");
		
		System.out.println("You will spend $" + df.format(multiply) + " per year.\n");
	}

}
