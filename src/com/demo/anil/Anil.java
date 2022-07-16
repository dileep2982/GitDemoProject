package com.demo.anil;

public class Anil extends AnilParent {

	public static void main(String[] args) {
		study();
	}
	
	//@Override
	public static void study() {
		 System.out.println("oh no, I want to play music...so i wont study");
	}

}



class AnilParent{
	
	public static void study() {
		 System.out.println("Hey Anil, You need to complete your Btech from IIT- B");
	}
}
