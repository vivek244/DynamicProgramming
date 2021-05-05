
public class Msi {
	
	static int m(int arr[],int n) {
	int i,j,max=0;
	int msi[] =new int[n];
	for(i=0;i<n;i++) {
		msi[i]=arr[i];
	}
	for (i=0;i<n;i++) {
		for (j=0;j<i;j++) {
			if (arr[i]>arr[j] && msi[i]<msi[j] + arr[i])
			msi[i]= msi[j]+ arr[i];
		}
	}
	
	for (i=0;i<n;i++) 
		if (max<msi[i])  
			max=msi[i];
	
	return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[]{1,3,5,8,15,6,3};
		int n=arr.length;
		 System.out.println("Sum of maximum sum "+
                 "increasing subsequence is "+
                   m(arr, n));

	}

}
