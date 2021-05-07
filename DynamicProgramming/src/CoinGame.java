import java.util.Arrays;

public class CoinGame {
	
	static boolean coin(int x,int y, int n) {
		
		boolean dp[]=new boolean[n+1];
		Arrays.fill(dp, false);
		dp[0]=false;
		dp[1]=true;
		for (int i=2;i<=n;i++) {
			if (i-1>=0 && dp[i-1]== false ) dp[i]=true;
			else if (i-x>=0 && dp[i-x]== false ) dp[i]=true;
			else if (i-y>=0 && dp[i-y]== false ) dp[i]=true;
			else dp[i]= false;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,y=4,n=7;
		System.out.println(coin(x,y,n));

	}

}
