package com.tns.inheritance;

class Animal{
	void eat() {
		System.out.println("eating...!");
	}
}
class cat extends Animal{
	void meow() {
		System.out.println("Meowing...!");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Animal d = new cat();
		d.eat();

	}

}
