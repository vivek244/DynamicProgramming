
public class MinJump {
	
	public static int jump(int arr[], int n) {
		int jump[] =new int[n];
		int i,j;
		if(n==0 || arr[0]==0 ) 
			return Integer.MAX_VALUE;
		
		jump[0]=0;
		for (i=1;i<n;i++) {
			jump[i]=Integer.MAX_VALUE;
			for (j=0;j<i;j++) {
				if(i<=j +arr[j] && jump[j] !=Integer.MAX_VALUE) {
					jump[i] = Math.min(jump[i], jump[j] + 1);
                    break;
				}
				
			}
		}
		return jump[n-1];
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 6, 1, 0, 9 };
		 
        System.out.println("Minimum number of jumps to reach end is : "
                           + jump(arr, arr.length));

	}

}
