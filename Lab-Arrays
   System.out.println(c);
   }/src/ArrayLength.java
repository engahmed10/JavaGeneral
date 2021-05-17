import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLength {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		String arr1[] = {"3","5","7"};
		int array[][]= {{3,5,78,3,4,2},
				        {4,6}
		               };
		System.out.println(arr.length);
		boolean a= false;
		boolean b=true;
		 if( a )
		    {
		        System.out.println("A"); /* Line 5 */
		    }
		    else if(a && b) /* Line 7 */
		    {
		        System.out.println( "A && B");
		    }
		    else /* Line 11 */
		    {
		        if ( !b )
		        {
		            System.out.println( "notB") ;
		        }
		        else
		        {
		            System.out.println( "ELSE" ) ;
		        }
		    }
		 
		 String st[]= {"-100","50","0","56.6","90","0.12",".12","02.34","000.000"};


         for(int i = 0; i<st.length; i++) {
            for (int j = i+1; j<st.length; j++) {
               if(st[i].compareTo(st[j]) < 0) {
                  String temp = st[i];
                  st[i] = st[j];
                  st[j] = temp;
               }
            }
         }
         
         
         System.out.println(Arrays.toString(st));
         
         String gt=".18";
         
         
         String z= st[7].split("\\.")[0].concat("0");
       
         System.out.println(st[7]);
         st[7].replace(st[7],z);
         System.out.println(st[7]);
         
         System.out.println(gt.split("\\.")[0].concat("0"));
         System.out.println(gt);
         
         
        // for(int i = 0; i<st.length; i++) {
         StringBuilder sb = new StringBuilder(gt);

        	  System.out.println(sb.insert(0, "0"));
       //  }
         
         System.out.println(gt);
        // Double k=Double.valueOf(".12");
        // System.out.println(k);
         
        // System.out.println(st[0]);

		//Arrays.sort(st,Collections.reverseOrder());
		 
		//for(int i =0;i <st.length ;i++) {
		//	System.out.println(st[i]);

		//}
		 
		 // Collections.sort(st);
		// Array arr11=new Array<>();
		// LinkedList<Double> arr11= new LinkedList<>();
		// Double k=Double.valueOf("56.6");
		//System.out.println(k);
	//	 for(String s: st) {
			// 
      //  	Double p=Double.valueOf(s);
        //	arr11.add(p);

         //}
		 
		// LinkedList<Double> arr111= new LinkedList<>();
		 //Collections.sort(arr111, Collections.reverseOrder());
		
		 // arr11.getLast();
		 
		 
         //Arrays.sort(st);
		 
		// for(int ar: arr11) {
	        	// System.out.println(ar); 
	      //   }
		 
        // for(Double i: arr11) {
       // 	 System.out.println(i); 
      //   }
        
		}
	}

