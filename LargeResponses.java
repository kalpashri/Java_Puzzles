package techolution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class LargeResponses
{
    
    public static void main (String[] args) throws FileNotFoundException, UnsupportedEncodingException     {
   	 Scanner s1=new Scanner(System.in);
   	 String filename =s1.next();
   	 largeResponses(filename);
    }
    
    static void largeResponses(String filename) throws FileNotFoundException,UnsupportedEncodingException{
   	 int count=0,sum=0;
   	 File file=new File(filename);
   	 Scanner s=new Scanner(file);
   	 while(s.hasNextLine()){
   		 String line=s.nextLine();
   		 String sTokens[]= line.split("\\s+");
   		 int n=Integer.parseInt(sTokens[sTokens.length-1]);
   		 if(n>5000){
   			 count++;
   			 sum+=n;   		 
   		 }
   	 }
     	PrintWriter writer = new PrintWriter("bytes_"+filename, "UTF-8");
   	  writer.println(count);
   	  writer.println(sum);
   	  writer.close();
    }    
    
}
