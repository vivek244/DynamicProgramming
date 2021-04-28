
public class CoinChange {
	
	static int count(int s[],int m ,int n) {
		if (n==0) return 1;
		
		if (n<0) return 0;
		
		if (m<=0 && n>=1) return 0;
		
		return count(s,m-1,n) + count(s,m,n-s[m-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,5};
		int m=arr.length;
		System.out.println(count(arr,m,10));
		System.out.println(m);
				
		}

	

}
