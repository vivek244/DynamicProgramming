
public class MatrixMultiplication {
	
	static int chain(int p[],int i, int j) {
		if(i==j ) return 0;
		int min=Integer.MAX_VALUE;
		for (int k=i;k<j;k++) {
			 int count = chain(p, i, k)
                     + chain(p, k + 1, j)
                     + p[i - 1] * p[k] * p[j];

         if (count < min)
             min = count;
         
//         System.out.println(chain(p, i, k));
//         System.out.println(chain(p, k + 1, j));
         System.out.println(p[i - 1] * p[k] * p[j]);
         
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[] { 1, 2, 3, 4, 3 };
	        int n = arr.length;
	 
	        System.out.println(
	            "Minimum number of multiplications is "
	            + chain(arr, 1, n - 1));

	}

}
