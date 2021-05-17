package plandirome;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex: abayacbbcayxdb
		//Palindrome: aba, acbbca, aya, cbbc
		
		List<String> plaindrome= plandirome("abayacbbcayxdb");
		System.out.println(plaindrome);
		 
	}
	
	public static List<String> plandirome(String str) {
		System.err.println(str);
		String[] k=str.split("");
		String word = null;
      List<String> array= new ArrayList<>();
        
      for (int i = 0; i < k.length; i++) {
			  word=k[i];
			for(int j=i+1;j<k.length;j++) {
				 word = word.concat(k[j]);
				if( singlePlandirome(word) == true) {
					array.add(word);
				}
				
			}
		}
		return array;
	}
	
	public static boolean singlePlandirome(String word) {
	
		String[]  arrayOfString=word.split("");
	
	   for(int c=0;c < arrayOfString.length/2;c++) {
		   
		    if(! arrayOfString[c].equals(arrayOfString[arrayOfString.length-c-1]) ) {
		    	
		    	return false;
		    }
		    
	   }
		return true;
		
	}
}
