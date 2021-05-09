package com.ahmed;

public class TestProductEquality {
	
	public static void main(String[] args) {
		
		int[] myarr =new int[3];
		Product p1 = new Product(1);
		Product p2 = new Product(1);
		Object o =new Object();

		
		if(p1.equals(p2)) {
			System.out.println("The product are equal!");
			
		}else {
			System.out.println("The product are Not equal!");
		}
		
	    if (p1.equals(o)) {
            System.out.println("The objects are equal!");
        }else {
            System.out.println("The objects are NOT equal!");
        }
	    int a=5;
	    System.out.println(a<4 ? "a is greater" : "aa");
	     
	    int a1= 4;
	    if(a1 == 4) {
	    	
		    System.out.println(true);

	    }
	    
	} 
	

}
