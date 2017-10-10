package nustar;



	import java.lang.Math.*;
	import java.util.Scanner;

	public class LargestSum
	{
	    public static void main (String[] args)    {
	   	 Scanner s=new Scanner(System.in);
	   	 int n=s.nextInt();
	   	 int k[]=new int[n];
	   	 for(int i=0;i<n;i++){
	   		 k[i]=s.nextInt();
	   	 }
	   	 long num[]=maxSubsetSum(k);
	   	 for(int i=0;i<num.length;i++)
	   		 System.out.println(num[i]);
	    }
	    static long[] maxSubsetSum(int[] k){
	    	int sum = 0;
	    	long num[]=new long[k.length];
	    	for(int i=0;i<k.length;i++){   
	   	 	sum=0;
	   	 	double sqrt = Math.sqrt(k[i]);
	   	 	for (int j = 1; j <= sqrt; j++)
	   	 	{
	   	     	if (k[i] % j == 0)
	   	     	{
	   	         	if (j == (k[i] / j))
	   	             	sum += j;
	   	         	else
	   	             	sum += (j + k[i] / j);
	   	     	}
	   	 	}
	   	 	num[i]=sum;
	    	}
	    	return num;
	    }
	}

