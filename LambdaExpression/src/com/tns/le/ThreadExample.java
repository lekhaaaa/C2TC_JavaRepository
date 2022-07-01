package com.tns.le;

interface Lambdaa{
	public void run();
}

public class ThreadExample {

	public static void main(String[] args) {
		new Thread(
				() -> {System.out.println("I am a run method");}
				).start();;

	}

}
 