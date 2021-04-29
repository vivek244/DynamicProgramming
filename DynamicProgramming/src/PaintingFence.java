
public class PaintingFence {
	
	static int paint(int n, int k) {
		int same=0,diff=k;
		long total =k;
		for (int i=2;i<=n;i++) {
			same=diff;
			diff=(int)total*(k-1);
			total =same + diff;
		}
		return (int) total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2,k=4;
		System.out.println(paint(n,k));
	}

}
