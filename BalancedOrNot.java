package techolution;

import java.util.Scanner;

public class BalancedOrNot
{
	static class stack
	{
		int top=-1;
		char items[] = new char[100];

		void push(char x)
		{
			if (top == 99)
			{
				System.out.println("Stack full");
			}
			else
			{
				items[++top] = x;
			}
		}

		char pop()
		{
			if (top == -1)
			{
				System.out.println("Underflow error");
				return '\0';
			}
			else
			{
				char element = items[top];
				top--;
				return element;
			}
		}

		boolean isEmpty()
		{
			return (top == -1) ? true : false;
		}
	}

	static boolean isMatchingPair(char character1, char character2)
	{
		if (character1 == '<' && character2 == '>')
			return true;
		else
			return false;
	}

	static int[] balancedOrNot(String exp[],int max_rep[])
	{
		int count = 0;
		int result[]=new int[exp.length];
		
		stack st=new stack();
		
		for(int j=0 ; j<exp.length; j++){
			char eachExp[]=exp[j].toCharArray();
            
		    for(int i=0;i<eachExp.length;i++){
		    	if (eachExp[i] == '<')
				st.push(eachExp[i]);

			else if (eachExp[i] == '>'){
				 if (st.isEmpty())
					count++;
				 else if(!st.isEmpty())
					st.pop();
			}
		    }
			
		    if(!st.isEmpty() || count>max_rep[j])
				result[j]=0;
		    else if(st.isEmpty() && count<=max_rep[j])
			    result[j]=1; 
		 }
		
		return result;
		}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int str_array_size = s.nextInt();
		String exp[]=new String[str_array_size];
		
		for (int i=0;i<str_array_size;i++){
			exp[i]=s.next();
		}
		
		int max_rep=s.nextInt();
		int n[]=new int[max_rep];
		
		for(int i=0;i<max_rep;i++){
			n[i]=s.nextInt();
		}

	
		int result[]=balancedOrNot(exp,n);
		for(int i=0;i<result.length;i++)
		System.out.println(result[i]);
	}

}


