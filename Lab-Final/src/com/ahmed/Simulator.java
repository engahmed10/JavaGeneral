package com.ahmed;

public class Simulator {

	//final variable cnnot assign another value on it . 
	public final int x = 124;
	  
	
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		//fc.type ="New Value";
		//fc.ClassA = new ClassA();
		
		///polymorphic variable type ClassA is assigned to object type ClassB 
		ClassA instanceA =new ClassB();
		fc.classA.greeting ="New Greeting";
	}
	//cannot override
	public final void finalMethod() {
	
	}
}

//final  class mean mean cannot create subclass 
//public final class FinalClass() {}
