
public class Interleave {
	
	public static boolean inter(String A,String B,String C) {
		int m=A.length();
		int n=B.length();
		boolean il[][]=new boolean[m+1][n+1];
		if(m+n!=C.length()) return false;
		for (int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(i==0 && j==0)
					il[i][j]=true;
				
				else if(i==0) if( B.charAt(j-1)==C.charAt(i+j-1))
					il[i][j]=il[i][j-1];
				
				else if(j==0) if( A.charAt(i-1)==C.charAt(i+j-1))
					il[i][j]=il[i-1][j];
				
				else if( B.charAt(j-1)==C.charAt(i+j-1) &&
						A.charAt(i-1)!=C.charAt(i+j-1))
					il[i][j]=il[i][j-1];
				
				else if( A.charAt(i-1)==C.charAt(i+j-1) &&
						B.charAt(j-1)!=C.charAt(i+j-1))
					il[i][j]=il[i-1][j];
				
				else if( B.charAt(j-1)==C.charAt(i+j-1) &&
						A.charAt(i-1)==C.charAt(i+j-1))
					il[i][j]=(il[i][j-1] || il[i-1][j]);
				
			}
		}
		return il[m][n];
	}
	static void test(String A, String B, String C)
	{
	    if (inter(A, B, C))
	        System.out.println(C + " is interleaved of " +
	                           A + " and " + B);
	    else
	        System.out.println(C + " is not interleaved of " +
	                           A + " and " + B);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("XXY", "XXZ", "XXZXXXY");
	    test("XY", "WZ", "WZXY");
	    test("XY", "X", "XXY");
	    test("YX", "X", "XXY");
	    test("XXY", "XXZ", "XXXXZY");

	}

}
