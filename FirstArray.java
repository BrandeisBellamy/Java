import java.util.*;
import java.util.Scanner;

public class FirstArray {

	//3.	Print out the array
	static void randomArray(int array[]){
	   System.out.println("Random Array:");
	   for(int i=0;i<10; i++){
	     Random rand = new Random();
	     array[i] = rand.nextInt(100)+1;
	     System.out.print(array[i] + " ");  
	   }
	}
	
	//4.	Sort the array
	//5.	Print out the array
	static void sortArray(int array[]){
	   for(int i=0;i<10; i++){
		   for(int j=0; j<10-i-1; j++){
			 if(array[j] > array[j+1]){
				 int temp = array[j];
				 array[j] = array[j+1];
				 array[j+1] = temp;
			 }
		   }
	   }
	   System.out.println("\n\nSorted Array:");   
	   for(int i=0;i<10; i++){
		 System.out.print(array[i] + " ");  
	   }
	}
	
	//6.	Search the array for a number user ask for between 1 and 100…display found or not found
	static void searchArray(int array[]){
		   Scanner in = new Scanner(System.in);
		   System.out.print("\n\nEnter a number between 1 and 100: ");
		   int number = in.nextInt(); 
		   for(int i=0;i<10; i++){
			   if(number == array[i]){
				   System.out.print("Found");
				   break;
			   } else {
				   System.out.print("Not Found"); 
				   break;
			   }
		   }
	}
	
	 //7.	Display each number from 1 to 100 and the number of times found in the array
	static void manyArray(int array[]){
	   System.out.println("\n\nHow Many Times in Array:");
	   int skip = 0;
	   for(int i=0;i<10; i++){
		   int count = 1;
		   if (array[i] == skip){
				  continue;
		   } else if (array[i] == array[i+1]){
			   count++;	
			   System.out.print("Number " + array[i] + " occurs " + count + " times\n"); 
		   }  else if (array[i] != array[i+1]){
			   System.out.print("Number " + array[i] + " occurs " + count + " time\n");  
			 }
		   skip = array[i];
	   }
	}

	//8.	Display the average of the numbers in the array
	static void averageArray(int array[]){
	   int sum = 0;
	   float average = 0;
	   for(int i=0;i<10; i++){
	     sum += array[i];
	   }
	   average = (float) sum / 10;
	   System.out.println("\nArray Average is: " + average);
	}
	
	
	public static void main(String[] args) {

	    //1.	You generate and store 10 numbers randomly generated all between 1 and 100.
	    //2.	Declare an array that stores the random numbers.
		int[] array = new int[11];
		
	    //3.	Print out the array
		randomArray(array);
	   
		//4.	Sort the array
		//5.	Print out the array
		sortArray(array);

	   //6.	Search the array for a number user ask for between 1 and 100…display found or not found
		searchArray(array);	
	   
	   //7.	Display each number from 1 to 100 and the number of times found in the array
		manyArray(array);
	   
	   //8.	Display the average of the numbers in the array
		averageArray(array);
	   
	   //9.	Display the highest number in the array
	   System.out.println("\nThe highest number in the array is: " + array[9]);
	   
	   //10.	Display the lowest number in the array
	   System.out.println("\nThe lowest number in the array is: " + array[0]);
	}
}
