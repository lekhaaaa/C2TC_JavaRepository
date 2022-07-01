package com.tns.superkeyword;

class Animal{
	String color ="White";

	
}
class Cat extends Animal{
	String color ="Black";
	public void printcolor(){
		System.out.println(super.color);
	}
}
public class Variable {

	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println(c.color); //black
		
		c.printcolor();
	}

}
