package com.tns.interfaceex;

interface Father{
	void snoring();
}
interface Mother {
	void snoring();
	default void sleep() {
		System.out.println("I am sleeping...!");
	}
}
class You implements Father,Mother{

	@Override
	public void snoring() {
		System.out.println("I got the habit of snoring from my parents...!");	
	}
}
class Teacher1{
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		You y = new You();
		y.snoring();
		y.sleep();

	}

}
