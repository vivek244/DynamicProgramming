import java.util.Arrays;

public class Min_removals {
	
	static int findind(int key,int i , int n,int k,int arr[]) {
		int start,end,mid,ind=-1;
		start =i+1;
		end =n-1;
		while (start<end) {
			mid= start + (end -start)/2;
//			System.out.println(mid);
			if (arr[mid]-key<=k) {
				ind =mid;
				start =mid+1;
			}
			else {
				end=mid;
			}
//			System.out.println(ind);
		}
		return ind;
		
	}
	
	static int removals(int arr[],int n,int k) {
		int i,j,ans=n-1;
		Arrays.sort(arr);
		for (i=0;i<n;i++) {
//			System.out.println(i);
			j = findind(arr[i], i, n, k, arr);
			System.out.println(j);
			if (j!=-1) {
				ans=Math.min(ans, n - (j - i + 1));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 9, 10,
                11, 12, 17, 20 };
    int n = a.length;
    int k = 4;
     
    System.out.println(removals(a, n, k));

	}

}
