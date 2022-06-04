package com.demo.app;

public class Test {
	
	public static String VersionNumber="1";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haveMoodToPlay = "yes";
		
		if(haveMoodToPlay.equals("yes")) {
			System.out.println("Lets play a game");
			System.out.println("Another sos in if this need to be decided");
		}
		else {
			System.out.println("No mood to play, so just sleep");
			System.out.println("Another sos..");//
		}
		System.out.println("**** The End ****");
		
		
	}

}
