package com.tns.interfaceex;

interface Car{
	void engine(); 
}
class Indica implements Car{

	@Override
	public void engine() {
		System.out.println("Indica Engine works properly");
		
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		Indica obj = new Indica();
		obj.engine();

	}

}
