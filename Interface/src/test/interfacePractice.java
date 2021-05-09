package test;

//implement like class but 
import test.Tests;

interface drinkWater {
 String water = "cold";
     void drinkWater();
     
    default  void eatFood() {
    	 System.out.println("ahmed");
     };
}

//when call interface should use implenments in class interfacePractice 
public class interfacePractice implements drinkWater{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(water);
   	interfacePractice ins = new interfacePractice();
   	
      ins.drinkWater();
      
      Tests  insTest= new Tests();
      insTest.drinkWater();
      
      ins.eatFood();

	}
 

	@Override
	public void drinkWater() {
		// TODO Auto-generated method 
	   System.out.println("Drink your "+water + " water");
	
	}
   
	@Override
	 public void eatFood() {
	     System.out.println("Afandy");
	 };
	

}
