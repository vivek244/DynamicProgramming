
public class Diff_bw_adjacent {
	
	static int longest(int arr[],int n) {
		
		int dp[]=new int[n];
		for (int i=0;i<n;i++) {
			dp[i]=1;
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<i;j++) {
				if ((arr[i]== arr[j]-1) || arr[i]==arr[j]+1);
				dp[i]=Math.max(dp[i], dp[j]+1);
			}
		}
		int result=1;
		for(int i=0;i<n;i++) {
			if (result<dp[i])
				result=dp[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {10,5,8,6,2,9,1,4,3};
		int n=arr.length;
		System.out.println(longest(arr,n));

	}

}
