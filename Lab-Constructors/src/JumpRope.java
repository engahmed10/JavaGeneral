import java.lang.reflect.Constructor;

public class JumpRope {
	
	double length ;
	public JumpRope(double a) {
		
		length = a;
		
		System.out.println(a);
	}
    
	   JumpRope() {
		  System.out.println("No arg constructor ran.");
		  length =7.0;
	}
	
	public static void main(String[] args) {
		JumpRope jumup = new JumpRope(6.5);
		
		JumpRope jumpRopeNoArg = new JumpRope();
	}
	
	
	
}
