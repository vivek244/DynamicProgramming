
public class Eggdrop {
	static int max( int a,int b) {
		return (a>b)?a:b;
	}
	static int egg(int n,int k) {
		int eggfloor[][]=new int[n+1][k+1];
		int x,i,j,res;
		for(i=1;i<=n;i++) {
			eggfloor[i][0]=0;
			eggfloor[i][1]=1;
		}
		for(j=1;j<=k;j++) {
			eggfloor[1][j]=j;
		}
		
		for(i=2;i<=n;i++) {
			for(j=2;j<=k;j++) {
				eggfloor[i][j]=Integer.MAX_VALUE;
				for (x=1;x<=j;x++) {
					res = 1 + max(eggfloor[i - 1][x - 1],eggfloor[i][j - x]);
					if (res<eggfloor[i][j]) eggfloor[i][j]= res;
				}
			}
		}
		
		return eggfloor[n][k];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, k = 36;
        System.out.println("Minimum number of trials in worst"
                           + " case with "
                           + n + "  eggs and "
                           + k + " floors is " + egg(n, k));

	}

}
