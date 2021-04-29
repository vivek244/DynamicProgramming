import java.util.Arrays;

public class EditDistance {
	
	static int min(String s1,String s2, int n,int m,int dp[][]) {
		if (m==0) return n;
		if (n==0) return m;
		
		if (dp[n][m] != -1) 
			return dp[n][m];
		
		
		if(s1.charAt (n-1) == s2.charAt(m-1)) {
			if(dp[n-1][m-1]==-1) {
				return dp[n][m] = min(s1, s2, n - 1, m - 1, dp);
			}
			else return dp[n][m]=dp[n-1][m-1];
		}
		
		else {
			
    	int m1,m2,m3;
		if (dp[n-1][m] != -1) {
			m1=dp[n-1][m];
		}
		else { 
			m1=min(s1, s2, n - 1, m, dp);
		}
		if (dp[n][m-1] != -1)	{
			m2=dp[n][m-1];
		}
		else { 
			m2=min(s1, s2, n, m - 1, dp);
		}
		if (dp[n-1][m-1] != -1) {
			m3=dp[n-1][m-1];
		}
		else { 
			m3=min(s1, s2, n - 1, m - 1, dp);
		}
		return dp[n][m] =1 + Math.min(m1, Math.min(m2, m3));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "virat";
		  String str2 = "vivek kumar";
		       
		  int n= str1.length(), m = str2.length();   
		  int[][] dp = new int[n + 1][m + 1];
		  for(int i = 0; i < n + 1; i++)
		  Arrays.fill(dp[i], -1);               
		  System.out.print(min(str1, str2, n, m, dp));
		}

	}


