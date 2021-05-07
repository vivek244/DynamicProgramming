
public class Longest_sum_contigous {
	
	static void max(int a[],int n) {
		int maxend=0,maxs=Integer.MIN_VALUE;int s=0,end=0,start=0;
		for (int i=0;i<n;i++) {
			maxend +=a[i];
			if (maxs<maxend) {
				maxs=maxend;
				start =s;end=i;
			}
			if (maxend<0) {
				maxend=0;s=i+1;
			}
		}
		System.out.println("Maximum contiguous sum is "
                + maxs);
System.out.println("Starting index " + start);
System.out.println("Ending index " + end);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        max(a, n);

	}

}
