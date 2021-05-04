
public class Lcs {
	
	static int ls(char x[],char y[],int m,int n) {
		if (m==0 || n==0) {
			return 0;
		}
		
		if (x[m-1]==y[n-1]) {
			return 1+ ls(x,y ,m-1 ,n-1);
		}
		else {
			 return max(ls(x,y ,m-1 ,n),ls(x,y ,m ,n-1));
		}	
	}

 static int max(int a, int b) {
		return (a>b)?a:b;
	}

	public static void main(String[] args) {

//		Lcs ls=new Lcs();
		String s1="JSBHDBEL";
		String s2="DBELSDGWW";
		
		char[] x=s1.toCharArray();
		char[] y=s2.toCharArray();
		int m=x.length;
		int n=y.length;
		System.out.println("Length of LCS is" + " " +
                ls( x, y, m, n ));
		System.out.println(m + " " + n );

	}

}
