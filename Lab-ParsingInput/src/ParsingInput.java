
import java.util.Scanner;

import java.util.*;
public class ParsingInput {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i< args.length;i++ ){
			
			System.err.println("Argument #" +i+ " "+ args[i]);
			
			Scanner in =new Scanner(System.in);
			String name;
			System.out.println("What is your  name?");
			name= in.nextLine();
			System.out.println("Hello, "+name+"!");
		

			
			System.out.println("How old are you?");
			int age = in.nextInt();
			System.out.println("Dang, "+age+" is old");
			
			
			//parsing string with wrapper classes  example:
			int example = Integer.parseInt("6");
		}

	}

}
