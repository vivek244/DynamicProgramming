
public class Partition {
	
	static boolean part(int arr[],int n) {
		int sum=0,i,j;
		for(i=0;i<n;i++) {
			sum +=arr[i];
		}
		if(sum%2 !=0) return false;
		boolean parti[]=new boolean[sum/2 +1];
		for(i = 0; i <= sum / 2; i++)
	    {
	        parti[i] = false;
	    }
		for(i = 0; i < n; i++)
	    {
	        for(j = sum / 2; j >= arr[i]; j--)
	        {

	            if (parti[j - arr[i]] == true || j == arr[i])
	                parti[j] = true;
	        }

	    }
		return parti[sum/2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 3,1, 2, 3, 2 };
	    int n = 6;
	 
	    // Function call
	    if(part(arr, n) == true)
	        System.out.println("Can be divided into two " +
	                           "subsets of equal sum");
	    else
	        System.out.println("Can not be divided into " +
	                           "two subsets of equal sum");

	}

}
