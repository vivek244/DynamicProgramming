
public class Pair {
	
	int a,b;
	
	public Pair(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}

	
	
	static int max(Pair arr[],int n) {
		int i,j;
		int mc[]=new int[n];
		for (i=0;i<n;i++) {
			mc[i]=1;
		}
		for(i=1;i<n;i++) {
			for(j=0;j<i;j++) {
				if (arr[i].a>arr[j].b && mc[i]<mc[j] +1)
					mc[i]=mc[j]+1;
			}
		}
	
		return mc[i];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair arr[] = new Pair[]
		        {
		          new Pair(5,24),
		          new Pair(15, 25),                     
		          new Pair (27, 40),
		          new Pair(50, 60)
		       };
		int n=arr.length;
		System.out.println(n);
		System.out.println(arr);
		System.out.println(max(arr,n));
		         
		

	}

}
