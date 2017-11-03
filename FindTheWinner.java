package techolution;

import java.util.Scanner;

public class FindTheWinner {
	
	 static String winner(int [] andrea, int [] maria, String s){
	   	 int n= andrea.length;
	   	 int sum_andrea=0,sum_maria=0;
	   	 int i=0;
	   	 if(s.equals("EVEN")){    
	   		 while(i<n){
	   			 sum_andrea=sum_andrea+andrea[i]-maria[i];
	   			 sum_maria=sum_maria+maria[i]-andrea[i];
	   			 i+=2;
	   		 }
	   	 }
	   	 else if(s.equals("ODD")){
	   		 i=1;
	   		 while(i<n){
	   			 sum_andrea=sum_andrea+andrea[i]-maria[i];
	   			 sum_maria=sum_maria+maria[i]-andrea[i];
	   			 i+=2;
	   		 }
	   	 }
	   	 if(sum_andrea>sum_maria)
	   		 return "Andrea";
	   	 else if(sum_andrea<sum_maria)
	   		 return "Maria";
	   	 else return "Tie";
	    }
	public static void main (String[] args)
	    {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] andrea = new int[n];
		 int[] maria = new int[n];
		 for(int i=1; i<n ;i++)
			  andrea[i] = sc.nextInt(); 
		 
		 for(int i=1; i<n ;i++)
			  maria[i] = sc.nextInt();
		 
	   	 String s =sc.nextLine();
	   	 System.out.println(winner(andrea,maria,s));
	    }
}
