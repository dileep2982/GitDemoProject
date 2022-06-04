package com.demo.app;

public class Test {
	
	public static String VersionNumber="1";

	public static void main(String[] args) {

		String haveMoodToPlay = "yes";
		if(haveMoodToPlay.equals("yes")) {
			System.out.println("Lets play a game");
			System.out.println("Another sos in if: this should be master only");
		}else {
			System.out.println("No mood to play, so just sleep");
			System.out.println("Another sos..");//
		}
	}

}
