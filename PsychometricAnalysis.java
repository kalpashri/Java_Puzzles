package nustar;

import java.util.Scanner;


class PsychometricAnalysis
{
    public static void main (String[] args)
    {
   	 Scanner s=new Scanner(System.in);
   	 int n=s.nextInt();
   	 int scores[]=new int[n];
   	 for (int i=0;i<n;i++)
   		 scores[i]=s.nextInt();
   	 int q=s.nextInt();
   	 int lowerLimits[]=new int[q];
   	 for(int i=0;i<q;i++)
   		 lowerLimits[i]=s.nextInt();
   	 q=s.nextInt();
   	 int upperLimits[]=new int[q];
   	 for(int i=0;i<q;i++)
   		 upperLimits[i]=s.nextInt();
   	 int[] sol=jobOffers(scores,lowerLimits,upperLimits);
   	 for(int i=0;i<sol.length;i++)
   		 System.out.println(sol[i]);
   		 
    }
    static int[] jobOffers(int[] scores , int[] lowerLimits, int[] upperLimits){
   	 int q=lowerLimits.length;
   	 int sol[]=new int[q];
   	 for(int i=0;i<q;i++){
   		 for(int j=0;j<scores.length;j++){
   			 if(scores[j]>=lowerLimits[i] &&scores[j]<=upperLimits[i])
   				 sol[i]++;
   		 }
   	 }
   	 return sol;
    }
}

