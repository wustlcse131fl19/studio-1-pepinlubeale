package studio1;

import support.cse131.ArgsProcessor;

public class Hello {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("What's your name?");
		
		System.out.println("Hello " + name + ". How are you?");
	//	System.out.println("You seem to be feeling " + name);
	}

}
