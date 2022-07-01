package com.tns.inheritance;

class Dad{
	void snoring() {
		System.out.println("Yes... I snore");
	}
}
class Mom{
	void snoring() {
		System.out.println("Yes... I do have the habit of snoring");
	}
}
class You extends Dad,Mom{
	void reading() {
		System.out.println("I love reading");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		

		You y = new You();
		y.reading();
		y.snoring();
	}

}
