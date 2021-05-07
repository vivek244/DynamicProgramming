
public class Las {

	    static int LAS(int[] arr, int n)
	    {
	        int inc = 1;
	        int dec = 1;
	  
	        for (int i = 1; i < n; i++)
	        {
	           
	            if (arr[i] > arr[i - 1])
	            {
	                inc = dec + 1;
	            }
	            else if (arr[i] < arr[i - 1])
	            {
	                dec = inc + 1;
	                System.out.println(inc+" "+" "+dec);
	            }
	        }
	       
	        return Math.max(inc, dec);
	    }
	   
	    public static void main(String[] args)
	    {
	        int[] arr = { 1,5,4};
	        int n = arr.length;
	       
	        System.out.println(LAS(arr, n));
	    }
	}

	
