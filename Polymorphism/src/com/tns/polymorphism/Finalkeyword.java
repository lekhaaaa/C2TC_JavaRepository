package com.tns.polymorphism;

 class Car{
    final int speedlimit=90;
	final void change() {
		
		System.out.println(speedlimit);
	}
}
public class Finalkeyword {

	public static void main(String[] args) {
		Car b = new Car();
		b.change();
		System.out.println(b.speedlimit);

	}

}
