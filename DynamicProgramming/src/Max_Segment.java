import java.util.Arrays;

public class Max_Segment {
	
	static int max(int l,int p,int q, int r) {
		int dp[]=new int[l+1];
//		 Arrays.fill(dp, -1);
		 for (int i = 0; i < l + 1; i++) 
	            dp[i] = -1;
		 dp[0]=0;
		 for ( int i=0;i<=l;i++) {
			 if (dp[i]==-1) continue;
		 
		 
		 if (i + p <= l) dp[i + p] = Math.max(dp[i + p], dp[i] + 1);
		 if (i + q <= l) dp[i + q] = Math.max(dp[i + q], dp[i] + 1);
		 if (i + q <= l) dp[i + r] = Math.max(dp[i + r], dp[i] + 1);
		 } if (dp[l]==-1) { 
			 dp[l]=0;
		 }
		 return dp[l];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 11, p = 2, q = 3, r = 5;
		 
        // Calling Function
        int ans = max(l, p, q, r);
        System.out.println(ans);

	}

}
