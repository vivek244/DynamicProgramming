import java.util.ArrayList;
import java.util.Arrays;

public class WordBreak {
	
	static boolean word(String s,ArrayList<String> b) {
		 int i=0, j=1,total =0;
		 int n=s.length();
		 while(j<=n) {
			 if (b.contains(s.substring(i,j))) {
				 total+=j-i;
				 i=j;
				 j++;
			 }
			 else { j++;}
		 }
		 if(total==s.length()) 
			 return true;
		 
		 return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> dictionary
         = new ArrayList<String>(Arrays.asList(
             "mobile", "samsung", "sam", "sung", "man",
             "mango", "icecream", "and", "go", "i",
             "like", "ice", "cream"));
     String segmentThis = "andgo";

     // Calling the function to check a word break is
     // possible

System.out.println(word(segmentThis,dictionary));
   

	}

}
