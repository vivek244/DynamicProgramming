
public class MinCost_Path {
	
	private static int min(int x,int y,int z) {
		if (x>y)  return y>z?z:y;
		else return x<z?x:z;  
	}
	public static int mincost(int arr[][],int m ,int n) {
		int i,j;
		int tc[][]=new int[m+1][n+1];
		tc[0][0]=arr[0][0];
		
		for (i=1;i<=m;i++) {
			tc[i][0]=tc[i-1][0] + arr[i][0];
		}
		for (j=1;j<=n;j++){
			tc[0][j] =tc[0][j-1] +arr[0][j]; 
		}
		
		for(i=1;i<=m;i++) {
			for(j=1;j<=n;j++) {
				tc[i][j]=min(tc[i-1][j-1],tc[i-1][j],tc[i][j-1]) +arr[i][j];
			}
		}
		return tc[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[][]= {{1, 20, 3},
                       {4, 8, 20},
                       {10, 5, 3}};
 System.out.println(mincost(cost,2,2));

	}

}
