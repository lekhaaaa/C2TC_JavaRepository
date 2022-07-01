package com.tns.superkeyword;

class Animall{
	void eat() {
		System.out.println("Animal is eating....!");
	}
}
class Dog extends Animall {

	void eat() {
		System.out.println("Dog is eating bread...!");
		
	}
	void bark() {
		System.out.println("Dog is barking...!");
	}
	void work() {
		super.eat();
		System.out.println("Dog is working...!");
	}
}
public class Method {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.work();

		
	}

}
