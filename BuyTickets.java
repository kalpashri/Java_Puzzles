package nustar;

import java.util.Scanner;

class BuyTickets
{
    public static void main (String[] args) 
    {
   	 Scanner s=new Scanner(System.in);
   	 int n=s.nextInt();
   	 int tickets[]=new int[n];
   	 for(int i=0;i<n;i++)
   		 tickets[i]=s.nextInt();
   	 int p=s.nextInt();
   	 System.out.println(waitingTime(tickets,p));
    }
    static long waitingTime(int[] tickets,int p){
   	 int noOfSmallElements=0;
   	 for(int i=0;i<=p;i++){
   		 if(tickets[p]>tickets[i])
   		  noOfSmallElements++;
   	 }
   	 long sum=(tickets[p]-1)*tickets.length + (p - noOfSmallElements)+1;
   	 return sum;
    }
}
