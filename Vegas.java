import java.util.*;

public class Vegas {
	
	public static void main(String[] args) {
		System.out.println("Vickie starts with 100 quarters");
	   int quarters = 100;
	   int count1 = 0;
	   int count2 = 0;
	   int count3 = 0;
	   int total = 0;
	   
	// Machine 1: 25 quarters every 35th time it is played
	   Random rand1 = new Random();
	   int randNum1 = rand1.nextInt(35)+1;
	   System.out.println("\nMachine 1 random number: " + randNum1);   
		
	//Machine 2: 75 quarters every 100th time it is played
	   Random rand2 = new Random();
	   int randNum2 = rand2.nextInt(100)+1;
	   System.out.println("Machine 2 random number: " + randNum2);  
	   
	//Machine 3: 5 quarters every 8th time it is played
	   Random rand3 = new Random();
	   int randNum3 = rand3.nextInt(8)+1;
	   System.out.println("Machine 3 random number: " + randNum3); 
	      
	   
	   
	   for(int i=0; i<100; i++){   
	   
			   //Machine 1
			   System.out.println("\nMachine 1:");
			   int mod1 = 35 % randNum1;   
			   if(mod1 == 0){
				   System.out.println("\nMachine 1 Jackpot!");  
				   quarters += 24;
				   System.out.println("Amount won: 25 quarters"); 
			   } else {
				   quarters--;
				   System.out.println("Did not win."); 
			   }
			   count1++;

	
			   //Machine 2
			   System.out.println("\nMachine 2:");
			   int mod2 = 100 % randNum2;
			   if(mod2 == 0){
				   System.out.println("\nMachine 2 Jackpot!");  
				   quarters += 74;
				   System.out.println("Amount won: 75 quarters"); 
			   } else {
				   quarters--;
				   System.out.println("Did not win.");  
			   }
			   count2++;

	
			   //Machine 3
			   System.out.println("\nMachine 3:");
			   int mod3 = 8 % randNum3;
			   if(mod3 == 0){
				   System.out.println("Machine 3 Jackpot!");  
				   quarters += 7;
				   System.out.println("Amount won: 8 quarters"); 
			   } else {
				   quarters--;
				   System.out.println("Did not win.");  
			   }
			   count3++;
			   

		   
		   total = count1 + count2 + count3;
		   System.out.println("\nRemaining quarters: " + quarters); 
		   System.out.println("Total times played: " + total);
		   System.out.println("-----------------------------");
		   
		   randNum1++;
		   randNum2++;
		   randNum3++;
		   
	   }
	   
   }
		
		
		
		

	

}
