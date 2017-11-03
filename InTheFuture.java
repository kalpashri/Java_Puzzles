package techolution;

import java.util.Scanner;

public class InTheFuture {
	
		  static int minNumber(int a,int k,int p){
				int dayCounter=1;
				int pnew;
				
				    if(k<a || (p==0 && a==k)){
				    return -1;
			        }
			        else if (k>(a+p)){
			        	return dayCounter;
			        }
			        	else {
				        while(p!=0){
				             pnew = ((p+a)-k);
				             p = pnew;
				             dayCounter ++;
				        }
				        return dayCounter;
			         }
			}
			
			
			public static void main(String args[]) {
				Scanner sc = new Scanner(System.in);
				int A=sc.nextInt();
				int K=sc.nextInt();
				int P=sc.nextInt();
				
				
				int result = minNumber(A,K,P);
				System.out.println(result);
				sc.close();
				
			}

		}

