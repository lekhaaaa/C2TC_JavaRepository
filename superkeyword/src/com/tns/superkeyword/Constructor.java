package com.tns.superkeyword;

class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
}
class Honda extends Bike{
	Honda(){
		super();
		System.out.println("Honda is created");
	}
}

public class Constructor {

	public static void main(String[] args) {
		Honda h = new Honda();
		

	}

}
