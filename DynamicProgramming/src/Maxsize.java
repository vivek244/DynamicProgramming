
public class Maxsize {
	
	static void max(int m[][]) {
		int i,j,r=m.length;
		int c=m[0].length;
		int s[][]=new int[r][c];
		int maxs,maxi,maxj;
		for (i=0;i<r;i++) 
			s[i][0]=m[i][0];
			for (j=0;j<c;j++) s[0][j]=m[0][j];
			
			 for(i = 1; i < r; i++)
		        {
		            for(j = 1; j < c; j++)
		            {
		                if(m[i][j] == 1) 
		                    s[i][j] = Math.min(s[i][j-1],
		                                Math.min(s[i-1][j], s[i-1][j-1])) + 1;
		                else
		                    s[i][j] = 0;
		            } 
		        }
			 maxs=s[0][0];
			 maxi=0;maxj=0;
			 
			 for (i=0;i<r;i++) {
				 for(j=0;j<c;j++) {
					 if (maxs<s[i][j]) {
						 maxs=s[i][j];
						 maxi=i;
						 maxj=j;
//						 System.out.println(maxs);
//						 System.out.println(maxj);
					 }
				 }
			 }
			 System.out.println("Maximum size sub-matrix is: ");
		        for(i = maxi; i > maxi - maxs; i--)
		        {
		            for(j = maxj; j > maxj - maxs; j--)
		            {
		                System.out.print(m[i][j] + " ");
		            } 
		            System.out.println();
		        }           
				
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		max(m);

	}

}
