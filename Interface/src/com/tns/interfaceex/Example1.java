package com.tns.interfaceex;


interface Bike{
	void engine();
	
}
interface Bikee extends Bike{
	void getMileage();
}
class R15 implements Bikee{

	@Override
	public void engine() {
		System.out.println("In engine method");
	}

	@Override
	public void getMileage() {
		System.out.println("In getMileage method");
		
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Bikee obj = new R15();
		obj.getMileage();
		
		

	}

}
