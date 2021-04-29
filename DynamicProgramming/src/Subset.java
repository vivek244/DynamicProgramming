
public class Subset {
	
	static boolean sub(int set[],int n, int sum) {
		if (sum==0 ) return true;
		if (n==0) return false;
		return sub(set, n - 1, sum) || sub(set, n - 1, sum - set[n - 1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[]= {12,4,6,8,5,21,36};
		int sum=26;
		int n=set.length;
		if (sub(set,n,sum)==true) {System.out.println("Found a subset for " +sum);}
		else { System.out.println("No subset is found for "+ sum);}

	}

}
