package com.tns.interfaceex;

interface sayable{
	static void display() {
		System.out.println("inside default method");
	}
	void saymore();
}
class defaultmethods implements sayable{

	@Override
	public void saymore() {
		System.out.println("I'm a override method");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		defaultmethods d = new defaultmethods();
		sayable.display();
		d.saymore();
		
	}

}
