
public class Binomial {
	
	static int binomial(int n,int r) {
		if (r>n) return 0;
		if (r==0 || r==n) return 1;
		return binomial(n-1,r-1) + binomial(n-1,r);
	}
	
	static int bino(int n,int r) {
		if (r>n) return 0;
		long m=1000000000;
		long[] inv= new long[r+1];
		inv[1]=1;
		
		for (int i = 2; i <= r; i++) {
	        inv[i] = m - (m / i) * inv[(int) (m % i)] % m;
		}
		int ans=1;
		 for (int i = 2; i <= r; i++) {
		        ans = (int) (((ans % m) * (inv[i] % m)) % m);
		    }
		 for (int i = n; i >= (n - r + 1); i--) {
		        ans = (int) (((ans % m) * (i % m)) % m);
		    }
		    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, r = 4;
	    System.out.print("Value of C(" +  n+ ", " +  r+ ") is "
	         +bino(n, r) +"\n");
	    System.out.print("Value of C(" +  n+ ", " +  r+ ") is "
		         +binomial(n, r) +"\n");
	    

	}

}
