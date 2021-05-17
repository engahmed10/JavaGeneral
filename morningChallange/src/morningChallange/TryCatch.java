package morningChallange;

public class TryCatch {
	
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,5,6,8};
		try {
		   // int k = arr[8];
		//	System.out.println("k = "+k);
			System.out.println("in try 1");
			badmethod();
			System.out.println("in try 2");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("in catch");
		}finally {
			System.out.println("In finally");
		}
	}
	
	public static void badmethod() {
		// TODO Auto-generated method stub
		System.out.println("in method");
		throw new Error();

	}
	


}
