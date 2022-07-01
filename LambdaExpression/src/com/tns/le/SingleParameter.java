package com.tns.le;

interface Drawable{
	void demo(int radius);
	
}
public class SingleParameter {

	public static void main(String[] args) {
		Drawable s = (int radius) -> {
			
			System.out.println("Draw a circle with a radius of :" + radius);
			
			
		
		};

		s.demo(10);
		
	}

}
