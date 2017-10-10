package nustar;

import java.util.Scanner;

public class BalancedUnbalanced
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
	 
	static int areParenthesisBalanced(char exp[])
	{
   	 int count=0;
   	stack st=new stack();
 	 
   	for(int i=0;i<exp.length;i++)
   	{
      	if (exp[i] == '<')
        	st.push(exp[i]);
 	 
      	else if (exp[i] == '>')
      	{
             	 
         	if (st.isEmpty())
           	{
               	count++;
           	}
         	else
           	{
               	st.pop();//st.pop();//count++;
           	}
      	}
      	 
   	}
    	 
   	if (!st.isEmpty())
         	count=st.top+1;
    
     	return count;
	}
	 
	public static void main(String[] args)
	{
   	 Scanner s = new Scanner(System.in);
   	 int str_array_size= s.nextInt();
   	 String exp[]=new String[str_array_size];
    for (int i=0;i<str_array_size;i++){
   	 exp[i]=s.next();
    }
    int max_rep=s.nextInt();
    int n[]=new int[max_rep];
    for(int i=0;i<max_rep;i++){
   	 n[i]=s.nextInt();
    }
    	
    	for(int i=0;i<str_array_size;i++){
   		 // System.out.println(areParenthesisBalanced(exp[i].toCharArray()));
      	if (areParenthesisBalanced(exp[i].toCharArray())<=n[i])
         	System.out.println("1");
      	else
        	System.out.println("0");  
    	}
	}
 
}


