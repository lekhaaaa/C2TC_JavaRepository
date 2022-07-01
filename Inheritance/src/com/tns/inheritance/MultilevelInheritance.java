package com.tns.inheritance;

class Animall{
	void eat() {
		System.out.println("eating...!");
	}
}
class Dog extends Animall{
	void bark() {
		System.out.println("Barking...!");
	}
}
class puppy extends Dog{
	void weep() {
		System.out.println("weeping....!");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		puppy p = new puppy();
		p.weep();
		p.bark();
		p.eat();

	}

}
