package com.ahmed;

public  final  class ClassB extends ClassA{
	
	  
    public final void someMethod(int x){
        System.out.println("Some method.");
    }
    
    //error final doesn't have override feature
	//public final void someMethod() {
	///	System.out.println("Hello.");
	//}  

}
