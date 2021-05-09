
public class Parrot {
	
	
	public static void main(String[] args ) {
		
	   Parrot parrot =new Parrot();
	   parrot.cry();
	   parrot.talk();
	   
	   String[] arr={"Howdy", "Polly", "wanna", "cracker"};
	   parrot.repeat(arr);
	 
	   int sum =  parrot.sumOfCracker(11,10);
	    System.out.println(sum);
	}
	
    public  void cry() {
    	System.out.println("Hey Mark");
    	
    }
    
    
    public void talk() {
		System.out.println("squawk");
	}
    
    public void repeat(String[] words) {
        for (int i = 0; i < words.length; i++) {
	            System.out.println(words[i]);
         }  
    }
    
    public int sumOfCracker(int stolenCrackers , int givenCrackers ) {
		return stolenCrackers + givenCrackers;
	}
}
