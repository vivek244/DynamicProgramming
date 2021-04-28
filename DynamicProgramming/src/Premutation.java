
public class Premutation {
	
	static int per(int n,int k) {
		int l=2; int j=5;
		int fact[] =new int [n+1];
		fact[0]=1;
		for(int i=1;i<n;i++) {
			fact[i]=i*fact[i-1];
		}
		System.out.println(fact[5]);
		System.out.println(fact[j-l]);
		return fact[n]/fact[n-k];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,k=2;
		System.out.println("Value of p" + "(" + n + ","+ k + ") is " + per(n,k));

	}

}
