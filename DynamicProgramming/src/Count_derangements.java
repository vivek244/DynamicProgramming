
public class Count_derangements {
	
	static int count(int n) {
		int der[]=new int[n+1];
		der[1]=0;
		der[2]=1;
		for (int i=3;i<=n;i++) {
			der[i]=(i-1)*(der[i-1] + der[i-2]);
//			 der[i] = (i - 1) * (der[i - 1] +
//                     der[i - 2]);
		}
		return der[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(count(n));

	}

}
