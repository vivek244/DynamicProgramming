
public class Count_balanced_binary_tree_height_h {
	
	static final int MOD=10^8;
	public static long count(int h) {
		long dp[] =new long[h+1];
		dp[0]=0; dp[1]=1;
		for(int i = 2; i <= h; ++i)
            dp[i] = (dp[i - 1] * ((2 * dp [i - 2])% MOD + dp[i - 1]) % MOD) % MOD;
		return  dp[h];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int h = 5;
	        System.out.println("No. of balanced binary trees of height "+h+" is: "+count(h));

	}

}
