
public class Lps {
	
	static int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	static int pali(String s) {
		
		int n=s.length();
		int i,j,cl;
		int l[][]=new int[n][n];
		for (i=0;i<n;i++) 
			l[i][i]=1;
		for(cl=2;cl<=n;cl++) {
			for(i=0;i<n-cl+1;i++) {
				j=i+cl-1;
				if (s.charAt(i)==s.charAt(j)) 
					l[i][j]=l[i+1][j-1] +2;
				else l[i][j]  =max(l[i][j-1], l[i+1][j]);
			}
		}
		return l[0][n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String seq = "MATRIXIRTPmMNS";
	        int n = seq.length();
	        System.out.println("The length of the lps is "+ pali(seq));

	}

}
