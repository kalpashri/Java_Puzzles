package techolution;

public class ConsecutiveSum {


		public static void main (String[] args) throws java.lang.Exception
		{
			int num = 15;
	        System.out.println(consecutive(num));
	        num = 10;
	        System.out.println(consecutive(num));
		}
	 
	  static int consecutive(long number){
	        int count = 0;
	        for (int l = 1; l* (l+ 1) < 2 * number; l++)
	        {
	            float a = (float) ((1.0 * number-(l * (l + 1)) / 2) / (l + 1));
	            if (a-(int)a == 0.0) 
	                count++;        
	        }
	        return count;
	 
	   }
	}

